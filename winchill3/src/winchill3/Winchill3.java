package winchill3;

/**
 *
 * @author jjsurfgirl
 */
import java.util.Scanner;

public class Winchill3 {
    
        public final String CELSIUS_CHAR = "C";
        public final String Fah_Char = "F";
        //public String spaceIndex;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean gamePlay = true;
        
        
        double temp = 0;
        char inputLetter;
        final String userString;
        
        //boolean valid = false;
        String userTempStr;
        int spaceIndex;
        String userNum;
        String userLetterTemp;
        String tempterString;
        int tempterNumber = 0;
        String farh = "f";
        String cel = "c";
        int tempHigh = 0;
        int tempLow = 0;
        int weatherFarh;
        int weatherCel;
        int fahLow = -40;
        int fahHigh = 50;
        int celLow = -40;
        int celHigh = 10;
        int windSpeed = 0;
        double windChillFarh = 0;
        double convertToFar = 0;
        double convertToCel = 0;
        double windChill = 0;
        boolean gameOn;
        
        Scanner stdin = new Scanner(System.in);
        userString = getUserTempString();
        
        //userTempStr = stdin.nextLine(); // checking input
        spaceIndex = userString.indexOf(" "); // steting index of space 
        tempterString = userString.substring(0, spaceIndex);
        userLetterTemp = userString.substring(spaceIndex+1);
        
        
        
        do {
            System.out.println("here");
            System.out.println(userString);
            tempterNumber = Integer.parseInt(tempterString); //parsing number
            if(userLetterTemp.equals(farh)){
                System.out.println("yes");
                tempHigh = fahHigh;
                tempLow = fahLow;
              // weatherFarh = checkTemp(tempHigh, tempLow, tempterNumber);
               // valid = true; // end loop
            } else {
                tempHigh = celHigh ;
                tempLow =  celLow;
             //  weatherCel =checkTemp(tempHigh, tempLow, tempterNumber);
                
            }
            
            //Scanner stdin = new Scanner(System.in);
            int userTemp = 0;
            boolean isValid = false;
        
            do {
                System.out.println("checkTemp");
                if(tempterNumber <= tempHigh && tempterNumber >= tempLow){
                    isValid = true;
                } else {
                    System.out.println(tempterNumber + " is't in range. For " + userLetterTemp);
                    welcome();
                    tempterNumber = stdin.nextInt();
                }

            } while(isValid == false);
            System.out.println("done");
            
            windSpeed = getWindSpeed();
            System.out.println("WindSpeed is " + windSpeed);
            
            if(userLetterTemp.equals(farh)){
                windChillFarh = windChill(windSpeed,tempterNumber);
                
                System.out.println(windChill(windSpeed,tempterNumber) 
                   +  "Windchill");
                System.out.println("The wind chill factor is "+ windChillFarh +
                " degrees Farh");
                
            } else {
                
                convertToFar = toFartheit(tempterNumber);
                windChill = windChill(windSpeed,(int)convertToFar);
                System.out.println(windChill + "WindChill");
                
                
                
                System.out.println(convertToFar);
                convertToCel = toCelius(windChill);
                System.out.println(convertToCel + " Celius Wind chill");
                //tempterNumber = convertToCel;
                System.out.println("The wind chill factor is "+ convertToCel +
                        " degrees Celsius");
                
            }
            
            stdin.nextLine();
            
            
            gameOn = playAgain();
            //gamePlay = playAgain();
            if(!gameOn){
                gamePlay = false;
            } else {
                gamePlay = true;
            }
            
            
        } while(gamePlay);
            welcome();
            
    }
    
    // greets the player
    public static void welcome(){
         System.out.println("Please enter the air temperature followed by "
                    + "the unit.  For example, 25 F for Fahrenheit or 25 C "
                    + "for Celsius."); 
        
    }
    
    public static String getUserTempString(){
        
        Scanner stdin = new Scanner(System.in);
        boolean valid = false;
        String userTempStr;
        int spaceIndex;
        String userNum;
        String userLetterTemp;
        String tempterString;
        int tempterNumber = 0;
        String farh = "f";
        String cel = "c";

        welcome();
       
        
        do { 
            
            userTempStr = stdin.nextLine(); // checking input
            spaceIndex = userTempStr.indexOf(" "); // steting index of space 
            tempterString = userTempStr.substring(0, spaceIndex);
            userLetterTemp = userTempStr.substring(spaceIndex+1);
            
            try {
                
                tempterNumber = Integer.parseInt(tempterString); //parsing number
                if(userLetterTemp.equals(farh) || userLetterTemp.equals(cel)){
                    System.out.println("bacons");
                    valid = true; // end loop
                 } else {
                    System.out.println(userLetterTemp + " doesn't equal f or c");
                    System.out.println("Please choose a temp and letter?");
                 }
                
            
            } catch(NumberFormatException ex) {
                    System.out.println(tempterString + "Isn't an Number");

            }
     
            
        }while(!valid);
        
        System.out.println("stuff" );
        
        System.out.println(userTempStr );
        
        return userTempStr;
    }
    
    public static int getWindSpeed(){
        
        int high = 50;
        int low = 0;
        boolean isValid = false;
        int windSpeed = 0;
        Scanner stdin = new Scanner(System.in);  
        
        do {
            System.out.println("Please Type in WindSpeed:");

            try {
                windSpeed = stdin.nextInt();
                
                if(windSpeed >= low && windSpeed <= high){
                    isValid = true;
                } else {
                    System.out.println(windSpeed +" is Invalid Windspeed.");
                }
            } catch(Exception ex) {
                System.out.println("That isn't a number. Type windspeed Num. ");
                stdin.nextLine(); // 
            }
                               
            
        } while(!isValid);
        
        return windSpeed;
    }
    
     public static double toCelius(double farenheit){
        double celius;
        celius = (farenheit - 32)/ 1.8; 
        System.out.println(celius + "///:" + farenheit);
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
    
    public static boolean playAgain(){
        Scanner stdin = new Scanner(System.in);
        boolean isValid = false;
        String yes = "y";
        String no = "n";
        String userInput;
        boolean anwser = false;
        
        
        do {
           System.out.println("Do you want to play again[y/n]");
           userInput = stdin.nextLine().toLowerCase();
           
           if(userInput.equals(yes)){
               anwser = true;
           } else if(userInput.equals(no)){
               anwser = false;
           } else {
               System.out.println("That's not yes  or No? ");
           }
           
            
        } while(isValid);
        
        return anwser;
    }
    


}
