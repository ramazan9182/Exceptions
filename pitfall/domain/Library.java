package pitfall.domain;

public class Library {
	
	
	public static void f() throws VeryImportantException {
		System.out.println("Library.f()");
		throw new VeryImportantException();
	}
	
	public static void h() throws HeheheException{
		System.out.println("Library.h()");
		throw new HeheheException();
	}

}
