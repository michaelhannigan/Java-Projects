/**
 * 
 */
package project2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author michaelhannigan
 *
 */
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Checkout checkout = new Checkout(0.09);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Candy Test:");
		
		Candy candy = new Candy();
		System.out.println(candy.toString());
		
		candy.setCalories(500);
		candy.setName("Corn");
		candy.setPricepp(7.25);
		candy.setWeight(1.5);
		
		checkout.enterItem(candy);
		
		System.out.println(candy.toString());
		
		Candy candy2 = new Candy();
		candy2.setCalories(640);
		candy2.setName("Lolipop");
		candy2.setPricepp(8.25);
		candy2.setWeight(2.5);
		
		checkout.enterItem(candy2);
		
		System.out.println(candy2.toString());
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Cookie Test:");
		
		Cookie cookie = new Cookie();
		System.out.println(cookie.toString());
		
		cookie.setCalories(250);
		cookie.setName("ChocChip");
		cookie.setNumber(17);
		cookie.setPpd(4.99);
		System.out.println(cookie.toString());
		
		checkout.enterItem(cookie);
		
		Cookie cookie2 = new Cookie("Oatmeal", 240, 15, 3.99);
		System.out.println(cookie2.toString());
		
		checkout.enterItem(cookie2);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("IceCream Test:");
		IceCream ic = new IceCream();
		System.out.println(ic.toString());
		
		ic.setCalories(500);
		ic.setCost(10.05);
		ic.setName("Vanilla");
		System.out.println(ic.toString());
		
		checkout.enterItem(ic);
		
		IceCream ic2 = new IceCream("Chocolate", 500, 9.99);
		
		checkout.enterItem(ic2);
		
		System.out.println(ic2.toString());
		
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Sundae Test:");
		Sundae s = new Sundae();
		System.out.println(s.toString());
		
		s.setName("Caramel");
		s.setCalories(600);
		s.setCost(7);
		s.setToppingCost(.70);
		s.setTopping("HotFudge");
		System.out.println(s.toString());
		
		checkout.enterItem(s);
		
		Sundae s1 = new Sundae();
		s1.setName("BananaSplit");
		s1.setCalories(560);
		s1.setCost(6.00);
		s1.setTopping("Strawberries");
		s1.setToppingCost(0.90);
		System.out.print(s1.toString());
		
		checkout.enterItem(s1);
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Output Reciept:");
		System.out.println();
		String receipt = String.format("Number of items: %d\nTotal cost: %.0f\nTotal tax: %.0f\nCost + Tax: %.0f", 
				checkout.getNumberOfItems(),checkout.getTotalCost()*100,checkout.getTotalTax()*100,checkout.getTotalCost()*100+checkout.getTotalTax()*100);
		
		System.out.println(receipt);
		
		System.out.println(checkout.toString());
		
		
		System.out.println("-----------------------------------------------------------------");

		
		System.out.println("Max Test With Same DessertItem Types");
		maxString(candy, candy2);
		maxString(cookie, cookie2);
		maxString(ic,ic2);
		maxString(s,s1);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Max Test With Different DessertItem Types");
		maxString(candy2, cookie2);
		maxString(s1, cookie);
		maxString(candy2, ic);
		maxString(s,cookie);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("The unsorted DessertList is:");
		ArrayList<DessertItem> array = checkout.getArray();
		
		for(DessertItem d:array) {
			String output = String.format("%s(%s) has %.0f calories.", d.getName(),d.getType(),d.getCalories());
			System.out.println(output);
		}
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("The sorted DessertList is:");
		
		Collections.sort(array);
		
		for(DessertItem d:array) {
			String output = String.format("%s(%s) has %.0f calories.", d.getName(),d.getType(),d.getCalories());
			System.out.println(output);
		}


	}
	
	public static void maxString(DessertItem d1, DessertItem d2) {
		DessertItem max = DessertItem.max(d1, d2);
		if(max==d1) {
			String output = String.format("%s(%s) with %.0f calories is bigger than %s(%s) with %.0f calories.", 
					max.getName(),max.getType(), max.getCalories(), d2.getName(),d2.getType(),d2.getCalories());
			System.out.println(output);
		}else {
			String output = String.format("%s(%s) with %.0f calories is bigger than %s(%s) with %.0f calories.", 
					max.getName(),max.getType(), max.getCalories(), d1.getName(),d1.getType(),d1.getCalories());
			System.out.println(output);

			}
		
			}

	
	

}
