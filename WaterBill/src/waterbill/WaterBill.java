/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbill;

/**
 * title: Water bill
 * @author Jenna Connolly
 * Description: water bill calculations
 */
import java.util.Scanner;

public class WaterBill {

    public static void main(String[] args) {
        boolean bacon = true;
        int accountNumber; 
        String code = "HCI"; // made a variable to hold string
        String accountCode;
        int minGallons = 0;
        //int maxGallons;
        int myGallons = 0;
        char accountLetter;
        double calculateCost = 0.0;
        //String printStuff = "";
            System.out.println("Bacon")

            greeting(); // greeting the user
            accountNumber = getAccountNumber(); // stores function for get accoutn
            myGallons = getGallons(minGallons);
            accountCode = getAccountCode(code);
            
            accountLetter = accountCode.charAt(0);
//            System.out.println("main method: " + accountNumber);  /test
//            System.out.println("main letter: " + accountLetter);
//            System.out.println("main gallon: " + myGallons);
            
            calculateCost = getCost(accountLetter, myGallons);
            System.out.println("main method: " +calculateCost);
            printValues(accountNumber, accountCode, calculateCost); // prints my value
            //myGallons = getGallons(int minGallons, int maxGallons);
            
        //} while(bacon == true);
    
    }
    
    
    public static int getGallons(int minGallons) {
        
        boolean loopOn = true;
        Scanner keyboard = new Scanner(System.in);
        int myGallons;
        int gallonsFinal = 0;
        System.out.println("Enter the number of gallons of water used: ");
        do {
            try {
                  
                myGallons = keyboard.nextInt();
                
                if(myGallons > minGallons){
                    gallonsFinal = myGallons;
                    loopOn = false;
                } else {
                    System.out.println("The number needs to be above"
                        + " 0");
                    keyboard.nextLine();
                }
            } catch(Exception e) {
                System.out.println("That's not a number!");
                keyboard.nextLine();
            }
            
        } while(loopOn);
        System.out.println("in getGallions: gallon: " + gallonsFinal);
        
        return gallonsFinal;
    }
    
    public static String getAccountCode(String accountCode){
        Scanner keyboard = new Scanner(System.in);
        String code;
        String letter = "";
        boolean loopOn = true;
        System.out.println("The valid letter codes indicating "
                + "your type of usage are I, H and C.");
        System.out.println(accountCode);
        do {
            try {
                code = keyboard.nextLine().toUpperCase();
                System.out.println("My code is:" + code);
                if(accountCode.contains(code)){
                    letter = code;
                    loopOn = false;
                    System.out.print("yes");
                } else {
                    System.out.print("no, that's the wrong code.");
                    keyboard.nextLine();
                }
                
            } catch(Exception e){
                System.out.println("That isn't a code.");
                keyboard.nextLine();
            }
            
            
        } while(loopOn);
        System.out.println("My letter is: " +letter);
        return letter;
    }
    
    //   Ask for the account code
    public static int getAccountNumber(){
        Scanner keyboard = new Scanner(System.in);
        int userId;
        boolean notDone = true;
        int min = 9_999;
        int max = 100_000;
        int finalUserId = 0;
        
        
        System.out.println("Please enter your 5 digit account:");
        
        
        do {
            
            try {
                userId = keyboard.nextInt();
                 // typing number in
                if (userId > min && userId < max) {
                    finalUserId = userId;
                    System.out.println();
                    notDone = false;
                } else {
                    System.out.println("Wrong number try again.Bacon!");
                }
            
            } catch (Exception e){
                System.out.println("That isn't a 5 digit number.");
                keyboard.next();
            }
        } while(notDone);
        System.out.println("userId: " + finalUserId);
        
        return finalUserId;
    }
    
    public static void greeting(){ // greets user
        System.out.println("City ON-LINE Water Billing program.");
    }
    // method wher calculate cose
    public static double getCost(char accountcode, int gallons) {
        final char H_CODE = 'H'; // making chars to compare to
        final char C_CODE = 'C';
        final char I_CODE = 'I';
        double total = 0.0;
        double hGallons = 25 + (0.005 * gallons); // made a math expersion
        double underfourMillGallons = 4_000_000; // making numbers storedin
        double tenMillion = 10_000_000; // varialbe
        double twoThousand = 2_000;
        double threeThousand = 3_000;
        double fiveThousand = 5_000;
        double cgallonsOver = gallons - underfourMillGallons;
        double cGallonsOverTotal = twoThousand +(0.0025 * cgallonsOver);
        
//        System.out.println("accountcod is: " + accountcode);
//        System.out.println("gallons is: " + gallons);
        
        switch(accountcode){ // made a switch statement base on account
            case H_CODE:                     // code
                   total = hGallons; 
                   
                break;
            case C_CODE:
                if(gallons <= underfourMillGallons){
                   total = twoThousand; 
                } else {
                   total = cGallonsOverTotal;
                }
                break;
            case I_CODE:
                if(gallons <= underfourMillGallons){
                    total = twoThousand;
                } else if (gallons <= tenMillion){
                    total = threeThousand;
                } else {
                    total = fiveThousand;
                }
                break;
                   
        }
        System.out.println("Total: " +total);

//  Calculate bill and return the results
        return total;

    }
    
    public static void printValues(int accountNumber, String accountCode, 
            double calculateCost){
        System.out.println("");
        System.out.println("Customer ID\t" + "Code\t" 
                        + "Gallons Used\t" + "Billing Amount ($)");
        System.out.println("");
        System.out.println("====================================="
                + "=======================");
        System.out.println("");
        System.out.println(accountNumber +"\t\t" + accountCode +"\t" 
                        + "Gallons Used\t\t" + calculateCost);
        System.out.println("");
    }
//    public static void stuff(){
//        System.out.println("Here");
//        for(int i = 0;i < 10;i++){
//            for(int j){
//               System.out.print("*"); 
//            }
//            
//        }
//    }
    
}


    // TODO code application logic here
        
        /**
     * 
     * / Example of how the method is called

accountNumber = getAccountNumber();

// Pseudocode

public static int getAccountNumber()  {

  // Repeat

  //   Ask for the account code

  //   Get account code

  //   Check to see if it is right

 // Until it is right

  // Return account code
     * 
     * ode = getAccountCode("HCI");

// Pseudo Code for the method

public static char getAccountCode(String codes) {

  // Repeat

  //  Ask for code

  //  Get input

  //  Check if input is a member of codes

  // Until they do it right

  // Return input capitalized

}
