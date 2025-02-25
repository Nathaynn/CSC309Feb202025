package lab.assignment.after.clientcode;

import lab.assignment.after.AmericanoCoffee;
import lab.assignment.after.CapuccinoCoffee;
import lab.assignment.after.CoffeeTemplate;
import lab.assignment.after.MochaCoffee;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeTemplate someCoffee = new MochaCoffee();
        someCoffee.prepareCoffee();
        System.out.println("********************");
        someCoffee = new CapuccinoCoffee();
        someCoffee.prepareCoffee();
        System.out.println("********************");
        someCoffee = new AmericanoCoffee();
        someCoffee.prepareCoffee();

    }

}