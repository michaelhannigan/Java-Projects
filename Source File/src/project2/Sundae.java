package project2;

public class Sundae extends IceCream{
	
	private double tcost = 0;
	private String topping;
	private String type = "Sundae";
	
	/**
	 * Null constructor for Sundae class
	 */
	public Sundae() {
		// TODO Auto-generated constructor stub
	}
	
	//Intializes Sundae data
	public Sundae(String n, double cal, double c, String top, double tcost) {
		super(n,cal,c);
		this.topping = top;
		this.tcost = tcost;
	}
	
	public String getType() {
		return type;
	}
	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	//returns cost of Sundae (cost of Ice Cream + topping)
	public double getCost() {
		return tcost + super.getCost();
	}
	
	//intializes the cost of the topping in Sundae
	public void setToppingCost(double cost) {
		this.tcost = cost;
	}
	
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
