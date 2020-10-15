package cecs277proj2;
/**
 * This class will give us the information about the Ice Cream in the Dessert Item class
 * @author michaelhannigan, CarlBorillo, krimikaKeemtee
 *
 */
public class IceCream extends DessertItem{

    private double cost = 0;
    private String type = "IceCream";
    /**
     * Null constructor for DessertItem class
     */
    public IceCream() {
        // TODO Auto-generated constructor stub
    }

    public IceCream(String n, double cal, double c) {
        super(n,cal);
        this.cost = c;
    }
    // refers to the private string type argument
    public String getType() {
        /**
         * @return type of Ice Cream
         */
        return type;
    }
    //sets the cost in Ice Cream with a double argument
    public void setCost(double cost) {
        /**
         * @return  sets the cost of the Ice Cream with the double argument
         */
        this.cost = cost;
    }

    //returns the cost in Ice Cream
    @Override
    public double getCost() {
        /**
         * @return the cost of Ice Cream
         */
        // TODO Auto-generated method stub
        return this.cost;
    }

    //returns the string to display all of the attributes
    public String toString() {
        if(this.getName()==null) {
            String output = String.format("%40.2f\n", this.getCost());
            return output;
        }else {
            String output = String.format("%-15s(IceCream)%15.2f\n\n%s(IceCream) calories:%.0f\n\n",
                    this.getName(),this.getCost(),this.getName(),this.getCalories());
            return output;
            /**
             * @return A string with the data from this class such as the name, cost, calories and formats the string by using the String.format method.
             */
        }

    }



}

