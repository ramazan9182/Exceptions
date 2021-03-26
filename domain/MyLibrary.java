package domain;

import java.io.IOException;

public class MyLibrary {

	
	public static void f() throws MyCustomException{
		
		System.out.println("f() is running ...");
		
		throw new MyCustomException("Something went wrong");
		
		// System.out.println("f() continue...."); // Unreachable
	}
	
	
	// multiple exception declaration
	
	public static void a() throws AnotherException,IOException {
		
		
	}
	
	
	public static void b() {
		throw new RuntimeException();
		
	}
	
	
	public static void c(A a) {
		a.doSomething();
	}
	
	
}
