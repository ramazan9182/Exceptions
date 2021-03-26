package pitfall.main;

import pitfall.domain.Library;

public class DriverPitfall {
	
	public static void main(String[] args) {
		
//		try {
//			
//		}finally {
//			
//		}
		
		try {
			try {
				Library.f();
				// ( !!! )	
			}finally {
				// ( !!! )
				Library.h();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
