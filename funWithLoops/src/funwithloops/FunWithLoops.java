/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * while loop is a pretest
While and do-while are indeterminent loops
// you don't know how many times the loop executes
determine loops = for loop
 */
package funwithloops;

/**
 * Descripition Learn about Loops
 * @author jjsurfgirl
 * 
 */
public class FunWithLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        
//        System.out.println(x--);
//                             //shortcut for x = x + 1;
//        System.out.println(x);
//        
//        System.out.println(++y);
//        System.out.println(++y);
        
        while (x < 10 ) { // test 
            System.out.println(x++);  //logic
           // x++;
        
        }
        
        do {
            System.out.println(x--);
            //x--;
        } while (x > 0);
        
        x = (int) (Math.random() * 10 + 1);
//        while (x < 6) {
//            System.out.println(x++ + "X: ");
//        }

//        do {
//            System.out.println(x);
//        } while (x == 7);
        
//        do {
//            if (% 7 != 0) {
//                System.out.println(x)
//            }
//        } while (x % 7 != 0);
        
        x = (int) (Math.random() * 100 + 1);
        while(x % 7 != 0) {
            System.out.println(x);
            x = (int) (Math.random() * 100 + 1);
        }
        

        // prints number if it's not divisable by 7
        do {
            x = (int) (Math.random() * 100 + 1);
           
            System.out.println(x);
        } while (x % 7 != 0 );
        
        
        // for (initionalz; test; change){
        //   logic
        // 
        
//        for(int i = 0; i < 10; i++) {
//            System.out.println(i + "for loop");
//            System.out.println("fun");
//        }
        
//        for(int i = 0; i < 10; i++) {
//            System.out.println(i + "for loop");
//            System.out.println("fun");
//        }
        
        //System.out.println(i);
        
//        for(int i = 0; i < 10; i++) {
//            System.out.println(i + "for loop");
//            System.out.println("fun");
//        }
        // print 0 to 100 by 2
        for(int i = 0; i <= 100; i++) {
//            if(i % 2 == 0) {
//                System.out.println(i + "divisableby 2");
//                
//            }
              System.out.print(i);
              System.out.print(i <= 100 ? ", " : "");
            //System.out.println(i + "for loop");
           // System.out.println("fun");
        }
        
        for(int i = 100; i >= 0; i--) {
            if(i % 5 == 0){
               System.out.println(i + "is divisable by 5"); 
            }
            //System.out.println(i + "for loop");
            //System.out.println("fun");
        }
        
        

    
       }
}
