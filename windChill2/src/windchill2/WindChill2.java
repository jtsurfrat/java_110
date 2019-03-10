
package windchill2;

/**
 * Title: Windchill 2
 * @author jjsurfgirl
 * Description windchill code that does windchill
 */
import java.util.Scanner;

public class WindChill2 {    
    
    
    public static void main(String[] args) {
        // Variables and Constants
     int errorCount = 0;
     final char CELSIUS = 'c',
             FAHRENHEIT = 'f';
     boolean rightAnwser = false;
     char inputLetter;
     //int tempeture;
     int chill;
     int celsiusTemp;
     int fahrenheitTemp;
     int airTemp;
     int windSpeed;
     boolean rightSpeed = false;
     boolean rightTemp = false;
     String day;
     
// declaring the scanner object
// Input
     // Write the code to get the inputs from the user.  Temperature, Unit, Wind Speed
     
     Scanner stdin = new Scanner(System.in);
     
     // printing out first instructions
     System.out.println("Wind Chill calculation program.");
     
     System.out.println("Please enter the air temperature followed by the "
             + "unit. For example, 25 F for Fahrenheit or 25 C for Celsius.");
     
     
     
     do {
         System.out.println("Type 'c' for CELSIUS or 'f' for FAHRENHEIT" );
         // assign varaibles
         inputLetter = stdin.next().toLowerCase().charAt(0);
         // assigning tempture var
         System.out.println("Type air Tempt: " );
         airTemp = stdin.nextInt();
         // has to call functions after
         System.out.println(inputLetter);
         
         
         if(inputLetter == CELSIUS || inputLetter == FAHRENHEIT){
            
             rightAnwser = true;
         } else {
             System.out.println("Wrong character, Please type F or C.");
             // know that field is not valid and increment the error counter
             errorCount += 1;
         }
         
         if(airTemp !=(int)airTemp){
             errorCount += 1;
             System.out.println("ERRor: Air Temp is an Integer:");
         }
         
     } while(!rightAnwser);

        if(inputLetter == FAHRENHEIT){ 
           if(airTemp >= -40 && airTemp <= 50){
              System.out.println("You have Choosen FAHRENHEIT:");
              System.out.println("Air Temp for Fahen: " + toFarhenheit(airTemp));    

              rightTemp = true;
              //System.out.println(toFarhenheit(32)); //0
           } else {
               errorCount += 1;
               System.out.println("Must be between -40 - 50 for "
                       + " Farenhiet.");
           }


       } else {
           System.out.println("You have Choosen CELSIUS: ");
           System.out.println("Air Temp for Celsius: " + toCeilus(airTemp));
           
          // System.out.println(toCeilus(0)); // 32.0
            rightTemp = true;
        }
       
    
   // }while(!rightTemp);
             
    System.out.println("Please enter the wind speed (in miles per hour).");
           
    
    windSpeed= stdin.nextInt();
    if(windSpeed > 0 && windSpeed <= 50 ){
        //rightSpeed = true;
        System.out.println(toWindSpeed(windSpeed,airTemp) +" Wind chiil");
    } else {
        System.out.println("The Air Temperature is Invalid");
        System.out.println("Wrong, wind speed must be between 0 and 50: ");
       
    

     
     System.out.println("Windspeed is: " + windSpeed);
     
     
     
 
     }
    
    if(windSpeed < 20){
        System.out.println("Too cold Time to stay inside");
    } else if(windSpeed <= 50 ){
        System.out.println("Time for snowboarding!");  
    
        
    } else if (windSpeed <= 70){
        System.out.println("Lets have go to the park!");
    } else {
        System.out.print("Lets go surfing");
    }
        
    
        System.out.println("Your erros are: " + errorCount);
    
    }
 
     // Output
     // Finally, output the results of the program.  Either a temperature and a comment
     // about the weather or a final error message.
     // if wants you to parse to strnng use parseToSring
   
    
         // Calculations
     // After data validation, if there are no errors, calculate the Wind Chill Factor.
     // Be sure to account for the desired unit.
     // creating the Farhenhiet method
    public static double toFarhenheit(double farenheit){
        double celius;
        celius = (farenheit - 32)/ 1.8;  
        return celius;
    }
    
     // create ceilus calcuation
    public static double toCeilus(double celius){
        double farenheit;
        farenheit = (1.8 * celius)+ 32;
        return farenheit;
    }
    // wind chlll calcuations function
    public static double toWindSpeed(double speedOfWind, double airTempture){
        double speedOfWindSqt,
               windChill;
        
        speedOfWindSqt = Math.sqrt(speedOfWind);
        windChill =(91.4 - airTempture)* ((.478 + 
                (.301 * speedOfWindSqt) - (.02 * speedOfWind)));
        windChill= Math.round((91.4 - windChill)* 10.0) /10.0;
        return windChill; 
    }
    
    
    
    
}
