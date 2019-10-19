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
public class OvenOff implements Work{
    Oven oven;
    
    public OvenOff(Oven oven){
        this.oven = oven;
    }
    
    public void execute(){
        oven.off();
    }
}
