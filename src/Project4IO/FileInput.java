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
	 * @throws IOException 
	 */
	
	static public boolean dateVal(Scanner scanner) {
//		String[] dateArray = scanner.nextLine().split("/");
		scanner.useDelimiter("/");
		
		if(!scanner.hasNextInt())
			return false;
			
		int num = scanner.nextInt();
		System.out.println(num);
		
		if(num<1 || num>12)
			return false;
		
//		if(scanner.next()!= "/")
//			return false;
		
		if(!scanner.hasNextInt())
			return false;
		
		num = scanner.nextInt();
		System.out.println(num);
		
		if(num<1 || num>31)
			return false;
		
		try {
	        num = scanner.nextInt();
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
		
		

//		if(scanner.next() != "/")
//			return false;
		System.out.println(num);
		
		if(num<2000 || num>2020)
			return false;
		
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
	        //taking in client
			System.out.print("Enter the name of the client: ");
			System.out.println();
			Scanner scanner  = new Scanner(System.in);
			
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
			
			while(!dateVal(scanner)) {
				System.out.println("Make sure you enter a valid date with format M/D/YYYY.");
			scanner = new Scanner(System.in);
		}
			
			printWriter.print(scanner.nextLine());
			
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
