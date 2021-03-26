package util.main;

import util.domain.SimpleMap;
import util.exceptions.IllegalIdentifierException;
import util.exceptions.IllegalValueException;
import util.exceptions.NoSuchDataException;

public class Driver {

	
	public static void main(String[] args) {
		
		SimpleMap map = new SimpleMap(2);
		
		try {
			map.put("1", 1);
			map.put("2", 2);
			map.put("3", 4);
			System.out.println(map.getData("3"));
			Object oldValue = map.put("3", 45);
			System.out.println(oldValue);
			
			/** JAVA 1.7 Multiple Catch Surrounding **/
		} catch (IllegalValueException | IllegalIdentifierException e) {
			e.printStackTrace();
		} catch (NoSuchDataException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
