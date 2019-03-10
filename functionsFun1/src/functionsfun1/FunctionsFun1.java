/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionsfun1;

/**
 * Description practice with data validation and nestedf loops
 * @author jjsurfgirl
 * 
 */
import java.util.Scanner;
public class FunctionsFun1 {

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
        
        
        do {
            done = false;
           
           // System.out.println("Enter the temp"); 
            do {
                System.out.println("Enter the temp"); 
                temp = stdin.nextInt();
                if(temp < -45 || temp > 50) {
                   // System.out.println("Enter the temp"); 
                } else {
                    done = true;
                }

            } while (!done);
            done = false;
            

            do {
                System.out.println("Enter windspeed");
                windSpeed = stdin.nextInt();

                if(windSpeed < 0 || windSpeed > 50) {
                    System.out.println("Enter the temp"); 
                } else {
                    done = true;
                }

            } while(!done);
            System.out.println("Winchill calcuated to be verer cold!");
            System.out.println("Play again? [Y/N]");
            stdin.nextLine();  // clear buffer
            keepPlaying = stdin.nextLine();
            if(keepPlaying.equalsIgnoreCase("Y") == false){
               playAgain = false;
            }
        } while(!playAgain);
    }   
    
}
