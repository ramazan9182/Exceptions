package util.domain;

import util.exceptions.IllegalIdentifierException;
import util.exceptions.IllegalValueException;
import util.exceptions.NoSuchDataException;

public class SimpleMap {
	private static final int ID_INDEX = 0;
	private static final int VALUE_INDEX = 1;

	private Object[][] data;

	public SimpleMap(int size) {
		data = new Object[size][2];
		fillDataField(0, size);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	private int contains(String id) {
		for (int i = 0; i < data.length; i++) {
			if (id.equals(data[i][ID_INDEX])) {
				return i;
			}
		}
		return -1;
	}

	private int getDataIndex(String id) throws NoSuchDataException {
		int dataIndex = contains(id);
		if (dataIndex == -1) {
			throw new NoSuchDataException();
		}
		return dataIndex;
	}

	public Object getData(String id) throws NoSuchDataException {
		return data[getDataIndex(id)][VALUE_INDEX];
	}

	private void fillDataField(int from, int to) {
		for (int i = from; i < to; i++) {
			data[i] = new Object[] { null, null };
		}
	}

	private Object[][] resize() {
		Object[][] newData = new Object[data.length + 1][2];
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		return newData;
	}

	private int openDataField(String id) {
		for (int i = 0; i < data.length; i++) {
			if (data[i][0] == null) {
				data[i][0] = id;
				return i; // index
			}
		}
		// no such place
		Object[][] newData = resize();
		data = newData;
		fillDataField(data.length, newData.length);
		return openDataField(id); // recursive call ( !! )
	}

	public Object put(String id, Object value) throws IllegalValueException, IllegalIdentifierException {
		if (id == null) {
			IllegalIdentifierException identifierException = new IllegalIdentifierException();
			// TODO : init cause
			throw identifierException;
		}
		if (value == null) {
			IllegalValueException valueException = new IllegalValueException();
			valueException.initCause(new NullPointerException());
			throw valueException;
		}

		// TODO :: refactor
		int index = contains(id);
		if (index == -1) {
			index = openDataField(id);
		}
		
		Object oldValue = null;
		try {
			oldValue = getData(id);
		}catch (NoSuchDataException e) {
			throw new RuntimeException(e);
		}
			
		data[index][VALUE_INDEX] = value;
		return oldValue;
	}

}
