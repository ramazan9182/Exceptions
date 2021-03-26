package domain;

public class MyCustomException extends Exception{

	//private String name;
	public MyCustomException(String message) {
		super(message);
	}
}
