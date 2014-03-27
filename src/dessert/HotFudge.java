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
public class HotFudge extends ToppingsDecorator{
    
    Dessert dessert;
    
    public HotFudge(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        // combined descrition
        return dessert.getDescription() + ", Hot Fudge";
            
    }
     public double cost () {
        // combined cost
        return 0.1 + dessert.cost();
    }

    
}
