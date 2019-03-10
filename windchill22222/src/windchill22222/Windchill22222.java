/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windchill22222;

/**
 *
 * @author jjsurfgirl
 */
import java.util.Scanner;
public class Windchill22222 {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declare CONSTANTS
        // Declare Variables

        // Variables and Constants
        int errorCount = 0;
        final char CELSIUS_CHAR = 'c',
                FAHRENHEIT_CHAR = 'f';
        boolean rightAnwser = false;
        char inputLetter;
        String userInput;
        //String userLetter;
        //int tempeture;
        int chill;
        int celsiusTemp;
        int fahrenheitTemp;
        int airTemp;
        int speedOfWind;
        boolean rightSpeed = false;
        boolean rightTemp = false;
        boolean tempBool;
        double convertToFar;
        double convertToCel;
        double windChillFarh = 0.0;
        String day;
        
        String userStr;
        int spaceIndex;
        int tempterNumber = 0;
        String tempterString;
        String userLetter;
        char userTempChar = ' ';
        tempBool = false;
        int temp1 = 50;
        int temp2 = 20;
        int temp3 =  0;
        int averge = 0;
        //int onOff = 0;
        
        //creating scanner object
        Scanner stdin = new Scanner(System.in);
        
        System.out.println("Wind Chill calculation program.");
        
        while(!rightAnwser){
            System.out.println("Please enter the air temperature followed by "
                    + "the unit.  For example, 25 F for Fahrenheit or 25 C "
                    + "for Celsius.");
        
            // setting userSt
            userStr = stdin.nextLine();
            spaceIndex = userStr.indexOf(" ");
            //
            tempterString = userStr.substring(0, spaceIndex);

            try {
                /// intizializing temterNumber coverting it to number
                tempterNumber = Integer.parseInt(tempterString);
                userLetter = userStr.substring(spaceIndex+1).toLowerCase();
                userTempChar = userLetter.charAt(0);
                 System.out.print(tempterString + " " + userTempChar);
                
                 // checking to see if it's right charater
                if (userTempChar == CELSIUS_CHAR ||userTempChar == FAHRENHEIT_CHAR){
                   tempBool = checkTemp(tempterNumber, userTempChar, 
                        FAHRENHEIT_CHAR,CELSIUS_CHAR, tempBool);
                    System.out.println(tempBool + "TempBool" + "onoff ");
                    //rightAnwser = true; 
                    if(tempBool) {
                        rightAnwser = true; 
                        
                        
                    } else {
                        System.out.println("Farh needs to be in Rang of"
                                + " -40 to 50");
                         System.out.println("Celis needs to be in Rang of"
                                + " -40 to 10");
                    }
       
                
                } else {
                    System.out.print("Wrong Input.");
                    errorCount += 1;
                }
                
            } catch(NumberFormatException e){
                System.out.print("Error that isn't an Int or String");
                errorCount += 1;
            }
            
        }
        
    
    // calcuat windchll 
    System.out.println("WindSpeed: ");
    speedOfWind = stdin.nextInt();
    // checks if charcter = Fah
    if(userTempChar == FAHRENHEIT_CHAR) {
        windChillFarh = windChill(speedOfWind,tempterNumber);
        System.out.println(windChill(speedOfWind,tempterNumber) +
        "Windchill");
        System.out.println("The wind chill factor is "+ windChillFarh +
        " degrees Celsius");
    } else {
        convertToFar = toFartheit(tempterNumber);
        System.out.println(windChill(speedOfWind,(int)convertToFar) + 
                "FarhWindchill");
        System.out.println(convertToFar);
        windChillFarh = windChill(speedOfWind,(int)convertToFar);

        convertToCel = toCelius(windChillFarh);
        System.out.println(convertToCel + "Celius Wind chill");
//tempterNumber = convertToCel;
        System.out.println("The wind chill factor is "+ convertToCel +
        " degrees Celsius");
        
        //temp1
        if(tempterNumber > temp3){
            System.out.println("It's a nice day for a walk.");
        } else if(tempterNumber > temp2){
            System.out.println("Time to go Ice Skating");
        } else {
            System.out.println("Too cold, let's stay at home and eat"
                    +" bacon.");
        }
}    
    
    
    
//    if(userTempChar == FAHRENHEIT_CHAR) {
//        windChillFarh = windChill(speedOfWind,tempterNumber);
//        System.out.println(windChill(speedOfWind,tempterNumber) + "Windchill");
//        System.out.println("The wind chill factor is "+ windChillFarh +
//                " degrees Celsius");
//    } else {
//        convertToFar = toFartheit(tempterNumber);
//        System.out.println(windChill(speedOfWind,(int)convertToFar) + "Farh Windchill");
//        System.out.println(convertToFar);
//        convertToCel = toCelius(convertToFar);
//        System.out.println(convertToCel + "Celius Wind chill");
//        //tempterNumber = convertToCel;
//        System.out.println("The wind chill factor is "+ convertToCel +
//                " degrees Celsius");
//    }
    
    //       System.out.println(tempterNumber); 
//        
//        
//       System.out.println(toCelius(50));
//       System.out.println(toCelius(-40));
       
       // range for ceilus is  40 - 10
       // 


       averge = calcAverage(20,70);
       System.out.println(averge + "Average");

    }
    
    
    public static double toCelius(double farenheit){
        double celius;
        celius = (farenheit - 32)/ 1.8;  
        return celius;
    }
    
     // create ceilus calcuation
    public static double toFartheit(double celius){
        double farenheit;
        farenheit = (1.8 * celius)+ 32;
        return farenheit;
    }
    public static double windChill(int speedOfWind, int airTempture){
        
        double speedOfWindSqt;
        double windChill;
        // calculation done here
        
        speedOfWindSqt = Math.sqrt(speedOfWind); //Squaring root windspeed
        windChill =(91.4 - airTempture)* ((.478 + 
                (.301 * speedOfWindSqt) - (.02 * speedOfWind)));
        
        // last calcuation for windchill, also making it 1 decimal
        windChill= Math.round((91.4 - windChill)* 10.0) /10.0; 
        return windChill;
        
    }
    
    public static boolean checkTemp(int tempterNumber, int userTempChar, 
            char FAHRENHEIT_CHAR,char CELSIUS_CHAR, boolean tempBool){
        if(userTempChar == FAHRENHEIT_CHAR){
                if(tempterNumber >= -40 && tempterNumber <= 50){
                    System.out.println("Range for Fahr" + tempterNumber);
                    tempBool = true;
                    
                } else {
                    System.out.println("That is not the range for FAhREnHeit");
                    tempBool = false;
                    
                }
            } else if(userTempChar == CELSIUS_CHAR){
                if(tempterNumber >= -40 && tempterNumber <= 10){
                    System.out.println("Range for Fahr" + tempterNumber);
                    tempBool = true;
                    
                } else {
                    System.out.println("That is not the range for Celius");
                    tempBool = false;
                    
                }
                
            }
        System.out.println(tempBool);
        //System.out.println(onOff);
        //return onOff;
        return tempBool;
    }
    static public int calcAverage(int high, int low){
        int average = (high+low)/2;
        return average;
        
        
    }
    
    
}
