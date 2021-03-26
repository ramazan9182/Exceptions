package domain;

import java.io.File;
import java.io.IOException;

public class MyIOLibrary {
	
	public static void read(File file) throws IOException {
		System.out.println("MyIOLibrary.read()");
		throw new IOException();
	}
	
	public static void close() {
		System.out.println("MyIOLibrary.close()");
	}
}
