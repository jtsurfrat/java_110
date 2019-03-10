/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinconverter;

/**
 * Assignment  varialbes lab - document you code well
 * Code conventions
 * Description: Convert Pennies to Quarters, Dimes, Nickels and Pennies
 * 2 QTRS
 * 2 Dimes
 * 2 nikels 
 * 2 pennies
 * @author jjsurfgirl
 */
import java.util.Scanner; // Imports Scanner class to read input from user
public class CoinConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare Variables
                                    // reading from input
        Scanner input = new Scanner(System.in); // create a scanner Oject
        
        int pennies, // number of Pennies from the user
            nickels,  // Output Varialbes
            dimes,
            quarters;
        
        // Declare Constants
        final int QUARTER_QTY = 25;
        final int DIME_QTY = 10;
        final int NICKEL_QTY = 5;
        final int PENNY_QTD = 1;
        
        while (true) {
            
                    // Get Input
        //pennies = 82;  // declaring pennies varaible static valut4
        
        // Processing
        System.out.println("Plearse enter the number of pennies: ");
        pennies = input.nextInt();
        quarters =  pennies/QUARTER_QTY;
        
        pennies = pennies % QUARTER_QTY;
        dimes = pennies /DIME_QTY;
        pennies = pennies % DIME_QTY;
        nickels = pennies / NICKEL_QTY;
        pennies = pennies % NICKEL_QTY;
        
        // Display Output
        System.out.println("Quaters: \t" + quarters);
        System.out.println("Dimes: \t" + dimes);
        System.out.println("nickes: \t" + nickels);
        System.out.println("Pennies: \t" + pennies );
        
        
        // TODO code application logic here
//        System.out.println(5/3); // it's doing intereger division
//        System.out.println(5 % 3); // Modulos, finds the reminder
//        
//        System.out.println((double)5/3); //casting as double
//        
//        System.out.println(5.0/3); // Foating Point divison2
        }
        

    }
    
}
