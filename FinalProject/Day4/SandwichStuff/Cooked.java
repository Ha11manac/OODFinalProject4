/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SandwichStuff;


/**
 *
 * @author pokem
 */
public class Cooked extends Additions {
    public Cooked(Sandwich sandwich){
        this.sandwich = sandwich;
    }
    
    public String getSName() {
        return sandwich.getSName() + " is Cooked";
    }
}
