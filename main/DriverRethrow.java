package main;

import java.io.IOException;

import domain.AnotherException;
import domain.MyCustomException;
import domain.MyLibrary;
import domain.SomethingWentWrongException;

public class DriverRethrow {

	public static void main(String[] args) throws SomethingWentWrongException,MyCustomException {

//		try {

		try {

			MyLibrary.f();

			MyLibrary.a();
		}

		catch (AnotherException e) {
			System.out.println("Exception");
		} catch (MyCustomException e) {
			System.out.println("MyCustomException");
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
			
			SomethingWentWrongException wentWrongException = new SomethingWentWrongException();
			wentWrongException.initCause(e.getCause());
			throw wentWrongException;
			
		} catch (Exception e) {

		}

//		} catch (Exception e) {
		// TODO: handle exception
//		}

	}
}
