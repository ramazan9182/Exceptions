package trywithresource;

public class VeryImportantResource implements AutoCloseable {

	@Override
	public void close() throws Exception {

		System.out.println("Very Important Resource is CLOSED.");

	}

}
