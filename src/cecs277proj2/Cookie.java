package cecs277proj2;
import java.math.*;

/**
 * This class gives us all the information about the cookie in the dessert item class 
 * @author Micheal Hannigan, Carl Borillo. and Krimika Keemtee 
 *
 */
public class Cookie extends DessertItem{

    //attributes
    private double number = 0;
    private double ppd = 0;
    private String type = "Cookie";

    /**
     * Null constructor for Cookie class
     */
    public Cookie() {
        // TODO Auto-generated constructor stub
    }

    /**Initializes Cookie data
     * @param n = name of the dessert item 
     * @param cal = the number of calories in the cookie 
     * @param num = the number of cookies the person wants to buy
     * @param p = the price per dozen of cookies
     */
    public Cookie(String n, double cal, double num, double p) {
        super(n,cal);
        this.number = num;
        this.ppd = p;
    }

    public String getType() {
        return type;
    }
    
    /**returns number of Cookie
     * @return the number of cookies
     */
    public double getNumber() {
        return number;
    }

    /**sets the number for Cookie
     * @param number = sets the number of cookies to the number 
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**gets the price per dozen for Cookie
     * @return then returns the price per dozen for cookie
     */
    public double getPpd() {
        return ppd;
    }

    /**sets the price per dozen for Cookie
     * 
     * @param ppd sets the price per dozen of cookie
     */
    public void setPpd(double ppd) {
        this.ppd = ppd;
    }


    /**gets the cost of the Cookies
     * @return the total cost of the cookies 
     */
    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        double perdoz = this.number/12;
        double cost = Math.round(this.ppd*perdoz*100);
        return cost/100;
    }

    /**toString method used to gather information in the string based on this class.
     * @return the string of the price perpound of the cookie, the name, and the calories of the cookies
     */
    public String toString() {
        if(this.getName()==null) {
            String output = String.format("%.0f @ %.2f /dz.\n%33.2f\n\n", this.getNumber(), this.getPpd(), this.getCost());
            return output;
        }else {
            String output = String.format("%.0f @ %.2f /dz.\n%-15s(Cookie)%15.2f\n\n%s(Cookie) calories:%.0f\n\n",
                    this.getNumber(),this.getPpd(),this.getName(),this.getCost(),this.getName(),this.getCalories());
            return output;
        }
    }

}

