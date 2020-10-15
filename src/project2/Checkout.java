package project2;
import java.math.*;
import java.util.*;
public class Checkout {
	ArrayList<DessertItem> di = new ArrayList<DessertItem>();
	private double taxRate = 0;
	/**
	 * Null constructor for Checkout class
	 */
	public Checkout(double tr) {
		// TODO Auto-generated constructor stub
		this.taxRate = tr;
	}
	
	//Clears the Checkout to begin checking out a new set of items

	public void clear() {
		di.clear();
	}
	
    //A DessertItem is added to the end of the list of items
	public void enterItem(DessertItem item) {
		di.add(item);
	}
    //Returns the number of DessertItem's in the list
	public int getNumberOfItems() {
		return di.size();
	}
	
	//Returns a String representing a receipt for the current list of items
	public String toString() {
		String string = "A&S Dessert Shop\n--------------\n";
		for(DessertItem d:di) {
			string+=d.toString();
		}
		
		string+=String.format("\nTax: %34.2f\nTotal cost %28.2f", this.getTotalTax(),this.getTotalCost()+this.getTotalTax());
		
		return string;
	}
	
	public ArrayList<DessertItem> getArray(){
		return di;
	}
	
    //Returns total cost of items in cents (without tax)
	public double getTotalCost() {
		double total = 0;
		for(DessertItem i : di) {
			total += i.getCost();
		}
		total*=100;
		double newint = Math.round(total);
		total = newint/100;
		return total;
	}
	
    //Returns total tax on items in cents
	public double getTotalTax() {
		return (int) (this.taxRate * this.getTotalCost());
	}
	
    //Returns tax rate for this purchase
	public double getTaxRate() {
		return this.taxRate;
	}
	
    //Changes the tax rate for this purchase
	public void setTaxRate(double tr) {
		this.taxRate = tr;
	}

}
