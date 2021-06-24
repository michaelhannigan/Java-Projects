package project2;

import java.math.*;
public class Cookie extends DessertItem{
	 
	//attributes
	private double number = 0;
	private double ppd = 0.65;
	private String type = "Cookie";
	
	/**
	 * Null constructor for Cookie class
	 */
	public Cookie() {
		// TODO Auto-generated constructor stub
	}
	
	//Initializes Cookie data
	public Cookie(String n, double cal, double num, double p) {
		super(n,cal);
		this.number = num;
		this.ppd = p;
	}
	
	public String getType() {
		return type;
	}
	//returns number of Cookie
	public double getNumber() {
		return number;
	}
	
	//sets the number for Cookie
	public void setNumber(int number) {
		this.number = number;
	}

	//returns the price per dozen for Cookie
	public double getPpd() {
		return ppd;
	}
	
	//sets the price per dozen for Cookie
	public void setPpd(double ppd) {
		this.ppd = ppd;
	}
	

	//gets the cost of the Cookies 
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		double perdoz = this.number/12;
		double cost = Math.round(this.ppd*perdoz*100);
		return cost/100;
	}
	
	
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
