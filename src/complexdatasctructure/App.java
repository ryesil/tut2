package complexdatasctructure;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {

	public static String[] vehicles= {
			"ambulance","helicopter","lifeboat"
	};
	public static String[][] drivers= {
			{"Fred","Sue","Pete"},
			{"Sue","Richard","Bob","Fred"},
			{"Pete","Mary","Bob"}
	};
	public static void main(String[] args) {
		Map<String,Set<String>> personnel=new HashMap<>();// we dont want repeated elements.
		for(int i=0;i<vehicles.length;i++) {
			String vehicle=vehicles[i];
			String[] driversList=drivers[i];
			Set<String> driverSet=new LinkedHashSet<>();
			for(String driver:driversList) {
				driverSet.add(driver);
			}
			personnel.put(vehicle, driverSet);
		}
		{ //Brackets just to scope driversList variable so can use again later
	// example usage
		Set<String> driversList=personnel.get("helicopter");  //we can use driversList again because the first one is in the loop so its scope is inside the loop.
		for(String driver: driversList) {
			System.out.println(driver);
		}// we do the extra braces for driversList to be scoped to the outer braces.
		}
		//Iterate through whole thing
		for(String vehicle: personnel.keySet()) {
			System.out.print(vehicle);
			System.out.print(": ");
			Set<String> driversList=personnel.get(vehicle);
			for(String driver: driversList) {
				System.out.print(driver);
				System.out.print(", ");
			}
			System.out.println();
		}
		
	}
	
}
