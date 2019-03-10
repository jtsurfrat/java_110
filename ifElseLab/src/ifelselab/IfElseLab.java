

package ifelselab;

/**
 *
 * Title IfElseLab
 * @author Jenna Connolly
 * Descriptions IfEsle statemetns in java
 */
public class IfElseLab {

    public static void main(String[] args) {
        
        int temperature; // declaring a varaible
        
        temperature = (int)(Math.random() * 120); //randomizing the varible
        
        if (temperature > 100) { // checks if temp is over 100
            System.out.println("Temperature = " + temperature);
            System.out.println("Dang it's hot! ");
        } else if (temperature >= 50){  // checks if temp is over 50
            System.out.println("Nice weather: " + temperature);
            
        } else { // checks if it's under 50
            System.out.println("Dang it's cold: " + temperature);
        }
    }
    
}
