/**
 * 
 */
package Lab8b;

/**
 * @author michaelhannigan
 *
 */
/**
A bank account has a balance that can be changed by 
deposits and withdrawals.
*/
public class BankAccount
{  
private double balance;

/**
   Constructs a bank account with a zero balance.
*/
public BankAccount()
{   
   balance = 0;
}

/**
   Constructs a bank account with a given balance.
   @param initialBalance the initial balance
*/
public BankAccount(double initialBalance)
{   
   if (initialBalance < 0)
      throw new IllegalArgumentException("Initial Balance needs to be above 0");
         
   balance = initialBalance;
}

/**
   Deposits money into the bank account.
   @param amount the amount to deposit
*/
public void deposit(double amount)
{  
   if (amount < 0)
	   throw new IllegalArgumentException("Amount needs to be greater than 0");

   double newBalance = balance + amount;
   balance = newBalance;
}

/**
   Withdraws money from the bank account.
   @param amount the amount to withdraw
*/
public void withdraw(double amount)
{   
   if (amount < 0 || amount > balance)
	   throw new IllegalArgumentException("Widraw amount needs to be within 0 and the balance");
   
   double newBalance = balance - amount;
   balance = newBalance;
}

/**
   Gets the current balance of the bank account.
   @return the current balance
*/
public double getBalance()
{   
   return balance;
}
}

