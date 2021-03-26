package main;

import domain.MyCustomException;
import domain.MyLibrary;

public class DriverMyCustomException {

	
	public static void main(String[] args) {
		
		try {
			
			MyLibrary.f();	
		
		
		} 
		
		
		catch (MyCustomException e) {
			
			e.printStackTrace();
			// LOG
//			System.out.println("Catched !!");
			
		}
		
	}
	
}
