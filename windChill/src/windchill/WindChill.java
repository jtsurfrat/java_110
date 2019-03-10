
package windchill;

/**
 * Project Windchill program
 * @author Jenna Connolly
 * Description create a windchill calcuation based on wind speed
 * and tempture 
 */
import java.util.Scanner;

public class WindChill {

    
    public static void main(String[] args) {
        
        Scanner stdin = new Scanner(System.in);
        // Input
        int airTempture,
            speedOfWind;
            
        double windChill,
               speedOfWindSqt;
        
        // processing
        System.out.println("Enter the Air Temputure. ");
        airTempture = stdin.nextInt();
        
        System.out.println("What is the Windspeed? ");
        speedOfWind = stdin.nextInt();
        
        // calculation done here
        
        speedOfWindSqt = Math.sqrt(speedOfWind); //Squaring root windspeed
        windChill =(91.4 - airTempture)* ((.478 + 
                (.301 * speedOfWindSqt) - (.02 * speedOfWind)));
        
        // last calcuation for windchill, also making it 1 decimal
        windChill= Math.round((91.4 - windChill)* 10.0) /10.0; //windChill = 91.4 - windChill;        

        // Output
        System.out.println("WindChill " + windChill);
        System.out.println("The Air Temperature is:\t" + airTempture);
        System.out.println("The Wind Speed is:\t" + speedOfWind);
        System.out.println("The windchill is:\t" + windChill);
        
        
        
    }
    
}
