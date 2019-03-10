/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylab;

/**
 *
 * @author jjsurfgirl
 */
import java.util.Scanner;
public class ArrayLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myNums = {3, 8, 12, 4, 2, 9, 6};
        int [] stuff = {2, 10};
        int myNumber;
        Scanner keyboard = new Scanner(System.in);
        myNumber = keyboard.nextInt();
        
        backwards(myNums);
        sum(myNums);
        greater(myNums);
        smallest(myNums);
        averageNumber(stuff);
        
        getNumber(myNumber, myNums);
        
        
    }
    
    public static void backwards(int [] list){
        for(int i = list.length - 1;i >= 0; i--){
            System.out.print(list[i] + ",");
        }
        System.out.println("");
    }
    
    public static void sum(int [] list){
        int total = 0;
        for(int i = 0; i < list.length; i++) {
            total += list[i];
        }
        System.out.println(total);
    }
    
    public static void greater(int [] list){
        int largestSum = 0;
        for(int i = 0; i < list.length; i++){
            if(list[i] >= largestSum){
                largestSum = list[i];
            }
        }
        System.out.println(largestSum);
    }
    public static void smallest(int [] list){
        int smallSum = 100;
        for(int i = 0; i < list.length; i++){
            if(list[i] <= smallSum){
                smallSum = list[i];
            }
        }
        System.out.println(smallSum);
    }
    
    public static double averageNumber(int[] list){
//        boolean found = false;
        int total = 0;
        int length = list.length;
        double div;
        
        for(int i = 0; i < list.length; i++){
            total += list[i];
            
            
        }
        //return found;
        System.out.println("Length:" + length);
        System.out.println("total: " +total);
        div = total/length;
        System.out.println(div);
        return div;
    }
    
    public static boolean getNumber(int number, int list[]){
        boolean stuff = false;      
        for(int i = 0;i < list.length; i++){
            if(number == list[i]){
//                System.out.println("Yes: number is in list: " + number);
                stuff = true;
                break;
                
            } else {
//                System.out.println("No: number isn't in list: " + number);
                stuff = false;
            }

            
        }
        //System.out.println("Bacon!");
        if(stuff == true){
            System.out.println("Yes: number is in list: " + number); 
        } else {
            System.out.println("No: number isn't in list: " + number);
        }
        
        return stuff;
    }

    
}
