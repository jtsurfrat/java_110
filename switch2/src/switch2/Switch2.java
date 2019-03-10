/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch2;

/**
 *
 * @author jjsurfgirl
 */
import java.util.Scanner;
public class Switch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // BooleanExpresion ? Value : Value
        // z = x > y ? 10 : 5;

        
        int grade = (int)(Math.random() * 100 + 1);
        char letterGrade;
        
        //letterGrade = (grade >= 90) ? "A" : "f";
        
        grade /= 10; // diving grade by 10
        
        switch (grade ){
            case 10 : System.out.println("A: " + grade);
                break;
            case 9 : System.out.println("A");
                break;
            case 8 : System.out.println("B");
                break;
            case 7 : System.out.println("C");
                break;
            case 6 :System.out.println("D");
                break;
            default : System.out.println("F");
        }
        
        int yesCount;
int noCount;

//
    }
    
    
}
