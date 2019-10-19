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
public abstract class Sandwich {
    String name = "TBD Sandwich";
    Sandwich sandwich;
    
    public String getSName() {
        return name;
    }
    public void Cooking() {
        System.out.println("Sandwich is cooking\n");
    }

    public void Cooked() {
        System.out.println("Sandwich is ready\n");
    }
}