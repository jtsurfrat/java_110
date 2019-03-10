/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwith.methods;

import java.util.Scanner;

/**
 * Description Learn about basic method Fun!!
 * Author Jenna Connolly
 * @author jjsurfgirl
 */
public class FunWithMethods {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        
        Scanner stdin = new Scanner(System.in);
        // TODO code application logic here
        int temp;
        boolean done = false;
        int windspeed;
        boolean playAgain = true;
        String keepPlaying;
        int windSpeed;
        
        
        
        // first
//        System.out.println("Enter the temperature");
//        
//       temp = stdin.nextInt();
//        while(temp < -45 || temp > 50 ){
//            System.out.println("Invalid, try again");
//            temp = stdin.nextInt();
//        }
         // sent to say your are not done
        
        greeting();
       
        do {
            temp = getInt("Enter the temp: ", -45, 50);
            windSpeed = getInt("Enter Wind speed",0, 50);
            //done = false;
            
           
           // System.out.println("Enter the temp"); 
//            do {
//                //System.out.println("Enter the temp"); 
//                temp = getInt("Enter the temp.");
//                if(temp < -45 || temp > 50) {
//                   // System.out.println("Enter the temp"); 
//                } else {
//                    done = true;
//                }
//
//            } while (!done);
//            done = false;
            

//            do {
//                System.out.println("Enter windspeed");
//                windSpeed = getInt("Enter the ");
//
//                if(windSpeed < 0 || windSpeed > 50) {
//                    System.out.println("Enter the temp"); 
//                } else {
//                    done = true;
//                }

           // } while(!done);
            System.out.println("Winchill calcuated to be verer cold!");
            System.out.println("Play again? [Y/N]");
           // stdin.nextLine();  // clear buffer Dont need it
            keepPlaying = stdin.nextLine();
            if(keepPlaying.equalsIgnoreCase("Y") == false){
               playAgain = false;
            }
        } while(playAgain);
    }   
        
        
    public static void greeting() {
        System.out.println("Welcome to the Windchill program");
        System.out.println("Best Program ever!");
    }
    
    public static int getInt(){
        Scanner stdin = new Scanner(System.in);
        int input;
        input = stdin.nextInt();
        stdin.nextLine();
        return input;
    }
    
    public static int getInt(String prompt){
        Scanner stdin = new Scanner(System.in);
        System.out.println(prompt);
        int input;
        input = stdin.nextInt();
        stdin.nextLine();
        return input;
    }
    
    public static int getInt(String prompt, int min, int max){
        Scanner stdin = new Scanner(System.in);
        boolean done = false;
        int input;
        do {
            System.out.println(prompt + " between " + min + " and " + max);
            input = getInt();
            
            if(input < min || input > max){
                System.out.println("Invalid, trying agin");
            } else {
                done = true;
            }
            
        } while(!done);
     
        return input;
    }
    
}


// test question c programm - overloading
// determine method by parmeter