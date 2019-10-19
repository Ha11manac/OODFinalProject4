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
public class NoMoney implements State{
    Register register;

    public NoMoney(Register register) {
        this.register = register;
    }
    
    @Override
    public void askForPrice() {
        System.out.println("Here is the price");
        register.setState(register.getMoney());
    }

    @Override
    public void giveChange() {
        System.out.println("No money was given yet");
    }

    @Override
    public void waitFor() {
        System.out.println("Nothing Happened: Please give money");
    }

    @Override
    public void giveSandwich() {
        System.out.println("You need to pay");
    }
    
    public String toString(){
        return "waiting for money";
    } 
    
}
