/**
 * 
 */
package project3;

import java.util.ArrayList;

/**
 * @author michaelhannigan, Krimika Kamette, Carl Borillo
 * This class controls the money flow between the customer and he machine
 */
public class VendingMachine {
	/**
	 * private attributes
	 */
	private ArrayList<Product> products = new ArrayList<Product>();
	private double machineCoins = 0;
	private double customerCoins = 0;
	/**
	 * no arg constructor
	 */
	public VendingMachine() {
		
	}
	/**
	 * This is a method that returns the customer coins attribute
	 * @return customerCoins (double)
	 */
	public double getCustomerCoins() {
		return customerCoins;
	}
	/**
	 * This is a void method that adds the value of the coin object passed in 
	 * to customerCoins
	 * @param coin (CoinType)
	 */
	public void addCustomerCoins(CoinType coin) {
		customerCoins += coin.getValue();
	}
	/**
	 * This is void method that sets the customerCoins to 0
	 */
	public void removeCustomerCoins() {
		customerCoins = 0;
	}
	/**
	 * This is a method that returns the machine's coins attribute
	 * @return machineCoins (double) 
	 */
	public double getMachineCoins() {
		return machineCoins;
	}
	/**
	 * This is a void method that adds the amount passed in to machineCoins
	 * @param amount(double)
	 */
	public void addMachineCoins(double amount) {
		machineCoins += amount;
	}
	/**
	 * This is a void method subtracts the amount passed int from machineCoins attribute
	 * @param amount (double)
	 */
	public void subtractMachineCoins(double amount) {
		machineCoins -= amount;
	}
	
	/**
	 * This is a method that returns the machine coins attribute
	 * and then sets the machineCoins value to zero
	 * @return tempCoins(double)
	 */
	public double removeMachineCoins() {
		double tempCoins = machineCoins;
		machineCoins = 0;
		return tempCoins;
	}
	
	public void addProduct(Product p) {
		products.add(p);
	}
	
	
	/**
	 * This method returns an array list of all the products
	 * @return array list of products
	 */
	public ArrayList<Product> getProducts(){
		return products;
	}
	
	/**
	 * This method sets an a product at a specified index
	 * @param index int
	 * @param product Product
	 */
	public void setProduct(int index, Product product) {
		products.set(index, product);
	}
	
	/**
	 * This method gets the product at a specified index
	 * @param index
	 * @return Product object
	 */
	public Product getProduct(int index) {
		return products.get(index);
	}
	/**
	 * This is a method that returns a string to display the attributes 
	 */
	@Override
	public String toString() {
		return "Money in the machine is: $"+machineCoins+" The customer's money is: $"+customerCoins;
	}
	
}
