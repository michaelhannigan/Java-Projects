/**
 * 
 */
package project3;

/**
 * @author michaelhannigan, Krimika Kamette, Carl Borillo
 * This class allows the user to create a product of their choice
 * With private data types of string for name double for cost and int for quantity
 */
public class Product {
	/**
	 * private attributes
	 */
	private String name;
	private double cost;
	private int quantity = 0;
	private int stock = 0;
	/**
	 * default constructor
	 */
	public Product(){
		
	}
	/**
	 * This is the product constructor
	 * @param n is a string that initializes the name attribute
	 * @param c is a double that initializes the cost attribute
	 * @param q is a int that initializes the quantity attribute 
	 */
	public Product(String n, double c, int q) {
		this.name = n;
		this.cost = c;
		this.quantity = q;
		this.stock = this.quantity;
	}
	/**
	 * This method returns the name attribute
	 * @return String name attribute
	 */
	public String getName() {
		return name;
	}
	/**
	 * This is a void method that initializes the name attribute
	 * @param name (String)
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * This method returns the cost attribute
	 * @return double cost attribute
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * This is a void method that initializes the cost attribute
	 * @param cost (double) 
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * This method returns the quantity attribute
	 * @return int quantity  
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * This is a void method that initializes the quantity attribute
	 * @param quantity (int) 
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.stock = quantity;
	}
	
	/**
	 * This is a void method that decreases the quantity attribute by 1
	 */
	public void removeProduct() {
		quantity -= 1;
	}
	
	/**
	 * This is a void method that resets the quantity attribute to it's original amount
	 */
	public void restockProduct() {
		quantity = this.stock;
	}
	/**
	 * This method is a void method that returns a string displaying cost and name
	 */
	@Override
	public String toString() {
		String toString = String.format("%s @ $%.2f Quantity:%d", this.name, this.cost, this.quantity);
		return toString;
	}
	
	
	
}
