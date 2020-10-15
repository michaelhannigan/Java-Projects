/**
 * 
 */
package midterm1;

/**
 * @author michaelhannigan
 *
 */
public class CruiseShip extends Ship{
	
	private int maxPassangers;
	
	
	CruiseShip(){
		
	}

	CruiseShip(String iname,int iyear, int maxp){
		super(iname, iyear);
		maxPassangers = maxp;
	}
	
	public int getMaxPassangers() {
		return maxPassangers;
	}

	public void setMaxPassangers(int maxPassangers) {
		this.maxPassangers = maxPassangers;
	}

	public String toString() {
		return "The name of the ship is "+super.getName()+". It was built in " + super.getYear()+" The max number of passangers is "+maxPassangers+".";
	}
}
