//Michael Hannigan Team 2
package labs;

public class Staff extends Employee{
	//the staff class extends the abstract superclass employee
	//creates staff objects as employees
	
	
	// attributes
	private double hourlyRate = 0;
	
	//empty constructor
	public Staff() {
		
	}
	
	//constructor w/arguments
	public Staff(String lastName, String firstName, int idNum, int hr) {
		super(lastName, firstName, idNum);
		this.hourlyRate = hr;
	}
	
	//this method returns a string desplaying all of the attributes of Staff
	public String toString() {
		return "ID Employee number:"+super.getID()+"\n"
				+"Employee name: "+ super.getFirstName()+ " "+super.getLastName()+"\n"+"Full time"+"\n"+"Monthly Salary:"+this.monthlyEarning();
	}
	
	//this method returns the staff object's last name
	public String getLastName() {
		return super.getLastName();
	}
	
	//this method returns the staff object's first name
	public String getFirstName() {
		return super.getFirstName();
	}
	
	//this method returns the staff object's hourly rate
	public double getHourlyRate() {
		return this.hourlyRate;
	}
	
	//this method receives a string and sets it to the staff object's last name
	public void setLastName(String name) {
		super.setLastName(name);
	}
	
	//this method receives a string and sets it to the staff object's first name
	public void setFirstame(String name) {
		super.setFirstame(name);
	}
	
	//this method receives a double and sets it to the staff object's hourly rate
	public void setHourlyRate(double hr) {
		this.hourlyRate = hr;
	}
	
	//this returns the monthly earnings of the staff member
	public double monthlyEarning() {
		return hourlyRate*STAFF_MONTHLY_HOURS_WORKED;
	}

	//Sets the compareTo function for the comparable interface in the main tester class
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return o.getLastName().compareTo(this.getLastName());
	}

}
