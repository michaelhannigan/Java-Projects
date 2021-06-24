/**
 * 
 */
package lab6;

/**
 * @author michaelhannigan
 * This class creates a course that a student would take
 */
public class Course {
	/**
	 * Attributes
	 */
	String course;
	Grade grade;
	/**
	 * No arg constructor
	 */
	public Course() {
		
	}
	/**
	 * Constructor
	 * @param c course
	 * @param g grade
	 */
	public Course(String c, Grade g) {
		this.course = c;
		this.grade = g;
	}
	/**
	 * This method returns the course attribute
	 * @return String
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * This method sets the course
	 * @param c
	 */
	public void setCourse(String c) {
		this.course = c;
	}
	/**
	 * This method get the grade
	 * @return Grade
	 */
	public Grade getGrade() {
		return grade;
	}
	/**
	 * This method sets the grade
	 * @param grade
	 */
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	/**
	 * This method returns the letterGrade from grade
	 * @return String
	 */
	public String getLetterGrade() {
		return grade.getLetterGrade();
	}
	/**
	 * This method gets the gradeValue from the grade object
	 * @return double
	 */
	public double getGradeValue() {
		return grade.getPointValue();
	}
	

}
