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
public class Money implements State{
    Register register;

    public Money(Register register) {
        this.register = register;
    }
    
    @Override
    public void askForPrice() {
        System.out.println("Money was already given");
    }

    @Override
    public void giveChange() {
        System.out.println("Here is your money back.");
        register.setState(register.getNoMoney());
    }

    @Override
    public void waitFor() {
        System.out.println("Processing....");
        register.setState(register.getSandwichGiven());
    }

    @Override
    public void giveSandwich() {
        System.out.println("Sandwich wasnt given yet");
    }
    
    public String toString(){
        return "Waiting on register";
    } 
    
}
