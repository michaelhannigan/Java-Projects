package cecs277proj2;

/**
 * In this class sundae which extends icecream tells us all the information the
 * sundae is using. 
 * @author Micheal Hannigan, Carl Borillo. and Krimika Keemtee 
 *
 */
public class Sundae extends IceCream{
    
	//Setting the cost constant as 0, assigning topping and type as a string.
    private double tcost = 0;
    private String topping;
    private String type = "Sundae";

    /**
     * Null constructor for Sundae class
     */
    public Sundae() {
        // TODO Auto-generated constructor stub
    }

    /**Intializes Sundae data
     * @param n = name of the dessert item 
     * @param cal = the amount of calories for each sundae 
     * @param c = the cost of the icecream needed in the sundae
     * @param top = topping on sundae
     * @param tcost = cost of sundae
     */
    
    public Sundae(String n, double cal, double c, String top, double tcost) {
        super(n,cal,c);
        this.topping = top;
        this.tcost = tcost;
    }
    
    /**this will gather what type of sundae will be added.
     * @return type = the type of sundae the user wants 
     */
    public String getType() {
        return type;
    }
    
    /**this will gather what toppings the user wants
     * @return topping = returns the choice of topping
     */
    public String getTopping() {
        return topping;
    }
    
    /**this will set the topping specified by the user.
     * @param topping = the type of topping for the sundae
     */
    public void setTopping(String topping) {
        this.topping = topping;
    }

    /**returns cost of Sundae (cost of Ice Cream + topping)
     * @return the total cost of sundae
     */
    public double getCost() {
        return tcost + super.getCost();
    }

    /**intializes the cost of the topping in Sundae
     * @param cost = the price of the topping that was chosen by the user 
     */
    public void setToppingCost(double cost) {
        this.tcost = cost;
    }
    /**method used to print out Elements in this class.
     * @returns a string of all the name, topping, cost and calories of the specific sundae
     */
    public String toString() {
        if(this.getName()==null) {
            String output = String.format("%40.2f\n", this.getCost());
            return output;
        }else {
            String output = String.format("%s(Sundae) with\n%-15s(Topping)%15.2f\n\n%s(Sundae) calories:%.0f\n\n",
                    this.getName(),this.getTopping(),this.getCost(),this.getName(),this.getCalories());
            return output;
        }
    }


}
