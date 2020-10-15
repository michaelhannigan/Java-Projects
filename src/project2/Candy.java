package project2;

import java.math.*;

public class Candy extends DessertItem{
	
	//attributes
	private double weight = 0;
	private double pricepp = 0;
	private String type = "Candy";
	
	/**
	 * 
	 */
	public Candy() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param n
	 * @param cal
	 * @param w
	 * @param p
	 */
	public Candy(String n, double cal, double w, double p) {
		super(n,cal);
		this.weight = w;
		this.pricepp = p;
		
	}

	/**
	 * 
	 */
	public String getType() {
		return type;
	}
	//this method returns the double value of the weight attribute
	/**
	 * 
	 * @return
	 */
	public double getWeight() {
		return weight;
	}
	
	//this method takes in a double value and sets it as the weight attribute
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//this method returns a double value of the price per pound attribute
	public double getPricepp() {
		return pricepp;
	}

	//this method takes in a double value and sets it as the price per pound attribute
	public void setPricepp(double pricepp) {
		this.pricepp = pricepp;
	}

	//this method multiplies the weight and price per pound attribute and returns a double value
	//of the two attributes multitplied together and rounded to the nearest cent.
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		double value = this.weight * this.pricepp;
		
		//multiplies the price in dollars to cents by *100
		double cents = value * 100;
		//calls the math function and rounds the cents to the nearest int
		
		value = Math.round(cents);
		
		return value /100;
	}


	
	public String toString() {
		if(this.getName()==null) {
		String output = String.format("%.1f lbs. @ %.2f /lb.\n%32.2f\n\n", this.getWeight(), this.getPricepp(), this.getCost());
		return output;
		}else {
		String output = String.format("%.1f lbs. @ %.2f /lb.\n%-15s(Candy)%15.2f\n\n%s(Candy) calories:%.0f\n\n", 
				this.getWeight(),this.getPricepp(),this.getName(),this.getCost(),this.getName(),this.getCalories());
		return output;
		}
	}

}
