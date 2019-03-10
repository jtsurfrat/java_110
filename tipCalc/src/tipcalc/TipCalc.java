/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipcalc;

/**
 *Title: Tip Calcutor
 * Descritions: Calculates tip and total
 * @author Jenna Connolly
 * Date 08/05/2018
 */

import java.util.Scanner;
public class TipCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner stdin = new Scanner(System.in);
        //variables and constants
        int serviceLevel;
        double bill,   //Bill without tax
                tip = 0,   //Tip based on the bill 
                totalAmount; //bill + tip + tax for bill amount
        final double BAD_PERCENT = .1, //Service level tip percents
                     GOOD_PERCENT = .15,
                     GREAT_PERCENT = .2;
        final double TAX_RATE = 1.0795; // tax rate for scottsdale
        
        
        //input
        System.out.println("What was the bill");
        bill = stdin.nextDouble();
        System.out.println("Enter the Service level. 1)Bad, 2)Good 3"
                + " Great");
        
        serviceLevel = stdin.nextInt();
        
        //processing
        // two equal signs = comparison
        if(serviceLevel == 1) {
            tip = bill * BAD_PERCENT;
        }
        if(serviceLevel == 2) {
            tip = bill * GOOD_PERCENT;
        }
        if(serviceLevel == 3) {
            tip = bill * GREAT_PERCENT;
        }
        // output
        
        totalAmount = bill * TAX_RATE + tip;
        
        // how to get two decimal places
        System.out.printf("%.2f%n", totalAmount);
        totalAmount = (int)(totalAmount * 100) /100.0;
        
        System.out.println("Bill \t Tip \t Total");
        System.out.println(bill + "\t" + tip + "\t" + totalAmount);
        
        int bonus, sales = 10000;

if (sales < 5000)
   bonus = 200;
else if (sales < 7500)
   bonus = 500;
else if (sales < 10000)
   bonus = 750;
else if (sales < 20000)
   bonus = 1000;
else
   bonus = 1250;
        
        System.out.println(bonus);
        
    }
    
}
