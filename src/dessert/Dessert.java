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
public abstract class Dessert {

   String description = "none";
    
   
     public String getDescription() {
        return description;
    }

    public abstract double cost ();
}
