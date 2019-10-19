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
public interface State {
    //atm
        //no card
        ////card inserded
        //no money
        //money given
    public void askForPrice();
    public void giveChange();
    public void waitFor();
    public void giveSandwich();
    

            
}
