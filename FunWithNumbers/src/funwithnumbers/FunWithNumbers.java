package funwithnumbers;
/**
 * @author Jenna Connolly
 * Project Fun with Numbers
 * 8/27/2018
 */
import java.util.Scanner;

public class FunWithNumbers {

    public static void main(String[] args) {
        
        //declare an object userInput
        Scanner userInputA = new Scanner(System.in);
        Scanner userInputB = new Scanner(System.in);
        
        // write a print statement about the program
        System.out.println("Choose two integers A and B of a"
                + "trinagle: ");
        // assigning objects with constants
        final int SIDE_A_LENGTH = userInputA.nextInt();
        final int SIDE_B_LENGTH = userInputB.nextInt();            
        
        // Constants with the project, it also works.
//        final int SIDE_A_LENGTH = 6; // Length of height
//        final int SIDE_B_LENGTH = 5; // Length of base
          
        
        //Variables
        int    sideA,  // three sides of a right Triangle
               sideB;
        double sideC;
        double slop;
        double area;
        double perimeter;
        double midA;
        double midB;
        double half = .5;
        int zero = 0;
        int powerTwo = 2;
        
        //Processing
        sideA = SIDE_A_LENGTH;
        sideB = SIDE_B_LENGTH;
        
        //Hypotenuse
        sideC = Math.sqrt(Math.pow(sideA, powerTwo) +
                Math.pow(sideB, powerTwo));

       // slop, area and primeters
        slop =  (-1)*((double)sideA/(double)sideB);
        
        area = (double)sideA*(double)sideB * half;
        perimeter = (double)sideA + (double)sideB + (double)sideC;
        
        //creating the halfway point
        midA = (half * sideA);
        midB = (half * sideB);
        
        // Massage any variables that will display more than
        // two decimals places.
        
        sideC = ((int)(sideC *100))/100.0;
        perimeter = ((int)(perimeter * 100) /100.0); 
        
        // Out put (Write all output statements here)
        System.out.println("Welcome to the Fun with Numbers Program:");
        System.out.println("The points of the Triangel area: ");
        System.out.println("A: (0,0)\t" + "B: ("+ zero + "," 
                + sideA + ")\t" + "C: ("+ sideB + "," 
                + zero + ")");      
        System.out.println("The Length of the sides are:");
        System.out.println("Height:\t\t" + sideA);
        System.out.println("Base:\t\t" + sideB);
        System.out.println("Hypotenuse:\t" + sideC);       
        System.out.println("The Characteristics of the Triangle are:");
        System.out.println("Area:\t\t" + area);
        System.out.println("Perimeter:\t" + perimeter);
        System.out.println("Slope of Hypotenuse:\t" + slop);
        System.out.println("Hypotenuse Midpoint:\t" + "(" + midB +","
            + midA + ")");
         
    }
    
}
