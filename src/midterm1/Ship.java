package midterm1;

import cecs277proj2.DessertItem;
import labs.Employee;

/*Design a Ship class that the following members:
�	A field for the name of the ship (a string).
�	A field for the year that the ship was built (an int).
�	A constructor and appropriate accessors and mutators.
�	A toString method that displays the ship�s name and the year it was built. */
public class Ship implements Comparable<Ship>{
	private String name;
	private int year;
	public Ship() {
		name="noname";
		year=1000;
	}
	public Ship(String iname,int iyear) {
		name=iname;
		year=iyear;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString() {
		return "The name of the ship is "+name+". It was built in " + year+".";
	}
	public int compareTo(Ship o) {
		return this.getName().compareTo(o.getName());
	}
	
}
