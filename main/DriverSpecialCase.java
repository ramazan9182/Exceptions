package main;

import domain.A;
import domain.MyLibrary;

/**
 * SPECIAL CASE : RuntimeException
 *
 */

public class DriverSpecialCase {

	private static A a;

	public static void main(String[] args) {

//		throw new MyCustomException("message");

//		MyLibrary.b();

		int[] numbers = new int[3];
		
		numbers[4] = 9;

		// ...

		MyLibrary.c(a);

	}
}
