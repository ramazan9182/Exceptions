package main;

import domain.ExceptionLog;
import domain.MyCustomException;
import domain.MyLibrary;

public class DriverCatchingException {

	
	public static void main(String[] args){
		
		try {
			
			
			MyLibrary.f();
			
			
		} catch (MyCustomException e) {
			// Termination / Resumption ?
			
			e.printStackTrace();
			
			ExceptionLog exceptionLog = new ExceptionLog();
			exceptionLog.setName("");
			exceptionLog.setExceptionMessage(e.getMessage());
			// TODO : save to DB/File/Email/Notification
			
			
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			
			
			// Programmatic Way to access Stack Trace
			for(StackTraceElement element : e.getStackTrace()) {
				System.out.println(element.getClassName() + " : " + element.getMethodName() +" ---> " + element.getLineNumber());
			}
			
		}// END OF CATCH
		
	}
}
