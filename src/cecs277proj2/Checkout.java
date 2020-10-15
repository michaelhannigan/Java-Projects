package cecs277proj2;
import java.math.*;
import java.util.*;

/**
 * this class gives tells us all the dessert items that have been chosen by the user
 * @author Micheal Hannigan, Carl Borillo. and Krimika Keemtee 
 *
 */
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

    /**Clears the Checkout to begin checking out a new set of items
     * @return = null
     */
    public void clear() {
        di.clear();
    }

    /**A DessertItem is added to the end of the list of items
     * 
     * @param item = it is the name of the dessert item that 
     * needs to be added in checkout
     */
    public void enterItem(DessertItem item) {
        di.add(item);
    }
    
    /**Returns the number of DessertItem's in the list
     * 
     * @return = the total number of items in the list 
     */
    public int getNumberOfItems() {
        return di.size();
    }

    /**Returns a String representing a receipt for the current list of items
     * @return = a string of the current items that the person has shopped for
     */
    public String toString() {
        String string = "A&S Dessert Shop\n--------------\n";
        for(DessertItem d:di) {
            string+=d.toString();
        }

        string+=String.format("\nTax: %34.2f\nTotal cost %28.2f", this.getTotalTax(),this.getTotalCost()+this.getTotalTax());

        return string;
    }
    
    
    /** creates an arrayList of all desert items  
     * @return the array list 
     */
    public ArrayList<DessertItem> getArray(){
        return di;
    }

    /**Returns total cost of items in cents (without tax)
     * @return = the total cost of the items int he list (without tax)
     */
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

    /**Returns total tax on items in cents
     * @return = the total tax
     */
    public double getTotalTax() {
        return (int) (this.taxRate * this.getTotalCost());
    }

    /**Returns tax rate for this purchase
     * @return = tax rate 
     */
    public double getTaxRate() {
        return this.taxRate;
    }

    /**Changes the tax rate for this purchase
     * @param tr = the tax rate for the specific purchace 
     */
    public void setTaxRate(double tr) {
        this.taxRate = tr;
    }

}

