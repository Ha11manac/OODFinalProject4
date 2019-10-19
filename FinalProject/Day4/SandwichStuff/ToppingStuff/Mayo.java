/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SandwichStuff.ToppingStuff;

import SandwichStuff.Sandwich;

/**
 *
 * @author pokem
 */
public class Mayo extends Toppings{
    public Mayo(Sandwich sandwich){
        this.sandwich = sandwich;
    }
    
    public String getSName() {
        return sandwich.getSName() + ", Mayo";
    }

}
