/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpg1;

/**
 *
 * @author jjsurfgirl
 */
import java.util.Scanner;
import java.text.DecimalFormat;
//simport java.util.D

public class MPG1 {

    /**
     * Title: MPG
     * Nume: Jenna Connolly
     * Description: convert miles and gallons
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // 3 arrays
        
        char m = 'm'; // miles char
        char g = 'g'; // gallons char
        char c = 'c' ; // character char
        char t = 't'; // total char
        
        
        int weeksNumber;
        double[] miles; // creating array
        double[] gallons; // gallons array
        double[] mpg; // mpg array
        
        double[] getMiles;
        double[] getGallons;
        double[] getMpg;
        double[] getTotal;
        
       
        
        Scanner keyboard = new Scanner(System.in);
        
        
        greeting();  // calls greeting 
        weeksNumber = keyboard.nextInt(); //creating number length for all arrays
        miles = new double[weeksNumber]; // assiging number length to new arrays
        gallons = new double[weeksNumber];
        mpg = new double[weeksNumber];
        getMpg = new double[weeksNumber];
        getTotal = new double[weeksNumber];

        // make new vairables to store function classes in
        getMiles = getInputs(m, miles);
        getGallons = getInputs(g, gallons);
        getMpg = getCalculation(getMiles, getGallons, mpg, weeksNumber, c);
        printString(weeksNumber, getMiles, getGallons, getMpg);
        
    }
    
    public static double[] getInputs(char character, double [] array){
      
//        double[] array = {};
        boolean notDone = true;
        Scanner keyboard = new Scanner(System.in); // bacon
        double userInput; 
        
       
        // checks if it's miles and assigns it greetins
        if(character == 'm'){
            System.out.println("Please type in miles in "+ array.length + 
                    " weeks.");
        } else {
            System.out.println("Please type in gallons " + array.length + 
                    " for weeks.");
        }
        
        for(int i = 0; i < array.length; i++){
            userInput = keyboard.nextDouble();
            
            array[i] = userInput;
            System.out.println(array[i]);
 
        }
 
        return array;
    }
    
    // does calculations and stores in new array
    public static double [] getCalculation(double [] miles, double [] gallons,
        double [] mpg, int weeksNumber, char x) {
        double [] result = new double[weeksNumber];
        
        for(int i = 0; i < mpg.length; i++){ // loops throught mpg
            if(x == 'c'){ // checks character
               result[i] = miles[i]/gallons[i]; // adding calcuations to new array
               System.out.println(mpg[i]); 
            } else {
                result[i] = miles[i]/gallons[i];
            }
            
        }
        
        return result;
        
    }
     
    
    // greeting functions
    public static void greeting(){
         System.out.println("Welcome To miles Per gallon.");
         System.out.println("Please type in number of the weeks.");
    }
    
    public static void printString(int weeksNumber, double [] getMiles, 
        double [] getGallons, double [] getMpg){
        
        int whichWeek = 0;
        double totalMiles = 0;
        double totalGallons = 0;
        double totalMpg = 0;
        DecimalFormat formatter = new DecimalFormat("#0.0");
        
        System.out.println("\tMiles\tGallons\tMPG");
        System.out.println("\t-----\t-------\t---");
        for(int i = 0; i < getMpg.length; i++){
            whichWeek = i +1;
            totalMiles += getMiles[i];
            totalGallons += getGallons[i];
            totalMpg += getMpg[i];
            
            System.out.println("Week:" + whichWeek  + 
                    "\t" + formatter.format(getMiles[i]) +
                    "\t" + formatter.format(getGallons[i]) + "\t" + 
                    formatter.format(getMpg[i]));
            //System.out.println(getMpg[i]);
        }
        totalMpg = totalMpg/weeksNumber;
        System.out.println("Total:\t" + formatter.format(totalMiles)  + "\t" 
                            + formatter.format(totalGallons) +
                                "\t" + formatter.format(totalMpg) + "\t" );
    }
    
}
