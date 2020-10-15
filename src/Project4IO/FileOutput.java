/**
 * 
 */
package Project4IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/**
 * @author michaelhannigan, Krimika Krimeete, Carl Borillo
 *
 */
public class FileOutput {

	/**
	 * @param args
	 */
	static PrintWriter printWriter;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a hash map to store the contents of each type of service
		HashMap<String, LinkedList<String>> map = new HashMap<String,LinkedList<String>>();
		
		//command line input
		String fileInput = args[0];
		
		
		
        //Gets the file to be scanned
		File file = new File(fileInput); 
		Scanner scan = null;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		//populates the hash map with correct data
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			//splits each line in the file by the semicolon
			String[] tokens = line.split(";");
			//gets the service and creates the variable
			String service = tokens[1];
			//if the map contains the service as a key already it adds the line to the link list assigned to that key
			if(map.containsKey(service)) {
				LinkedList list = map.get(service);
				list.addLast(line);
				map.put(service, list);
			}
			//if the map does not contain the service as a key then a new linked list is created for that key
			else {
				LinkedList<String> createdList = new LinkedList<String>();
				createdList.addFirst(line);
				map.put(service, createdList);
			}
		}

		//iterating through the map by each key and adds each member of the link list
		//for each key to a new file named the key(service)
		for(Map.Entry<String, LinkedList<String>> entry: map.entrySet()) {
			LinkedList<String> valueList = entry.getValue();
			String filename = entry.getKey()+".txt";
			FileWriter writer = null;
			try {
				writer = new FileWriter(filename);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        printWriter = new PrintWriter(writer);
	        
			//iterates through each value in the linked list and adds it to the file
	        for(String value: valueList) {
				printWriter.println(value);
			}
	        
	        //closes the file
	        printWriter.close();
		}
	}

}
