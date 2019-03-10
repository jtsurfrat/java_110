/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithdecisions;

/**
 * Title: Fun with Decisions
 * Descriptions: Learn about it, if-else and chain if statesments
 * as well as the switch statement
 * @author jjsurfgirl
 * 
 * Boolean logic
 * A B . A || B  A&&B    A + B
 * 0 0 .  1 .     0 .     1
 * 
 * 
 * if valatates true , do a 
 * statement
 * if () 
 *   block of statesments
 * assignmetn statment = takes whats on the left assignment to the right
 * compare statement == compares what is on the left and to rit
 */
import java.util.Scanner;

public class FunWithDecisions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rand = (int)(Math.random() * 6) +1;
        int rand2 = (int)(Math.random() * 6) +1;
        boolean craps = (rand + rand2 == 7); //Bool eans Expression
        System.out.println(rand);
        System.out.println(rand + rand2);
        
        if (craps ){ // Evalautes craps
            System.out.println("Loser!!");
        }
        
        if(rand != 7) {
            System.out.println("Not craps, not 7");
        }
        if(rand <= 7) {
            System.out.println("Less then craps");
            
        }
        if(rand + rand2 == 2 || rand + rand2 == 12){
            System.out.println("Boxcars! or");
            System.out.println("SnakeEyes");
            
        }
        
        if (rand > 2 &&  rand < 9){  // compound boolean experssion
            System.out.println("rand1 is between 2 and 9: " + rand);
            int x = 0;
            
            if(rand == 0 && rand/x ==0){  // short circuit Eval
                System.out.println("Why did this not blow up?");
                
                //^ short circuit Eval
            }
        }
        
        if(rand % 2 == 0){
            System.out.println("Rand1 is even: " + rand);
        } else {
            System.out.println("Rand1 is odd: " + rand);
        }
        
        int grade = (int)(Math.random() * 100 + 1);
        
        if(grade >= 90){ // changed if else statement
            System.out.println("Got an A: " + grade);
            if (grade >= 95) {
                System.out.println("Rock Star!! ");
            }
        } else if( grade >= 80) {
            System.out.println("Got a B: " + grade);
        } else if(grade >= 70 ) {
            System.out.println("Got a C: " + grade);
            
        } else if(grade < 70 && grade >= 60 ) {
            System.out.println("Got an D:" + grade);
        } else {
            System.out.println("You faild: " + grade);
        }
        
        if(grade >= 90) // changed if else statement
            System.out.println("Got an A: " + grade);
           
        else if( grade >= 80) 
            System.out.println("Got a B: " + grade);
        else if(grade >= 70 ) 
            System.out.println("Got a C: " + grade);
            
        else if(grade < 70 && grade >= 60 ) 
            System.out.println("Got an D:" + grade);
        else 
            System.out.println("You faild: " + grade);
        
                
        
        String str1 = "Hello";
        String str2 = "hi";
        
        if (str1.equals(str2)){
            System.out.println("Equal");
        } else {
            System.out.println("NOT equal");
        }
        
        System.out.println(str1.compareTo(str2)); // comparing them lexical
        System.out.println(str2.compareTo(str1));
        
        str2 = "hello";
        System.out.println(str1.equalsIgnoreCase(str2));
        
        //vim ctn n will auto add word
        // tmx
        //links
        
    }
    
}
