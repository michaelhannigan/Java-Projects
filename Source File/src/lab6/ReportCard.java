/**
 * 
 */
package lab6;

import java.util.ArrayList;

/**
 * @author michaelhannigan
 * This class creates a report card for a student
 */
public class ReportCard {
	/**
	 * Attributes
	 */
	Student student;
	ArrayList<Course> courses = new ArrayList<Course>();
	/**
	 * No arg constructor
	 */
	public ReportCard() {
		
	}
	/**
	 * 
	 * Constructor
	 * @param s
	 * @param courses
	 */
	public ReportCard(Student s, ArrayList<Course> courses) {
		this.student = s;
		this.courses = courses;
	}
	/**
	 * This method calculates the total GPA given all the courses and Grade values
	 * @return double
	 */
	public double gpaCalculator() {
		double total = 0;
		for(Course c:courses) {
			total +=c.getGradeValue();
		}
		
		double GPA = total/ courses.size();
		return Math.round(GPA*100.0)/100.0;
		
	}
	/**
	 * This method returns the student attribute
	 * @return Student
	 */
	public Student getStudent() {
		return student;
	}
	/**
	 * This method sets the student attribute 
	 * @param student
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	/**
	 * This method returns the courses attribute
	 * @return ArrayList<Course>
	 */
	public ArrayList<Course> getCourses() {
		return courses;
	}
	/**
	 * This method sets the courses attribute 
	 * @param courses
	 */
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	/**
	 * This method returns a string of all of the attributes 
	 * as well as the GPA calculator method
	 * 
	 */
	public String toString() {
		String output = " ";
		output += "\nNAME: " +student.getName()+"\n";
		output+="\n---Coursework---\n";
		for(Course c:courses)
			output +=c.getCourse()+"\t" + c.getLetterGrade()+"\n";
		return output+= "\nGPA: " + gpaCalculator();
		}
	
	

	
	
	
}
