/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package television;

/**
 *
 * @author jjsurfgirl
 */
import java.util.HashSet;
import java.util.Scanner;
public class TelevisionDemo {

    public static void main(String[] args) {
        // Create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        // Declare variables
        int station;         // The user's channel choice
        // Declare and instantiate a television object
        Television bigScreen = new Television("Toshiba", 55);
        // Turn the power on
        bigScreen.power();
        // Display the state of the television
        System.out.println("A "
                + bigScreen.getScreenSize()
                + " inch "
                + bigScreen.getManufacturer()
                + " has been turned on.");
        // Prompt the user for input and store into station
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();
        // Change the channel on the television
        bigScreen.setChannel(station);
        // Increase the volume of the television
        bigScreen.increaseVolume();
        // Display the the current channel and
        // volume of the television
        System.out.println("Channel: "
                + bigScreen.getChannel()
                + " Volume: "
                + bigScreen.getVolume());
        System.out.println("Too loud! Lowering the volume.");
        // Decrease the volume of the television
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        // Display the the current channel and
        // volume of the television
        System.out.println("Channel: "
                + bigScreen.getChannel()
                + " Volume: "
                + bigScreen.getVolume());
        System.out.println();   // For a blank line
        // HERE IS WHERE YOU DO TASK #5
        
        // my instaniation of portable
        Television portable = new Television("Sharp", 19);
        portable.power();
        System.out.println(portable.getChannel());
        portable.setChannel(5);
        portable.decreaseVolume();
        portable.decreaseVolume();
        //5.7 how do print state of portable
        
        System.out.println("A " + portable.getScreenSize() + 
                "inch Sharp has been turned on.\n" +  "What channel "
                        + "do you want? " + portable.getChannel()+ "\n"
                    + "Channel: " + portable.getChannel() + " Volume: " 
                    + portable.getVolume()
                    );
        
    }

}
