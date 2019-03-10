/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchlab20;

import java.util.Scanner;

/**
 *
 * @author jjsurfgirl
 */
import java.util.Scanner;

public class SwitchLab20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char answer;
        boolean doneOrdering = false;
        Scanner stdin = new Scanner(System.in);
        
        System.out.println("Dinner Menu");
        System.out.println("A.\t" + "Steak");
        System.out.println("B.\t" + "Chicken");
        System.out.println("C.\t" + "Tofu");
        System.out.println("Q.\t" + "Quit");
        System.out.println("Please select A, B, or C > ");
        
       // answer = stdin.nextLine().charAt(0);
        
        do {
            System.out.println("Please select A, B, or C > ");
            answer = stdin.nextLine().charAt(0);
            switch (answer){
                case 'a' :
                case 'A' :
                    System.out.println("Mooo");
                    break;
                case 'b' :
                case 'B' :
                    System.out.println("Cluck");
                    break;
                case 'c' :
                case 'C' :
                    System.out.println("Gross tofu");
                    break;
                case 'q':
                case 'Q':
                    
                    doneOrdering = true;
                    break;
                default:
                    System.out.println("What? Can't read?");
            }
        }while (!doneOrdering);
        System.out.println("Done ordering. Thanks! ");
    }
    
}
