package restrictions.main;

import restrictions.domain.AException;
import restrictions.domain.Library;

public class DriverCatchMapping {

	public static void main(String[] args) {

		try {
			Library.g();
		} 
		catch (AException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
