/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchlab;

/**
 * Title: switch Lab
 * @author Jenna Connolly
 * Descrition lab with switch statements
 */
import java.util.Scanner;
public class SwitchLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char answer;
        Scanner stdin = new Scanner(System.in);
        
        System.out.println("Dinner Menu");
        System.out.println("A.\t" + "Steak");
        System.out.println("B.\t" + "Chicken");
        System.out.println("C.\t" + "Tofu");
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
            default:
                System.out.println("What? Can't read?");
        }
    }
    
}
