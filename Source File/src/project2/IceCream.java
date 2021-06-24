package project2;

public class IceCream extends DessertItem{
	
	private double cost = .25;
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
	
	public String getType() {
		return type;
	}
	//sets the cost in Ice Cream with a double argument
	public void setCost(double cost) {
		this.cost = cost;
	}

	//returns the cost in Ice Cream
	@Override
	public double getCost() {
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
		}
	}
	


}
