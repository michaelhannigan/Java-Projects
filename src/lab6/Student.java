/**
 * 
 */
package lab6;

/**
 * @author michaelhannigan
 * This class creates a student
 */
public class Student {
	/**
	 * Attribute 
	 */
	String name;
	/**
	 * No arg constructor
	 */
	public Student() {
		
	}
	/**
	 * This is the constructor
	 * @param n
	 */
	public Student(String n) {
		this.name = n;
	}
	/**
	 * This method returns the name attribute
	 * @return String
	 */
	public String getName() {
		return name;
	}
	/**
	 * This method sets the name attribute
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
