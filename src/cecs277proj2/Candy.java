package cecs277proj2;
/**
 * This class will give us information on Candy which extends from the Dessert Item class
 * @author michaelhannigan, CarlBorillo, krimikaKeemtee
 *
 */
import java.math.*;

public class Candy extends DessertItem{

    //attributes
    private double weight = 0;
    private double pricepp = 0;
    private String type = "Candy";

    /**
     * Null constructor for Candy class
     */
    public Candy() {
        // TODO Auto-generated constructor stub
    }

    public Candy(String n, double cal, double w, double p) {
        super(n,cal);
        this.weight = w;
        this.pricepp = p;
        /**
         * Initializes Candy class data
         * @param w = weight, is what the main will reference when the string is printed
         * @param p = price, is what the main will reference when the string is printed
         * @param cal = calories, is what the main will reference
         */
    }

    public String getType() {
        return type;
    }

    /**
     *
     * @return type of candy which is referenced as a private String
     */
    public double getWeight() {
        return weight;
    }

    //this method takes in a double value and sets it as the weight attribute
    public void setWeight(double weight) {
        this.weight = weight;
    } /**
       * this method takes in a double value and sets it as the weight attribute
     * @return the weight of the candy
       */
    //this method returns a double value of the price per pound attribute
    public double getPricepp() {
        return pricepp;
    }

    //this method takes in a double value and sets it as the price per pound attribute
    public void setPricepp(double pricepp) {
        this.pricepp = pricepp;
    }

    //this method multiplies the weight and price per pound attribute and returns a double value
    //of the two attributes multiplied together and rounded to the nearest cent.


    @Override
    public double getCost() {

        // TODO Auto-generated method stub
        double value = this.weight * this.pricepp;

        //multiplies the price in dollars to cents by *100
        double cents = value * 100;
        //calls the math function and rounds the cents to the nearest int

        value = Math.round(cents);

        return value /100;
        /**
         * @param cost = the cost of the candy
         * @param this.weight = w is the weight of the candy being multiplied by this.pricepp which is the price of the candy per pound
         * @return the value of the specific candy based on the given parameters
         *
         */
    }


    // toString method used to gather information in the string based on this class.
    public String toString() {

        if(this.getName()==null) {
            String output = String.format("%.1f lbs. @ %.2f /lb.\n%32.2f\n\n", this.getWeight(), this.getPricepp(), this.getCost());
            return output;
        }else {
            String output = String.format("%.1f lbs. @ %.2f /lb.\n%-15s(Candy)%15.2f\n\n%s(Candy) calories:%.0f\n\n",
                    this.getWeight(),this.getPricepp(),this.getName(),this.getCost(),this.getName(),this.getCalories());
            return output;
        }
        /**
         *
         * @return a string of the class data such as the weight, the price per pound, the name, the cost, the name, and calories of the candy
         *
         */
    }

}
