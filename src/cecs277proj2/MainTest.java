package cecs277proj2;

import java.util.ArrayList;
import java.util.Collections;

/**This class tests all the classes combined are being written out for the user to 
 * see and answer the question provided. 
 * @author michaelhannigan, CarlBorillo, krimikaKeemtee
 * @param null
 * @return null
 */
public class MainTest {

    /**
     *  In the main, this will generate a full 
     *  receipt of items bought and will display 
     *  the amount of calories per serving of the item(s)
     * @param args
     */
   
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Checkout checkout = new Checkout(0.09);

        System.out.println("-----------------------------------------------------------------"); //Prints a break in the receipt
        System.out.println("Candy Test:");

        Candy candy = new Candy();
        System.out.println(candy.toString()); //Prints out specific types of candy in this case, Candy Corn

        candy.setCalories(500);
        candy.setName("Corn");
        candy.setPricepp(7.25);
        candy.setWeight(1.5);

        checkout.enterItem(candy);

        System.out.println(candy.toString()); //Prints out second type of candy in this case, Lollipop

        Candy candy2 = new Candy();
        candy2.setCalories(640);
        candy2.setName("Lollipop");
        candy2.setPricepp(8.25);
        candy2.setWeight(2.5);

        checkout.enterItem(candy2);

        System.out.println(candy2.toString()); //Prints out second type of candy

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Cookie Test:");

        Cookie cookie = new Cookie();
        System.out.println(cookie.toString()); //Prints out specific type of cookie, in this case, Chocolate Chip

        cookie.setCalories(250);            // functions used by this class and given information will print out elements as referred by toString() method
        cookie.setName("ChocChip");
        cookie.setNumber(17);
        cookie.setPpd(4.99);
        System.out.println(cookie.toString());

        checkout.enterItem(cookie);

        Cookie cookie2 = new Cookie("Oatmeal", 240, 15, 3.99);
        System.out.println(cookie2.toString()); //Prints out specific type of cookie, in this case, Oatmeal

        checkout.enterItem(cookie2);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("IceCream Test:");
        IceCream ic = new IceCream();
        System.out.println(ic.toString());

        ic.setCalories(500); // functions used by this class and given information will print out elements as referred by toString() method
        ic.setCost(10.05);
        ic.setName("Vanilla");
        System.out.println(ic.toString()); //Prints out specific type of Ice cream in this case, Vanilla

        checkout.enterItem(ic);

        IceCream ic2 = new IceCream("Chocolate", 500, 9.99);

        checkout.enterItem(ic2);

        System.out.println(ic2.toString()); //Prints out specific type of Ice cream in this case, chocolate


        System.out.println("-----------------------------------------------------------------");
        System.out.println("Sundae Test:");
        Sundae s = new Sundae();
        System.out.println(s.toString()); //Prints out Sundae Items

        s.setName("Caramel"); // functions used by this class and given information will print out elements as referred by toString() method
        s.setCalories(600);
        s.setCost(7);
        s.setToppingCost(.70);
        s.setTopping("HotFudge");
        System.out.println(s.toString()); //Prints out specific type of Sundae in this case, Caramel Hot Fudge Sundae

        checkout.enterItem(s);

        Sundae s1 = new Sundae();
        s1.setName("BananaSplit"); // functions used by this class and given information will print out elements as referred by toString() method
        s1.setCalories(560);
        s1.setCost(6.00);
        s1.setTopping("Strawberries");
        s1.setToppingCost(0.90);
        System.out.print(s1.toString()); //Prints out specific type of Ice cream in this case, Strawberry Banana Split

        checkout.enterItem(s1);
        System.out.println("-----------------------------------------------------------------");

        /*Krimika & Carl test the toString for checkout here
         *
         *
         *
         */
        System.out.println("Output Receipt:");
        System.out.println();
        String receipt = String.format("Number of items: %d\nTotal cost: %.0f\nTotal tax: %.0f\nCost + Tax: %.0f",
                checkout.getNumberOfItems(),checkout.getTotalCost()*100,checkout.getTotalTax()*100,checkout.getTotalCost()*100+checkout.getTotalTax()*100);

        System.out.println(receipt);

        System.out.println(checkout.toString()); //Prints out entire receipt of all items which includes all information such as calories of the items.


        System.out.println("-----------------------------------------------------------------");


        System.out.println("Max Test With Same DessertItem Types"); //prints out items that were purchased
        maxString(candy, candy2);
        maxString(cookie, cookie2);
        maxString(ic,ic2);
        maxString(s,s1);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Max Test With Different DessertItem Types"); //prints out items that were purchased
        maxString(candy2, cookie2);
        maxString(s1, cookie);
        maxString(candy2, ic);
        maxString(s,cookie);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("The unsorted DessertList is:"); //prints out items that were purchased
        ArrayList<DessertItem> array = checkout.getArray();

        for(DessertItem d:array) {
            String output = String.format("%s(%s) has %.0f calories.", d.getName(),d.getType(),d.getCalories()); //by calling the .format, the system will print the name of the dessert item with it's appropriate number of calories
            System.out.println(output);
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("The sorted DessertList is:");
        
        //Calling Collections in order to sort the array using the 
        Collections.sort(array);

        for(DessertItem d:array) {
            String output = String.format("%s(%s) has %.0f calories.", d.getName(),d.getType(),d.getCalories()); //by calling the .format, the system will print the name of the dessert item with it's appropriate number of calories
            System.out.println(output);
        }


    }
 
    /**
     * This is a static method that invokes the max method of DessertItem in order to
     * compare two by calorie size
     * @param d1 is a dessert item object
     * @param d2 is a desert item object
     */
    public static void maxString(DessertItem d1, DessertItem d2) {
        DessertItem max = DessertItem.max(d1, d2); //.max is used to determine which of the two items ih higher in calories
        if(max==d1) { //if d1 = max, this if statement will run
            String output = String.format("%s(%s) with %.0f calories is bigger than %s(%s) with %.0f calories.", //print statement is displayed if d1 is higher in calories
                    max.getName(),max.getType(), max.getCalories(), d2.getName(),d2.getType(),d2.getCalories());
            System.out.println(output);
        }else {
            String output = String.format("%s(%s) with %.0f calories is bigger than %s(%s) with %.0f calories.", //print statement is displayed if d2 is higher in calories
                    max.getName(),max.getType(), max.getCalories(), d1.getName(),d1.getType(),d1.getCalories());
            System.out.println(output);

        }

    }




}
