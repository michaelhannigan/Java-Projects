//Michael Hannigan Team 2
package labs;

public abstract class Employee implements EmployeeInfo, Comparable<Employee>{
	// the employee class is an abstract class to help build other classes that
	//extend the employee class
	
	
	//these are the attributes for Employee class
	private String lastName;
	private String firstName;
	private int idNum;
	
	//empty contstructor
	public Employee() {
		
	}             
	//Argument constructor
	public Employee(String ln, String fn, int id) {
		this.lastName = ln;
		this.firstName = fn;
		this.idNum = id;
	}
	//toString method
	public String toString() {
		return "ID Employee number:"+idNum+"\n"
				+"Employee name: "+ firstName + " "+lastName;
	}
	//this method returns the last name
	public String getLastName() {
		return lastName;
	}
	
	//this method returns the first name
	public String getFirstName() {
		return firstName;
	}
	
	//this method returns the employee id
	public int getID() {
		return idNum;
	}
	
	//this method takes in a string and sets it as the last name
	public void setLastName(String name) {
		lastName = name;
	}
	
	//this method takes in a string and sets it as the first name
	public void setFirstame(String name) {
		firstName = name;
	}
	
	//this method takes in an int and sets it as the ID
	public void setID(int id) {
		idNum = id;
	}
	
	//this method takes in an employee object to compare using the comparable interface
	//in the tester method
	public int compareTo(Employee o) {
		return o.getLastName().compareTo(this.getLastName());
	}
	
	//this is an abstract method to be calculated by all other subclasses
	public abstract double monthlyEarning();
	

}
