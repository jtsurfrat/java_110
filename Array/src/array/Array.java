/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

// intialize list = 

/**
  class is a blue print for  building an object
  * Methods static -> Math
  * class methods -> scanner Scanner
 * @author jjsurfgirl
 * getteres and setters
 * setters are mutators
 * 3 access modes for an instinace variable
 * - protect, public, private
 * toSring
 * equals
 * equals 
 * inheritance
 * Object
 * different classes can
 * have it's own
 * main() {
 * }
 * 
 */
import java.util.Scanner;
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int x = 42;
//        int y;
//        Integer X = new Integer(x); // wrapper class
//        
//        y = Integer.parseInt("42");
          
        //int[] x; // address to object in the heap
        int y[] = {8,2,7,6,3}; // create and initialize in one step
//        x = new int[5]; // creates space for 5 object
        // objects are created in heap
        
        // 070 = hexademical
        
        // print what in at the addresss y, offset 0
        System.out.println(y[0]); // offset index
        System.out.println(y[2]);
        
        // assgnment statmetn changes value of an array
        
        y[3] = 4; //
        y[0] = y[4]; // last loction = first location
        // How do we swap what is in the second location
        y[1] = y[2]; // loses data
        
        // how t
        
//        for(int i = 0; i < y.length; i++) {
//            System.out.println(y[i] + ",");
//        }
//        int temp = y[1]; // mover second element into temp location
//        System.out.println();
//        y[1] = y[2];
//        y[2] = y[1];
//        
//        y[2] = temp;
//        
//        for(int i = 0; i < y.length; i++) {
//            System.out.println(y[i] + ",");
//        }
//        printArray(y);
//        printArray(y);
        
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        int rands[] = new int[num]; // creates a user defined array
        for(int i = 0; i < rands.length; i++){
            rands[i] = (int)(Math.random() * 100 + 1);
            
        }
        printArray(rands);
        printArrayBackwards(rands);
        prinSmalls(rands);
        
   }
    
    public static void printArray(int[] list) {
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] +",");
        }
        System.out.println();
    }
    
    public static void printArrayBackwards(int[] list){
        for(int i = list.length -1; i > 0; i--){
            System.out.print(list[i] +",");
        }
        System.out.println("");
    }
    
    public static void prinSmalls(int[] list) {
        for(int vals: list){
            if(vals < 50){
                System.out.println(vals);
            }
        }
    }
    
    
    
}
