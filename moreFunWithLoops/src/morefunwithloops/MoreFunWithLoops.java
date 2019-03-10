/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morefunwithloops;

/**
 * Descprition More fun with loops
 * @author jjsurfgirl
 */
import java.util.Scanner;
public class MoreFunWithLoops {

    /**
     * @param args the command line arguments
     * F = 1.8C + 32
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdin = new Scanner(System.in);
        String str;
        int spaceIndex;
        int tempterNumber;
        char c;
        
        str = stdin.nextLine(); // reads string
        System.out.println(str);
        
        spaceIndex = str.indexOf(" ");
        String temptureString = str.substring(0,spaceIndex);
        tempterNumber = Integer.parseInt(temptureString);  // parsing integer
        System.out.println(tempterNumber);
        str = str.substring(spaceIndex+1);
         System.out.println("Temp: " + tempterNumber);
         System.out.println("Unit: " + str);
        
         // another way of exetping input
        System.out.println("Enter anthoer Tempature"); //
        tempterNumber = stdin.nextInt();
        temptureString = stdin.nextLine();
        System.out.println("Temp: " + tempterNumber);
        System.out.println("Unit; " + temptureString);
        
        // more practice
        int a, b, d;
        int errors = 0;
//        
//        // Get the input
//        System.out.println("Enter a between 1 and 10");
//        a = stdin.nextInt();
//        System.out.println("Enter a between 1 and 10");
//        b = stdin.nextInt();
//        System.out.println("Enter a between 1 and 10");
//        d = stdin.nextInt();
//        System.out.println("Enter a between 1 and 10");
        
        // How would you check to see if they are all valid
        
        // valid the data
        a = 5;
        if (a <= 0 ||a > 10 ) {
            System.out.println("A is not betwen 1 and 10");
            errors++;
        } else {
            System.out.println("A is in range");
        }
        
        
    }
    
}
