/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SandwichStuff;

import Command.*;
/**
 *
 * @author pokem
 */
public class RunOven {
    Sandwich s; 
    public RunOven(Sandwich sandwich, Oven oven){
        s = sandwich;
        //objects that will be used in the if statement
        Controller c = new Controller();
        OvenOn ovenOn = new OvenOn(oven);
        OvenOff ovenOff = new OvenOff(oven);

        SandwichCooking saCooking = new SandwichCooking(s);
        SandwichCooked saCooked = new SandwichCooked(s);
        //start oven
        c.setWork(ovenOn);
        c.activated();

        //start cooking sandwich
        c.setWork(saCooking);
        c.activated();

        // finish cooking sandwich
        c.setWork(saCooked);
        c.activated();
        s = new Cooked(s);

        //turn off oven 
        c.setWork(ovenOff);
        c.activated();

        //go to next part 
        //for testing 
        //System.out.println(s.getSName());
    }
    
    public Sandwich sendBack(){
        //test to see if correct sandwich is passed back
        //System.out.println(s.getSName());
        return s;
    }
}
