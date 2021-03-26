package main;

import java.io.File;
import java.io.FileNotFoundException;

import domain.MyIOLibrary;

public class DriverFinally {

	
	public static void main(String[] args) {
		
		// Starting File Read 
		try {
			MyIOLibrary.read(new File(""));
//			MyIOLibrary.close();
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
//			MyIOLibrary.close();
			throw new RuntimeException();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
//			MyIOLibrary.close();
//			while(true);
			return;
		}
		finally {
			System.out.println("Finally");
			MyIOLibrary.close();
		}
	
	}
	
	
}
