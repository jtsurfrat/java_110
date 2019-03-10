/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * what is the difference between variable  and liter - variable can change
 * int dogsAge = 10 
  what is int, dogsAge = 12;
* int is an ressrved word, number is a litter
* final int conbersion FACTOR = 7 // final can't be change
  Objects do somehting
  Tabe = escape squance
*
 */
package dogsage;

import java.text.DecimalFormat;

/**
 * Description: Calculating a dogs age
 * @author Jenna Connolly
 * IPO chart
 * 
 * input Processing output
 * input           procesing 
 * dogsAge        HA= dA * 7  -> HA
 */
public class DogsAge {
    
private static DecimalFormat twoDecimals = new DecimalFormat(".##");
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //private static DecimalFormat twoDecimals = new DecimalFormat(".##");
    
        // Data Type Variable Name
        int dogsAge = 12; // 4bits for dogs age 
        //final int CONVERSTION_FACTOR = 2;
        int humanAge;
        boolean dong = false;
        int cat = 2;
        char firstLet;
        //char firstLetter = "a";
        
        System.out.println("How old is your dog?");
        System.out.println("Your dogs age is: " + dogsAge);
        //System.out.println(CONVERSTION_FACTOR + humanAge);
        
        System.out.println(dogsAge);
        
        
// asignment statement
        humanAge = dogsAge * 7; 
        System.out.println(humanAge); //operators +
        System.out.print("Your dog is " + humanAge +
                " years old in \' human years.\' ");
        System.out.println(dogsAge + humanAge); // does addiction
        System.out.println("Test:\t " + (dogsAge + humanAge)); // add perthes to add numbes
        
        byte shot = 0;
        int tall = 42;
        shot = (byte)tall; // casting
        //wrong because cannont fit byte into a tall
        System.out.println("Shot: " + shot);
        
        double bacon = 2;
        double stuff = Math.sqrt((bacon * bacon));
        System.out.println("Stuff: " + stuff + " bacon: "
            + (bacon * bacon));
        
        //bit 1
        // short 2
        // int 4, flout 4
        // ld long, double = 8
        int three = 3;
        double threeD = (double) three;
        System.out.println(threeD);
        
        double cat2 = 2.0;
        cat2 = (int)cat2;
        System.out.println((int)cat2);
        
        
    }
    
}
