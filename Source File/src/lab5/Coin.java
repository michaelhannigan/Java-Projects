/**
 * 
 */
package lab5;

/**
 * @author michaelhannigan
 *
 */

/**
   A coin with a monetary value.
*/
public class Coin
{   //[ 2 points] YOUR CODE to declare the private data members for the class Coin
	   private double coinValue;
	   private String coinName;
	   
 
   /**
      Constructs a coin.
      @param aValue the monetary value of the coin
      @param aName the name of the coin
 * @return 
   */
	   public Coin(double aValue, String aName) {
		   coinValue = aValue;
		   coinName = aName;
	   }
   /**
      Gets the coin value.
      @return the value
   */
	   public double getValue() {
		   return coinValue;
	   }
 
   /**
      Gets the coin name.
      @return the name
   */
	   public String getName() {
		   return coinName;
	   }
}