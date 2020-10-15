/**
 * 
 */
package Project4IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author michaelhannigan, Krimika Krimeete, Carl Borillo
 *
 */
public class FileInput{
	static PrintWriter printWriter;
	/**
	 * @param args
	 *  
	 */
	
	/**
	 * This method takes in a string and sees if it is an integer 
	 * or if it is not. It trys and catches NumberFormatException
	 * as well as NullPointerException and returns false. It tries
	 * Integer.ParseInt and returns true if nothing is caught.
	 * @param str (String)
	 * @return false if catches exception and true if it parses integer
	 */
	public static boolean isInt(String str) {
	    try { 
	        Integer.parseInt(str); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    
	    return true;
	}
	
	/**
	 * This method takes in a string and parses it to validate the date
	 * @param scan (String)
	 * @return false if it is not in the correct format and true if it is
	 */
	static public boolean dateVal(String scan) {
		//checks to see if there are forward slashes in the date
		if(!scan.contains("/")) {
			System.out.println("You need to use / to seperate month day and year");
			return false;
		}
		
		String[] date = scan.split("/");
		
		//makes sure there is a correct amount of integers put in the date
		if(date.length>3) {
			System.out.println("You did not use the correct amount of '/'s in your date.");
			return false;
		}
			
		
		// Calls isInt to test to see if the string is an integer
		if(!isInt(date[0])) {
			System.out.println("You did not enter an integer for the day.");
			return false;
		}
			
		//creates an integer from the string	
		int num = Integer.parseInt(date[0]);
		
		if(num<1 || num>12) {
			System.out.println("You need to input a month between 1-12.");
			return false;
		}
		
		// Calls isInt to test to see if the string is an integer
		if(!isInt(date[1])) {
			System.out.println("You did not enter an integer for the day.");
			return false;
		}
			
		//creates an integer from the string
		num = Integer.parseInt(date[1]);
		
		//checks if the integer is within the allowable day range
		if(num<1 || num>31) {
			System.out.println("You need to input a day between 1-31.");
			return false;
		}
		
		//checks to see if the final number is an integer
		if(!isInt(date[2])) {
			System.out.println("You did not enter an integer for the year.");
			return false;
		}
		
		//creates an integer from the string
		num = Integer.parseInt(date[2]);
		
		if(num<2000 || num>2020) {
			System.out.println("You need to input a day between 2000-2020.");
			return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-      generated method stub
		
		//creates a set to hold all acceptable services
		HashSet<String> serviceSet = new HashSet<String>();
		serviceSet.add("Confrence");
		serviceSet.add("Lodging");
		serviceSet.add("VIP");
		serviceSet.add("Breakfast");
		serviceSet.add("Lunch");
		serviceSet.add("Dinner");
		
		
		//try catch
		FileWriter writer = null;
		try {
			writer = new FileWriter("sales.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
        printWriter = new PrintWriter(writer);
		for(;;) {
			
			Scanner scanner  = new Scanner(System.in);
	        //taking in client
			System.out.print("Enter the name of the client: ");
			System.out.println();
			
			
			//writes input to file
			printWriter.print(scanner.nextLine()+";");
			
			
			System.out.print("Enter the service sold:");
			scanner  = new Scanner(System.in);
			System.out.println();
			
			//input validation for the amount
			String service = scanner.next();
			
			while(!serviceSet.contains(service)) {
				System.out.println("You need to enter a service of the following:"
						+ "Confrence, Lodging, VIP, Breakfast, Lunch, Dinner");
				scanner = new Scanner(System.in);
				service = scanner.next();
			}
			
			printWriter.print(service+";");
			
			
			System.out.print("Enter the amount of the sale: ");
			scanner  = new Scanner(System.in);
			System.out.println();

			
			//input validation for the amount
			while(!scanner.hasNextDouble()) {
				System.out.println("You need to enter a double data type: ");
				scanner = new Scanner(System.in);
			}
			String sale = String.format("%.2f;", scanner.nextDouble());
			printWriter.print(sale);
			
			System.out.print("Enter the date of the event: ");
			scanner  = new Scanner(System.in);
			System.out.println();
			
			

			String date = scanner.nextLine();
				
			while(!dateVal(date)) {
			System.out.println("Make sure you enter a valid date with format M/D/YYYY.");
			scanner = new Scanner(System.in);
			date = scanner.nextLine();
			}
			
			printWriter.print(date);
			
			System.out.println("Press 'Q' to quit or any other key to continue");
			scanner  = new Scanner(System.in);
			String loopControl = scanner.next();
			loopControl.toLowerCase();
			if(loopControl.equals("q")) 
				break;
			
			printWriter.println();
			continue;
				
		}
		
		printWriter.close();
	
	}

}
