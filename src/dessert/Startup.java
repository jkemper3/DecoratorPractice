/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dessert;

import java.text.NumberFormat;

/**
 *
 * @author jkemper3
 */
public class Startup {

    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        Dessert dessert = new Sundae();
        dessert = new Sprinkles(dessert);
        dessert = new HotFudge(dessert);
        dessert = new Strawberries(dessert);

        System.out.println(dessert.getDescription() + " " + nf.format(dessert.cost()));

        Dessert dessert2 = new IceCreamCone();
        dessert2 = new HotFudge(dessert2);
        dessert2 = new Sprinkles(dessert2);

        System.out.println(dessert2.getDescription() + " " + nf.format(dessert2.cost()));

    }
}
