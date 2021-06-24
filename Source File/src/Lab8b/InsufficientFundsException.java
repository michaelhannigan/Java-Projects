/**
 * 
 */
package Lab8b;

/**
 * @author michaelhannigan
 *
 */
public class InsufficientFundsException  extends IllegalArgumentException
{
public InsufficientFundsException() {}

public InsufficientFundsException(String message)
{
super(message);
}
}
