/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * test quest i = 1, j doensn't exit
 */
package forloopfun;

/**
 * Description : practice with for loops
 * Author Jenna Connolly
 * @author jjsurfgirl
 */
import  java.util.Scanner;
public class ForLoopFun {

    /**
     * @param args the command line arguments
     * determinte loop  on test
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner stdin = new Scanner(System.in);
//        int gradeCount; // how many grades user enters
//        int total = 0; // accumulator
//        int grade;
//        //int i = 0; // counter
//        
//        System.out.println("How many grades are you entering");
//        
//        gradeCount = stdin.nextInt();
//        gradeCount = 0; // Skip this so we can do a nexted loop
        //int i;
        
//        for (i = 0; i < gradeCount; i++) {
//            System.out.println("Enter next grade");
//            total += stdin.nextInt();
//        }
        
        //System.out.println(i + "i is outside of loop");
        
//        while (i < gradeCount){
//            total += stdin.nextInt(); // logic
//            i++; //update
//        }
       // System.out.println(gradeCount > 0 ? total/gradeCount : " ");
        
        // print mutliplation table
        for(int i = 1; i < 10; i++){     // j = j prints 1 time
            for(int j = 1; j < 10; j++){
                System.out.printf("%4d", i * j ); // prints 10 tims
            }
            System.out.println("");
        }
//        int v = 20;
//        --v; 
//        
//        System.out.println(v++);
//        System.out.println(v);
//        
//        int s = 20; 
//        int t = s++ + --s;
            
            for(int i = 50; i > 1; i--){
                System.out.println(i + " ");
        }
    }
    
}
