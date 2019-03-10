/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windchill2_final;

/**
 *
 * @author jjsurfgirl
 */
import java.util.Scanner;

public class WindChill2_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final char CELSIUS_CHAR = 'c',
                FAHRENHEIT_CHAR = 'f';

        String userLetter;
        String tempString;
        String userInputWeather;
        char userTempChar;
        int spaceIndex;
        int tempNum = 0;
        String userTempLetter;
        boolean playAgain = true;
        String keepPlaying = "Y";
        boolean isFarh = true;
        String letterTru = " ";
        int errorCounter = 0;
        
        do {
            
            // creating o scanner object
            Scanner stdin = new Scanner(System.in);
            
            greeting(); // prints out greeeting
          

            userInputWeather = stdin.nextLine();
            spaceIndex = userInputWeather.indexOf(" "); // creating the space and finding index of space
            
            tempString = userInputWeather.substring(0, spaceIndex); //
            tempNum = Integer.parseInt(tempString);

            userTempChar = userInputWeather.charAt(spaceIndex+1);
            System.out.println("The Temp You choose: " + tempNum + " "
               + userTempChar     );
            
            if (userTempChar == 'f' || userTempChar == 'c') {
               isFarh = checkChar(userTempChar,isFarh);
            } else {
                errorCounter += 1;
            }
            System.out.println(isFarh);

            // play again
            System.out.println("Play again? [Y/N]");
            keepPlaying = stdin.nextLine();
            if (keepPlaying.equalsIgnoreCase("Y") == false) {
                playAgain = false;
            }
        
        } while(playAgain);

    }
    
    public static void greeting(){
        System.out.println("Welcome to the Windchill Game!");
        System.out.println("Please time number followed by F or C");
    }
    
    public static boolean checkChar(char userTempChar, boolean isFarh){
        boolean notDone = true;
        int MAX_TEMP = 0;
        int MAX_TEMP2 = 0;
//        while (notDone){ 
       
            if(userTempChar == 'f'|| userTempChar == 'c'){
                isFarh = true;
            } else if (userTempChar == 'c') {
                isFarh = false;
            }
            System.out.println(isFarh);
            
//            if(userTempChar == 'f' &&  ){
//                
//            }
            

//         }
        return isFarh;
    }
    
    // create something that has min and max based on
    // if its f or c

}
