/**
 * 
 */
package lab7;

/**
 * @author michaelhannigan
 *
 */


import java.io.*;
import java.util.*;

public class SalesSplit
{
/**
Prompts for and reads name of file to process.
@param in Scanner from which to read
@return file name
*/
private static String getFileName(Scanner in)
{
String filename = null;
System.out.print("Enter file to process: ");
if (in.hasNext())
{
filename = in.next();
}

return filename;
}

/**
Read a sales entry from input Scanner.
@param in Scanner from which to read entry
*/
private static Sale readSaleEntry(Scanner in)
{
String inputLine = in.nextLine();
Scanner lineScan = new Scanner(inputLine);
lineScan.useDelimiter(";");
//YOUR CODE TO INPUT name, service, amount, and date.

String name = lineScan.next();
String service = lineScan.next();
double amount = lineScan.nextDouble();
String date = lineScan.next();
return new Sale(name, service, amount, date);
}

/**
Reads sales data from the specified file.
@param filename name of sales data file
*/
private static ArrayList<Sale> readSalesFile(String filename)
throws FileNotFoundException
{
ArrayList<Sale> sales = new ArrayList<Sale>();

if (filename != null)
{
try (Scanner infile = new Scanner(new File("sales.txt"));)
{
while (infile.hasNext())
{ sales.add(readSaleEntry(infile));}
}
}
return sales;
}


/**
Writes sale to writer.
@param out PrintWriter to which sale is written
@param sale sale information
*/
private static void writeSale(PrintWriter out, Sale sale)
{
out.print(sale.getName());
out.print(";");
out.print(sale.getServiceCategory());
out.print(";");
out.print(sale.getAmount());
out.print(";");
out.print(sale.getDate());
out.println();
}

public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
String filename = getFileName(in);
System.out.println(filename);

try
{
ArrayList<Sale> sales = readSalesFile("sales.txt");
PrintWriter out = new PrintWriter("sales.output.txt");
for (Sale s : sales) 
writeSale(out, s);

out.close();
} 
catch (FileNotFoundException e)
{
System.out.println("File not found!");
} 
catch (NoSuchElementException e)
{
System.out.println("File format not valid.");
}
}
}
