package functionalProgrammingExamples;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		System.out.println("### Supplier returning a String ###");
		System.out.println(getDBConnectionUrl () );
		System.out.println(getHostAddress.get());
		
		System.out.println("### Supplier returning a List ###");
		System.out.println(getAddressList.get());
		
		

	}

	
	static Supplier<String> getHostAddress = () -> {
		try {
			return Inet4Address.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return null;
	};
	
	static Supplier<List<String>> getAddressList = () -> Arrays.asList("address1", "address2");
			
	
	static String getDBConnectionUrl () {
		try {
			return Inet4Address.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {	
			e.printStackTrace();
		}
		return null;
	}
}
