/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variationsofarrays;

/**
 * Descriptions Arrays of objects, Ragged Arrays, Multidemenional Arrays
 * @author jjsurfgirl
 * arrays are a list of same data type
 * arrays are objects bacon
 * parrel arrays but compary 1 to one
 * // side by side, one to one releationship
 * // miles / gallon
 * // miles array
 * // gallons arary
 * miles per galon
 * how many weeks you want to collect data
 */
public class VariationsOfArrays {

    /**
     * 
     * @param args the command line arguments
     * two demiion arrays have rows and columns
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] list = {1, 2, 3,4,5};
        // example of an Array of objects
        String[] list2 = new String[5]; // created an array of addresses
        
        for(int i = 0; i < list2.length; i++){
            list2[i] = "student" + (i + 1);
            // list2[i] = new String("String" + (i + 1));
                           //  ^calling constructor
        }
        // mess with 2d arrays
        char[][] list3 = {{'o', ' ', 'X'}, {'o', ' ', 'X'}, {'o', ' ', 'X'}};
        int[][] list4 = {{1,2,3}, {4,5,6}, {7,8,9}};
        // Print the 5 in list 4
        System.out.println(list4[1][1]);
        System.out.println(list4[2][1]);
        // System.out.println(list4[row][col])
        
        // print tick tac to board
        int [] [] list5 = {{98, 88, 58},{62,99,87, 12},{90, 80}};
        
//        for(int i = 0; i < list3.length; i++) { // prints rows
//            for(int j = 0; j < list3[0].length; j++){ // prints colums
////                System.out.print(list3[i][j]);
//                  System.out.print(list5[i][j]);
//            }
//            System.out.println("");
//        }
        // ragged array
        
//        for(int i = 0; i < list5.length; i++) { // prints rows
//            for(int j = 0; j < list5[i].length; j++){ // prints colums
////                System.out.print(list3[i][j]);
//                  System.out.print(list5[i][j] + ", ");
//            }
//            System.out.println("");
//        }
        
        int [] []list7 = {{98, 88, 58, 7},{62,99,87, 12},{90, 80, 2, 1}};
       
          for(int i = 0; i < list7.length; i++){
              int total = 0;
              for(int j = 0; j < list7[i].length; j++){
                  total += list7[i][j];
                  System.out.println(list7[i][j] + ", ");
              }
              System.out.println("");
              System.out.println("Total: " + total);
              
          }
          
          for(int i = 0; i < list7[0].length; i++){
              int total = 0;
              for(int j = 0; j < list7.length; j++){
                  total += list7[j][i];
                  System.out.println();
              }
              System.out.println("Total: " + total);
          }
    }
    
}
