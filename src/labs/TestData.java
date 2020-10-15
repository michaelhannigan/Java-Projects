//Michael Hannigan Team 2

package labs;

import java.util.Comparator;

import labs.Faculty.Level;

import java.util.ArrayList;
import java.util.Collections;
public class TestData{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employee = new ArrayList<Employee>();
		
		//Here staff objects are created and added to an array list and the toString method is called
		//and they are all printed
		System.out.println("THIS IS STAFF: ");
		System.out.println("///////////////////////////////");
		
		employee.add(new Staff("Allen", "Pita", 123, 50));
		employee.add(new Staff("Zapata", "Steven", 456, 35));
		employee.add(new Staff("Rios", "Enrique", 789, 40));
		
		ArrayList<Employee> staff = new ArrayList<Employee>();
		double totalSalaryStaff = 0;
		for(Employee s:employee) {
			if(s instanceof Staff) {
				System.out.println(s.toString());
				staff.add(s);
				totalSalaryStaff += s.monthlyEarning();
			}
			
		
		}
		
		//Here the staff objects are printed in ascending order of their ID
		Collections.sort(staff, new SortByID());
		System.out.println();
		System.out.println("THIS IS STAFF SORTED BY ID:");
		System.out.println("///////////////////////////////");
		
		for(int j=0; j<staff.size();j++) {
			System.out.println(staff.get(j).toString());
			System.out.println();
		}
		
		//Here all the staff objects are printed in decending order by last name
		System.out.println("THIS IS STAFF SORTED BY LASTNAME:");
		System.out.println("///////////////////////////////");
		
		//calling the collecitons interface and using the comparTo method inside the class to sort
		Collections.sort(staff);
		
		for(Employee s:staff) {
			System.out.println(s.toString());
			System.out.println();
		}
		
		Faculty f1 = new Faculty("Johnson", "Anne", 243, Level.FU, new Education("Ph.D", "Engineering", 3));
		Faculty f2 = new Faculty("Bouris", "William", 791, Level.AO, new Education("Ph.D", "English", 1));
		Faculty f3 = new Faculty("Andrade", "Christopher", 623, Level.AS, new Education("MS", "Physical Education", 0));
		
		
		ArrayList<Employee> faculty = new ArrayList<Employee>();
		employee.add(f1);
		employee.add(f2);
		employee.add(f3);
		
		//Here faculty objects are created and added to an array list and the toString method is called
		//and they are all printed
		System.out.println("THIS IS FACULTY:");
		System.out.println("///////////////////////////////");
		double totalSalaryFaculty = 0;
		for(Employee f:employee) {
			if(f instanceof Faculty) {
				System.out.println(f.toString());
				System.out.println();
				faculty.add(f);
				totalSalaryFaculty += f.monthlyEarning();
			}
			
		}
		
		//Here the staff objects are printed in ascending order of their ID
		System.out.println();
		System.out.println("THIS IS FACULTY SORTED BY ID:");
		System.out.println("///////////////////////////////");
		
		Collections.sort(faculty, new SortByID()); 
		
		for(int b = 0; b<faculty.size(); b++) {
			System.out.println(faculty.get(b).toString());
			System.out.println();
		}
		
		//Here all the faculty objects are printed in decending order by last name
		System.out.println("THIS IS Faculty SORTED BY LASTNAME:");
		System.out.println("///////////////////////////////");
		
		//calling the collecitons interface and using 
		//the comparTo method inside the class to sort
		Collections.sort(faculty);
		
		for(Employee f:faculty) {
			System.out.println(f.toString());
			System.out.println();
		}
		
		//Here partime objects are created and added to an array list and the toString method is called
		//and they are all printed
		System.out.println("THIS IS PARTIME:");
		System.out.println("///////////////////////////////");

		Partime p1 = new Partime("Guzman", "Augusto", 455, 35, 30);
		Partime p2 = new Partime("Depirro", "Maritn", 678, 30, 15);
		Partime p3 = new Partime("Aldaco", "Marque", 945, 20, 35);
		
		ArrayList<Employee> partime = new ArrayList<Employee>();
		employee.add(p1);
		employee.add(p2);
		employee.add(p3);
		double totalSalaryPartime=0;
		for(Employee p:employee) {
			if(p instanceof Partime) {
			System.out.println(p.toString());
			System.out.println();
			partime.add(p);
			totalSalaryPartime +=p.monthlyEarning();
			}
		}
		System.out.println("This is the total monthly salary for part time staff:"+totalSalaryPartime);
		//Here the staff objects are printed in ascending order of their ID
		Collections.sort(partime, new SortByID());
		System.out.println("THIS IS PARTIME SORTED BY ID:");
		System.out.println("///////////////////////////////");
		for(int c = 0; c<partime.size(); c++) {
			System.out.println(partime.get(c).toString());
			System.out.println();
		}
		
		//Here all the partime objects are printed in decending order by last name
		System.out.println("THIS IS PARTIME SORTED BY LASTNAME:");
		System.out.println("///////////////////////////////");
		
		//calling the collecitons interface and using
		//the comparTo method inside the class to sort
		Collections.sort(employee);
		
		for(Employee p:employee) {
			if(p instanceof Partime) {
				System.out.println(p.toString());
				System.out.println();
			}
			
		}
		
		System.out.println("///////////////////////////");
		System.out.println("This is total salary of part time staff:"+totalSalaryPartime);
		double totalSalaryEmployee = totalSalaryStaff+totalSalaryPartime+totalSalaryFaculty;
		System.out.println("This is total salary of all employees:"+totalSalaryEmployee);

		
	}
		
		

	

	static class SortByID implements Comparator<Employee>{
		// this class implements the comparator interface to create a compare method
		
		//this compare method takes in two employee objects and returns an integer. 
		// -1 for if it's less, 0 if they are equal, and 1 if it is greater
		//these are all calls from the getID method inside the employee class
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getID()-o2.getID();
		}
		
	}
	


		
	}

