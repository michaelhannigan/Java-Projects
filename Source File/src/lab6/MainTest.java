/**
 * 
 */
package lab6;

import java.util.ArrayList;

/**
 * @author michaelhannigan
 * This is the tester class for lab 6
 */
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This creates an array list of courses
		ArrayList<Course> myCourses = new ArrayList<Course>();
		
		//These are all the courses to be added to myCourses
		Course c1 = new Course("CECS277", new Grade("B"));
		Course c2 = new Course("CECS341", new Grade("C"));
		Course c3 = new Course("CECS328", new Grade("A"));
		Course c4 = new Course("CECS282", new Grade("D"));
		Course c5 = new Course("ENGR350", new Grade("F"));
		Course c6 = new Course("ANTH100", new Grade("A"));
		
		//all the courses are added to the array list
		myCourses.add(c1);
		myCourses.add(c2);
		myCourses.add(c3);
		myCourses.add(c4);
		myCourses.add(c5);
		myCourses.add(c6);
		
		//Creates a new report card by creating new student and passing myCourses
		ReportCard rc = new ReportCard(new Student("Michael"), myCourses);
		
		//Prints the report card
		System.out.println(rc.toString());
			

	}

}
