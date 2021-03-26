package trywithresource;

/**
 * SINCE JAVA 1.7
 *
 */
public class DriverTryWithResources {

	public static void main(String[] args) {
		try(VeryImportantResource resource = new VeryImportantResource();){
			// AUTOCLOSABLE resources will be closed automatically by JAVA at the end of TRY scope.
		}catch (Exception e) {
			// HANDLE the exception in your business way.
		}
	}

}
