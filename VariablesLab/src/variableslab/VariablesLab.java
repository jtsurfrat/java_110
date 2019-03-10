
 
package variableslab;

import java.text.DecimalFormat;

/**
 * Title: Vaiable Labe
 * @author Jenna Connolly
 * Description: Labe about variables
 * DATE: 08/26/2018
 * 4 bytes interger stores: 32 bitss
 * short 16 bits
 * first number is most signifacant 
 * 
 */

public class VariablesLab {
    
    
    
    public static void main(String[] args) {
        
        
   
        // declare variables 
        int bossSalary;
        short cookSalary;
        double bossPayPeriod;
        int cookPayPeriod;
        boolean bossIsAJerk;
        
        //due Assign Values
        bossSalary = 120196;
        cookSalary = 20196;
        bossPayPeriod = 52.0;
        cookPayPeriod = 52;
        bossIsAJerk = true;
        
        // display results
        System.out.println("Boss\'s Salary is " + bossSalary);
        System.out.println("Cook\'s Salary is " + cookSalary);
        
        if(bossIsAJerk == true ){
            System.out.println("The boss is a jerk.");
        }
        
         System.out.println("The boss\'s " +bossSalary / bossPayPeriod);
         System.out.println("The boss\'s " +(bossSalary / bossPayPeriod));
         
         // cooks pay period
         System.out.println("The cooks\'s " +(cookSalary / cookPayPeriod));
         
         // assign boss salary to cook's salary
          //corrutpt data
         cookSalary = (short)bossSalary;
         
         //display results
         System.out.println("Cook\'s salary is: " + cookSalary);
         

         double a = 3;
         double b = 4;
         double bacon;
         double c;
         
         c = Math.sqrt((a*a) + (b*b));
         System.out.println("C is:" + c);
         bacon =Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
         System.out.println("C =" + c);
         
         
    }
    
}
