/**
 * 
 */
package lab6;

/**
 * @author michaelhannigan
 * This class creates a grade for a student
 */
public class Grade {
	/**
	 * Attributes
	 */
	String letterGrade;
	double pointValue;
	
	/**
	 * No arg constructor
	 */
	public Grade() {
		
	}
	/**
	 * Constructor
	 * @param lg
	 */
	public Grade(String lg) {
		this.letterGrade = lg;
	}
	/**
	 * This method returns the letter grade attribute
	 * @return String
	 */
	public String getLetterGrade() {
		return letterGrade;
	}
	/**
	 * This method sets the letterGrade attribute
	 * @param letterGrade
	 */
	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}
	/**
	 * This method returns the double value associated with
	 * the letter grade
	 * @return double
	 */
	public double getPointValue() {
		switch(letterGrade) {
		case "A":
			pointValue = 4.0;
			break;
		case "B":
			pointValue = 3.0;
			break;
		case "C":
			pointValue = 2.0;
			break;
		case "D":
			pointValue = 1.0;
			break;
		}
		return pointValue;
	}
	/**
	 * This method sets the point value attribute
	 * @param pointValue
	 */
	public void setPointValue(double pointValue) {
		this.pointValue = pointValue;
	}
	
	
	
}
