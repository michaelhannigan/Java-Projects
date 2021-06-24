//Michael Hannigan Team 2
package labs;



public class Partime extends Staff{
	//the partime class extends the abstract superclass employee
	//creates partime objects as employees
	
	//attributes
	double hoursWorkedPerWeek = 0;

	//default constructor
	public Partime() {
		// TODO Auto-generated constructor stub
		
	}
	//constructor with all of the arguments as attirbutes
	public Partime(String ln, String fn, int id, int hr, double hrs) {
		super(ln,fn,id,hr);
		this.hoursWorkedPerWeek = hrs;
		
	}
	
	//this method returns a string of all of the attributes of partime class
	public String toString() {
		return "ID Employee number:"+super.getID()+"\n"
				+"Employee name: "+ super.getFirstName()+ " "+super.getLastName()+"\n"+"Hours worked per month: "+this.hoursWorkedPerWeek*4+
				"\n"+"Monthly Salary:"+this.monthlyEarning();
	}
	
	//this method returns a string as the last name attribute
	public String getLastName() {
		return super.getLastName();
	}
	
	//this method returns a string as the first name attribute
	public String getFirstName() {
		return super.getFirstName();
	}
	
	//this method takes in a string and sets it as the last name attribute
	public void setLastName(String name) {
		super.setLastName(name);
	}
	
	//this method takes in a string and sets it as the first name attribute
	public void setFirstame(String name) {
		super.setFirstame(name);
	}

	//this method returns a double of how much the partime employee makes in a month
	public double monthlyEarning() {
		return super.getHourlyRate()*this.hoursWorkedPerWeek*4;
	}
	
	//this method helps the comparable interface sort the objects in the main tester file
	public int compareTo(Employee o) {
		return o.getLastName().compareTo(this.getLastName());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Partime p = new Partime("Hannigan", "Michael", 123, 15, 4);
		System.out.print(p.toString());
	}
	

}
