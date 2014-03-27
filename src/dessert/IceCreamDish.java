/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dessert;

/**
 *
 * @author jkemper3
 */
public class IceCreamDish extends Dessert {

    public IceCreamDish() {
        description = "Ice Cream Dish";
    }

    // provided implementation 
    public double cost() {
        return 0.99;
    }
}
