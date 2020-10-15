package project2;

public abstract class DessertItem implements Comparable<DessertItem>{

	  protected String name;
	  protected double calories;

	/**
	 * Null constructor for DessertItem class
	 */
	  public DessertItem() {
	    
	  }
	/**
	 * Initializes DessertItem data
	 */
	  public DessertItem(String name, double calories) {
	      this.name = name;
	      this.calories = calories;
	      }
	/**
	 * Returns name of DessertItem
	 * @return name of DessertItem
	 */
	  public final String getName() {
	    return name;
	  }
	  
	  public final void setName(String n) {
		  this.name = n;
	  }
	  
	  public final double getCalories() {
		  return calories;
	  }
	  
	  public final void setCalories(double cal) {
		  this.calories = cal;
	  }
	  
		//the method to help the max method in the abstract class
		@Override
		public int compareTo(DessertItem o) {
			// TODO Auto-generated method stub
			if(this.getCalories()>o.getCalories()) {
				return 1;
			}
			if(this.getCalories()==o.getCalories()) {
				return 0;
			}else {
				return -1;
			}
		
		}
	  
		
	/**
	 * Returns cost of DessertItem
	 * @return cost of DessertItem
	 */
	  public abstract double getCost();
	  
	  public abstract String getType();
	  
	  public static DessertItem max(DessertItem o1, DessertItem o2) {
		  if(o1.compareTo(o2)>=0) {
			  return o1;
		  }else {
			  return o2;
		  }
	  }


	}


