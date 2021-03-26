package trywithresource;


/**
 * SINCE JAVA 1.7
 *
 */
public class DriverBeforeTryWithResources {

	
	public static void main(String[] args) {
		
		VeryImportantResource resource = null;
		
		try{
			resource = new VeryImportantResource();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resource != null) {
					resource.close();	
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
