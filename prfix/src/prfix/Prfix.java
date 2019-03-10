/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prfix;

/**
 *
 * @author jjsurfgirl
 */
public class Prfix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int stuff = 5;
        System.out.println(stuff++ + " postfix");
        System.out.println(stuff + "after incrementing postfix");
        System.out.println(++stuff + "prefix, increments before");
        int number = 1;
        int hund = 100;
        displayValue(hund); 
        displayValue(6.0);
        
        short s = 5; 
        displayValue(s);
        displayValue(s); 
       // long numb = 10.55577;
        displayValue(numb);
//displayV alue(6-2f); displayValueUint) 7.5)|
       // while (number <- 5);
        //int number = 1;
// This loop is missing its braces!

//        while (number <= 5)
//            System.out.print("*");
//            System.out.println("Hello");
//            number++;
//        }
//        System.out.println("Here");
//        int count = 10; 
//        while (count < 1) {

//            System.out.println("Hello World");
//            count++;
//        }
//        System.out.println("Loop is done.");
        
//        count = 0; 
//        while(count < 10)
//            System.out.println("I love Java programing");
        
//        for (int x = 1; x <= 10; x++){

//            System.out.println(x);
//            x++; //prints out every other number 
            
//            
//          for(int count = 1; count <= 10; count++) 
//            System.out.println(count);
//          System.out.println("count is now • • count"); // ERROR!


//            
//        }
    
int cols = 6;
int rows = 8;

//for(int row =0; row < rows;row++){
//    for(int col = 0; col< cols; col++){
//        System.out.print("*");
//    }
//    System.out.println();
//}

    final int NUM_STEPS = 6;
    
    for(int r = 0; r < NUM_STEPS; r++){
        for(int c = 0;c < r; c++){
            System.out.print(" ");
        }
        System.out.println("*");
    }

    

    for(int row =0; row < rows;row++){
        for(int col = 0; col < (row + 1); col++){
            System.out.print("*");
        }
        System.out.println();
    }
    
     for(int k = 0; k < 10;k++){
         System.out.println(k);
         if(k == 5){
            continue; 
         }
    }
     int cat = 525;
     
     System.out.println("There are " + cat + 5);

     // changing the value in setter
     double x;
        x = Math.pow(4.0, 2.0 );
        int ttt = 25;
        //ttt = Math.sqrt(ttt);
        System.out.println(x);
        System.out.println(Math.sqrt(ttt));
   } 
    
    public static void displayValue(int number){

        System.out.println("The value is " +     number);
    }
    
    public static int half(double num){
        return result;
    }

//>
   
    

        
                    
    
}
