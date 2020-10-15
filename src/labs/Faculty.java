//Michael Hannigan Team 2
package labs;

public class Faculty extends Employee{
	//the faculty class extends the abstract superclass employee
	//creates faculty objects as employees
	
	//this is an enum of all of the possible levels of instruction
	enum Level{
		AS, AO, FU
	}
	
	//attributes
	private Education education;
	private Level lvl;
	
	//default contstructor
	public Faculty(){
		
	}
	
	//constructor with all of the arguments
	public Faculty(String ln, String fn, int id, Level lvl, Education ed) {
		super(ln, fn, id);
		this.education = ed;
		this.lvl = lvl;
		
	}
	
	//this method returns the id attribute
	public int getID() {
		return super.getID();
	}
	
	//this method returns the last name attribute
	public String getLastName() {
		return super.getLastName();
	}
	
	//this method returns the first name attribute
	public String getFirstName() {
		return super.getFirstName();
	}
	
	//this method takes in an int and sets it as the id attribute
	public void setID(int num) {
		super.setID(num);
	}
	
	//this method takes in a string and sets it as the last name attribute
	public void setLastName(String name) {
		super.setLastName(name);
	}
	
	//this method takes in a string and sets it as the first name attribute
	public void setFirstame(String name) {
		super.setFirstame(name);
	}
	
	//this method returns a double based on what level the faculty is
	@Override
	public double monthlyEarning() {
		// TODO Auto-generated method stub
		double amount = 0;
		switch(lvl) {
		case AS:
			amount = FACULTY_MONTHLY_SALARY;
			break;
			
		case AO:
			amount = FACULTY_MONTHLY_SALARY*1.5;
			break;
			
		case FU:
			amount = FACULTY_MONTHLY_SALARY*2.0;
			break;
		}
		return amount;
	}
	
	//this method creates a string that displays all of the attributes of the faculty class
	public String toString() {
		return "ID Employee number: " + this.getID()+"\n"+"Employee name: " + this.getFirstName()+" "+this.getLastName()
		+ "\n"+ this.lvl +" Professor where "+ this.lvl+ " can be Assistant, Associate or Full"+"\n"+"Monthly Salary: "+ this.monthlyEarning();
	}
	
	//this method is used in the comparable interface in the main tester function in order to sort
	public int compareTo(Employee o) {
		return o.getLastName().compareTo(this.getLastName());
	}

}
