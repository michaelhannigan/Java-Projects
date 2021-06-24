/**
 * 
 */
package Lab8b;

/**
 * @author michaelhannigan
 *
 */
public class NegativeBalanceException  extends IllegalArgumentException
{
public NegativeBalanceException() {}

public NegativeBalanceException(String message)
{
super(message);
}
}
