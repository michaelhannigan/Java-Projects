/**
 * 
 */
package lab7;

/**
 * @author michaelhannigan
 *
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
This program takes in a list of baby names and outputs a list of boys and 
girls names.
*/
public class BabyNames
{
/**
Reads name information and returns it. It also consumes the 
count values on the input line.
@return the next name
*/
public static String processName(Scanner in)
{
	String name = in.next();
	int amount = in.nextInt();
	double zero = in.nextDouble();
	return name;
	
}

public static void main(String[] args)                      
{
try (Scanner in = new Scanner(new File("babynames.txt"));
PrintWriter boyOut = new PrintWriter("boynames.txt");
PrintWriter girlOut = new PrintWriter("girlnames.txt"))
{
while (in.hasNextInt())
{
int rank = in.nextInt();
// System.out.println(processName(in));
// System.out.println(processName(in));
boyOut.println(processName(in));
girlOut.println(processName(in));
}

boyOut.close();
girlOut.close();
}
catch (IOException e)
{
e.printStackTrace();
}

}
}