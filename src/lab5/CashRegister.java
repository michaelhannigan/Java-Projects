/**
 * 
 */
package lab5;

/**
 * @author michaelhannigan
 *
 */
/**
A cash register totals up sales and computes change due.
*/
public class CashRegister
{ //[ 2 points]YOUR CODE to declare to private data members
	private double purchase;
	private double payment;
/**
   Constructs a cash register with no money in it.
*/
public CashRegister()
{
   purchase = 0;
   payment = 0;
}

/**
   Records the purchase price of an item.
   @param amount the price of the purchased item
*/

public void recordPurchase(double amount) {
	purchase += amount;
}  

/**
   Enters the payment received from the customer.
   @param coinCount the number of coins received
   @param coinType the type of coin that was received
*/
public void receivePayment(double coinCount, Coin coinType) {
	
	
	payment += coinType.getValue()*coinCount;
}


/**
   Computes the change due and resets the machine for the next customer.
   @return the change due to the customer
*/
public double giveChange()
{
   double change = payment - purchase;
   purchase = 0;
   payment = 0;
   return change;
}
}