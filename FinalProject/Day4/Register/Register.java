/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;
import SandwichStuff.*;

/**
 *
 * @author pokem
 */
public class Register {
    State money;
    State noMoney;
    State sandwichGiven;
    State noSandwich;
    
    State state;
    Sandwich sandwich;
    
    public Register(Sandwich sandwich) {
        money = new Money(this);
        noMoney = new NoMoney(this);
        sandwichGiven = new SandwichGiven(this);
        noSandwich = new NoSandwich(this);
        state = noMoney;
        //addsandwich stuff
        this.sandwich = sandwich;
    }
    
    public void askForPrice(){
        state.askForPrice();
    }
    public void giveChange(){
        state.giveChange();
    }
    public void waitFor(){
        state.waitFor();
        //prints line that says what is given
        state.giveSandwich();
        
    }
    
    void releaseSandwich() {
        System.out.println(sandwich.getSName());
        //change to sandwich
    }
    
    public Sandwich getSandwich() {
        return sandwich;
    }
    
    
    
    void setState(State state) {
        //allows state to change
        this.state = state;
    }
    
    public State getState() {
        //return state
        return state;
    }

    public State getNoSandwich() {
        return noSandwich;
    }

    public State getNoMoney() {
        return noMoney;
    }

    public State getMoney() {
        return money;
    }

    public State getSandwichGiven() {
        return sandwichGiven;
    }
    //fix later
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nLittle Sandwich Shop");
        result.append("\nOrder");
        //result.append("\nCurrent amount: $" + money);
        result.append("\n");
        result.append(state+ "\n");
        return result.toString();
    }
    
}
