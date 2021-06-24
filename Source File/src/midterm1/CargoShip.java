/**
 * 
 */
package midterm1;

/**
 * @author michaelhannigan
 *
 */
public class CargoShip extends Ship{
	
	private int cargo;
	
	public CargoShip(){
		
	}
	
	public CargoShip(String iname,int iyear, int c) {
		super(iname, iyear);
		cargo = c;
	}
	
	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public String toString() {
		return "The name of the ship is "+super.getName()+". It was built in " + super.getYear()+". The cargo capactiy is "+cargo+".";
	}

}
