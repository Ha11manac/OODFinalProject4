/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author pokem
 */

import SandwichStuff.*;
import Command.*;
import SandwichStuff.ToppingStuff.*;
import Register.*;
import java.util.Scanner;
import java.util.ArrayList;

public class LittleShopStart {
    public static ArrayList<String> check;
    public static void main(String[] args){
        //extra variables 
        check = new ArrayList<>();
        int menuCount =0;
        
        //for user input to order
        Scanner scan = new Scanner(System.in);
        String order = null;
        boolean onMenu = false;
        Sandwich sandwichOrder;
        
        //make menu
        SandwichShopMenu Sandwich = new SandwichShopMenu();
        Iterator SandwichI = Sandwich.createIterator();
        
        //make oven
        Oven oven = new Oven();
        
        //Start to print menu
        System.out.println("Menu");
        showMenu(SandwichI);
        
        //saveMenu(SandwichI);
        
        
        check = Sandwich.getMenu();
        /*
        //to see what is in check
        for(int i = 0; i < check.size(); i++) {   
            System.out.print(check.get(i));
        }
       */
        while(!onMenu){
            System.out.println("What sandwich would you like?");
            order = scan.nextLine();
            
            //must be capital to match
            if (check.contains(order)){
                System.out.println("Item is on Menu");
                onMenu = true;
                
                //make sandwich reflect this
                //testing to make sure name is passed down
                //System.out.println(sandwich.getSName());
            }
            else{
            //for testing
                System.out.println("Item is not on Menu. /nPlease place order again.");
                
            }
        }
        sandwichOrder = new SandwichOrder(order);
        //start making sandwich
        //cooking sandwich if customs wants to
        System.out.println("\nWould You Like It Cooked? (Yes or No)");
        String cook = scan.next();
        if(cook.equalsIgnoreCase("yes")){
            RunOven run = new RunOven(sandwichOrder, oven);
            
            //for testing 
            sandwichOrder = run.sendBack();
            //System.out.println(sandwichOrder.getSName());
        }
        else{
            System.out.println("Moving down counter");
            sandwichOrder = new Cold(sandwichOrder);
            
            //for testing
            //System.out.println(sandwichOrder.getSName());
        }
        //here to make sure sandwich is keeping changes at the end of program
        System.out.println(sandwichOrder.getSName());
        
       //add decorators
        String toppingsYN = null;
        System.out.println("Would you like to add Condoments or Toppings to your sandwich?");
        toppingsYN = scan.next();
        String whiletop = toppingsYN;
        while(whiletop.equalsIgnoreCase("yes") /*|| toppingsYN.equalsIgnoreCase("done")*/){
            System.out.println("Pick what you would like to add: (One at a time)/nCheese, Bacon, Mayo, Tomato /nOr Done to continue ");
            String addon = scan.nextLine();
            if(addon.equalsIgnoreCase("Cheese")){
                sandwichOrder = new Cheese(sandwichOrder); 
            }
            else if(addon.equalsIgnoreCase("Bacon")){
                sandwichOrder = new Bacon(sandwichOrder);
                //System.out.println("Bacon here");
                //toppings = false;
            }
            else if(addon.equalsIgnoreCase("Mayo")){
                sandwichOrder = new Mayo(sandwichOrder);
                //toppings = false;
            }
            else if(addon.equalsIgnoreCase("Tomato")){
                sandwichOrder = new Tomato(sandwichOrder);
                //toppings = false;
            }
            else if(addon.equalsIgnoreCase("done")){
                whiletop = "done";
                //break;
            }
            else{
                System.out.println("Please pick an option from the list provided");
                //toppings = "Done";
            }
        }
        //System.out.println("here");
        System.out.println(sandwichOrder.getSName());
        //make register
        Register r = new Register(sandwichOrder);
        boolean payed = false;
        while(!payed){
            System.out.println("Pay for Sandwich or Take?(Pay or Take)");
            String oPay = scan.next();
            if(oPay.equalsIgnoreCase("Pay")){
                payed = true;
                System.out.println(r);

                r.askForPrice();
                r.waitFor();
            }
            else{
                r.waitFor();
                System.out.println(r);

            }
        }
        scan.close();
            
    }
    
    
    private static void showMenu(Iterator iterator){
        while (iterator.hasNextItem()){
            String menuI = (String) iterator.next();
            System.out.println(menuI);
        }
    }
     private static void saveMenu(Iterator iterator){
        while (iterator.hasNextItem()){
            String menuI = (String) iterator.next();
            check.add(menuI);
        }
    }
}
