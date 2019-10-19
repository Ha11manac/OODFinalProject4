/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;



/**
 *
 * @author pokem
 */
public class Controller {
    Work action;
 
    public Controller() {}

    public void setWork(Work command) {
        action = command;
    }

    public void activated() {
        action.execute();
    }   
}
