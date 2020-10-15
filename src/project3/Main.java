/**
 * 
 */
package project3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author michaelhannigan, Krimika Kamette, Carl Borillo
 * This is the main tester class to show the implementation of the
 * CoinType, Product, and VendingMachine classes
 */
public class Main {

		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creates an array list of products invoking the product class
		//ArrayList<Product> products = new ArrayList<Product>();
		
		//Creates a vendingMachine object to control the money going in and out
		VendingMachine vendingMachine = new VendingMachine();
		
	
		
		//Input validation - makes sure they input a correct character
		for(;;) {
			
			//Prints menu for the user and then sets their character input to the input variable
			System.out.println("S)how products  I)nsert coin  B)uy  A)dd product  R)emove Coins  K)re-stock product  Q)uit");
			Scanner maga = new Scanner(System.in);
			char input = maga.next().charAt(0);
			input = Character.toLowerCase(input);
			
			while(input != 's' && input != 'i'&& input != 'b' && 
					input != 'a' && input != 'r' && input != 'k' && input != 'q') {
				System.out.println("Not a valid input.");
				Scanner validate = new Scanner(System.in);
				input = validate.next().charAt(0);
			}
			
			
			
			////////////////////Show Products//////////////////
			//This option shows all the products in our products array list
			if(input == 'S' || input == 's') { 
				for(Product p:vendingMachine.getProducts()) 
					System.out.println(p.toString());
				continue;
			}
			
			
			/////////////Insert Coin///////////////////////
			//prints a menu of all available coins to insert
			CoinType coin;
			if(input == 'i') {
				System.out.println("(A) nickel @ $0.05\n (B) dime @ $0.10\n "
								+ "(C) quarter @ $0.25\n (D) dollar @ $1.00");
				
				//input validation for the user's coin input
				Scanner scan = new Scanner(System.in);
				char djt = scan.next().charAt(0);
				djt = Character.toLowerCase(djt);
				while(djt != 'a'  && djt != 'b' && djt != 'c' && djt != 'd') {
						System.out.println("Not a valid input.");
						djt = scan.next().charAt(0);
				}
				//looks at their input and creates the correct coin object and then adds that 
				//coin to the vending customerCoins
				switch(djt) {
					case 'a':
						coin = new CoinType(.05);
						vendingMachine.addCustomerCoins(coin); 
						break;
					case 'b':
						coin = new CoinType(.1);
						vendingMachine.addCustomerCoins(coin); 
						break;
					case 'c':
						coin = new CoinType(.25);
						vendingMachine.addCustomerCoins(coin); 
						break;
					case 'd':
						coin = new CoinType(1.0);
						vendingMachine.addCustomerCoins(coin); 
						break;
					
				}
				continue;
			}
			
			
		/////////////////////Buy////////////////////////////
		//this option buys the product for the user
		if(input == 'b') {
			if(vendingMachine.getProducts().size()>0) {
			//creates a character array list
			char character = 'A';
			ArrayList<Character> charArray = new ArrayList<Character>();
			int indexAt;
			
			//prints all the products starting with location character A
			//adds the location character to the charArray with the lowercase value
			for(Product b:vendingMachine.getProducts() ) {
				String lines = String.format("%c) %s", character, b.toString());
				System.out.println(lines);
				character = Character.toLowerCase(character);
				charArray.add(character);
				character = Character.toUpperCase(character);
				character++;
			}
			
			//gets the character value from the user
			Scanner scanner = new Scanner(System.in);
			char productInput = scanner.next().charAt(0);
			char boughtProduct = Character.toLowerCase(productInput);
			
			while(!charArray.contains(boughtProduct)) {
				System.out.print("Insufficiant input. Please give a valid character");
				scanner = new Scanner(System.in);
				boughtProduct = scanner.next().charAt(0);
				
			}
			
			//sets the indexAt variable to the index of what they inputed
			indexAt = charArray.indexOf(boughtProduct);
			
			//finds the right product in the product array and creates a new object called bought
			Product bought = vendingMachine.getProducts().get(indexAt);
			//gets the cost of the object
			double amount = bought.getCost();
			//gets the quantity of the object
			int quantityLeft = bought.getQuantity();
			
			//checks to see if the customer has enough coins to buy the product
			if(vendingMachine.getCustomerCoins() - amount < 0)
				System.out.println("Insufficient money");
			
			//checks to see if there 1 or more of the product being bought
			if(quantityLeft <= 0) 
				System.out.println("There are no more "+ bought.getName()+"s");
			
			//if the user can buy the product
			if(vendingMachine.getCustomerCoins() - amount >= 0 && quantityLeft > 0) {
				String line = String.format("Purchased: %s @ $%.2f", bought.getName(), bought.getCost());
				System.out.println(line);
				//adds the customers coins into the vending machine
				vendingMachine.addMachineCoins(vendingMachine.getCustomerCoins());
				//removes the customers coins
				vendingMachine.removeCustomerCoins();
				//decreases the quantity by 1
				bought.removeProduct();
				//updates the product array list with product change
				vendingMachine.setProduct(indexAt, bought);
			}
			}else {
				System.out.println("There are no products yet.");
			}
			
			continue;
		}
		
		
		////////////////////Add Product//////////////////////
		//this option adds a product to the product array list given the 
		//user inputs
		if(input == 'a') {
			//creates new product default
			Product add = new Product();
			
			System.out.println("Description:");
			Scanner token = new Scanner(System.in);
			String description = token.next();
			//sets the user's input to the name of the product
			add.setName(description);
			
			System.out.println("Price:");
			token = new Scanner(System.in);
			double price = token.nextDouble();
			//sets the user's input to the price of the product
			add.setCost(price);
			
			System.out.println("Quantity");
			token = new Scanner(System.in);
			int quantity = token.nextInt();
			//sets the user's input to the quantity of the product
			add.setQuantity(quantity);
			
			//adds this product to the end of the array list
			vendingMachine.addProduct(add);
			
			continue;
		}
		
		
		////////////////////Remove Coins//////////////////
		//this option removes all the machine's coins 
		if(input == 'r') {
			//returns the machine coins and sets the machineCoins value to 0 in the vendingMachine object
			double removedCoins = vendingMachine.removeMachineCoins();
			String removeString = String.format("Removed: $%1.2f", removedCoins);
			System.out.println(removeString);
			continue;
		}
		
		
		
		/////////////////Re-Stock Products////////////////
		//this option sets the product of choice's quantity to the original set quantity
		if(input == 'k') {
			char character = 'A';
			//creates a character array list
			ArrayList<Character> charArray2 = new ArrayList<Character>();
			int indexAt;
			
			//iterates through all the products and prints them with character choices
			for(Product b:vendingMachine.getProducts() ) {
				String lines = String.format("%c) %s", character, b.getName());
				System.out.println(lines);
				character = Character.toLowerCase(character);
				//adds the lower case version of each next character and adds to the array list
				charArray2.add(character);
				character = Character.toUpperCase(character);
				character++;
			}
			
			//gets the character the user inputed and makes it lowercase
			Scanner scanner = new Scanner(System.in);
			char productInput = scanner.next().charAt(0);
			char restockProduct = Character.toLowerCase(productInput);
			
			//input validation
			while(!charArray2.contains(restockProduct)) {
				System.out.print("Insufficiant input. Please give a valid character");
				scanner = new Scanner(System.in);
				restockProduct = scanner.next().charAt(0);
			}
			
			//gets the product the user wanted and restocks it back to original value
			indexAt = charArray2.indexOf(restockProduct);
			Product restocked = vendingMachine.getProduct(indexAt);
			//sets the quantity to the original stock value
			restocked.restockProduct();
			//updates the array list of products with the new quantity for the product
			vendingMachine.setProduct(indexAt, restocked);
			
			continue;
		}
		
		if(input == 'q') {
			//Tells user the vending machine is closed
			System.out.print("Vending Machine Closed.");
			break;
		}
		
		
		}
		
		
	}
}
	
		
	

