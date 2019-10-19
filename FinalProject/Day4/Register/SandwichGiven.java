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
public class SandwichGiven implements State{
    Register register;

    public SandwichGiven(Register register) {
        this.register = register;
    }
    
    @Override
    public void askForPrice() {
        System.out.println("Please wait Sandwich is already paid for");
    }

    @Override
    public void giveChange() {
        System.out.println("Here is your change");
    }

    @Override
    public void waitFor() {
        System.out.println("Please Wait.");

    }

    @Override
    public void giveSandwich() {
        System.out.println("Thank you for ordering.");
        register.releaseSandwich();
        
        
    }

    
    public String toString(){
        return "Here is your sandwich";
    } 
    
}
