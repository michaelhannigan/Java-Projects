/**
 * 
 */
package project3;

/**
 * @author michaelhannigan, Krimika Kamette, Carl Borillo
 * This class allows the user to create a coin with a value of their choice
 * This is an immutable class
 */


/**
   A coin with a monetary value.
*/
public class CoinType {   //[ 2 points] YOUR CODE to declare the private data members for the class Coin
	   /**
	    * private attribute
	    */
		private double coinValue;
	   
	   /**
	    * No Arg default constructor
	    */
	   public CoinType() {
		   
	   }
	   /**
	      Constructs a coin.
	      @param aValue the monetary value of the coin
	   * 
	   */
	   public CoinType(double aValue) {
		   coinValue = aValue;
	   }
	   /**
	      Gets the coin value.
	      @return the value
	   */
	   public double getValue() {
		   return coinValue;
	   }
	   /**
	    * creates a string to display the coinValue
	    * returns a string showing the coin value
	    */
	   @Override
	   public String toString() {
		   return "This coin is worth $" + coinValue;
	   }
  
}
