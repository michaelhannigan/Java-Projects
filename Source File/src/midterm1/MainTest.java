/**
 * 
 */
package midterm1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import labs.Employee;

/**
 * @author michaelhannigan
 *
 */
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ship s1 = new Ship("Ship", 1996);
		Ship s2 = new Ship("Ship B", 1999);
		CruiseShip cruise1 = new CruiseShip("Cruise Ship", 2000, 1000);
		CruiseShip cruise2 = new CruiseShip("Cruise Ship B", 2004, 1000);

		CargoShip cargo1 = new CargoShip("Cargo Ship", 2020, 50);
		CargoShip cargo2 = new CargoShip("Cargo Ship B", 2020, 100);

		
		ArrayList<Ship> array = new ArrayList<Ship>();
		array.add(s1);
		array.add(s2);
		array.add(cruise1);
		array.add(cruise2);
		array.add(cargo1);
		array.add(cargo2);
		
		Collections.sort(array);
		
		for(int i = 0; i<array.size();i++) {
			System.out.println(array.get(i).toString());
		}
	}

}

