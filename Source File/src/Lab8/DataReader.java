/**
 * 
 */
package Lab8;

/**
 * @author michaelhannigan
 *
 */

	import java.util.Scanner;
	import java.util.InputMismatchException;

	public class DataReader
	{
	   public static void main(String[] args)
	   {
	      Scanner in;
	      
	      int chances = 1;
	      boolean done = false;
	      double sum = 0;
	      
	      while (!done)
	      {
	    	 
	         double value = 0;                  
	         try
	         {  
	        	 in = new Scanner(System.in);
	        	 sum += in.nextFloat();
	         }   
	         catch (InputMismatchException e) {
	         if(chances < 1) {
	        	 done = true;
	        	 break;
	         }
	         chances--;
	         
	         System.out.println("Try Again.");  
	           //Display "Input error. Try again."
	           //Read the bad input
	           //other code
	            
	         }
	      }
	      //Display the sum
	      
	      System.out.println(sum);
	      
	   }
	}
	
	


