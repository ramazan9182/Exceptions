package restrictions.domain;

import java.io.FileNotFoundException;

public class Library extends AbstractLibrary{
	
	
	@Override
	public void f() throws BException,FileNotFoundException{
		
		throw new BException();
	}
	
	
	public static void g() throws BException {
		throw new BException();
	}
	
	
	// IT'S ALSO OK 
	
//	@Override
//	public void f(){
//		
//	}

}
