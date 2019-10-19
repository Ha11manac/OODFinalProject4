/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;


/**
 *
 * @author pokem
 */
public class NoSandwich implements State{
    Register register;

    public NoSandwich(Register register) {
        this.register = register;
    }
    
    @Override
    public void askForPrice() {
        System.out.println("No sandwich was made");
    }

    @Override
    public void giveChange() {
        System.out.println("No money was given");
    }

    @Override
    public void waitFor() {
        System.out.println("Waiting but nothing happened");
    }

    @Override
    public void giveSandwich() {
        System.out.println("No sandwich was given");
    }
    
    public String toString(){
        return "No sandwich available";
    } 
    
}
