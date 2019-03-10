/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containerpro;

/**
 * Title: Container project
 * @author jjsurfgirl
 * Description: Container calculates size how many containers
 */
import java.util.Scanner;

public class ContainerPro {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // dacaring container quatities
        final int HUGE_QUANTITY = 50;
        final int LARGE_QUANTITY = 20;
        final int MEDUIM_QUANTITY= 5;
        final int SMALL_QUANTITY = 1;
        int widgetCount;
        int firstWidgetCount;
        
        // divides by the input, and holds value int
        int huge;
        int large;
        int medium;
        int small;
        boolean loopDone = false;
        
        // declaring varialbes prices
        final double HUGE_CONTAINER_PRICE = 35.00;
        final double LARGE_CONTAINER_PRICE = 15.25;
        final double MEDUIM_CONTAINER_PRICE = 4.25;
        final double SMALL_CONTAINER_PRICE = .95;
        
        // total of each size
        double hugeTotal;
        double largeTotal;
        double meduimTotal;
        double smallTotal;
        
        // total of the cost
        double total;
        //creating scanner object
        Scanner stdin = new Scanner(System.in);
        
        // intializing variable
        total = 0;
        huge = 0;
        large = 0;
        medium = 0;
        small = 0;
        
        System.out.print("Type in number of widgets you need: ");
        widgetCount = stdin.nextInt();
        firstWidgetCount = widgetCount;
        
        while(!loopDone){ 
            
            // checking to see if widget is huge, then do calculation
            if(widgetCount >= HUGE_QUANTITY){
                huge = widgetCount/HUGE_QUANTITY;
                widgetCount %= HUGE_QUANTITY;
                hugeTotal = (double)huge * HUGE_CONTAINER_PRICE;
                total += hugeTotal;
            // checking to see if widget is large, then do calculation
            } else if (widgetCount >= LARGE_QUANTITY){
                large = widgetCount/LARGE_QUANTITY;
                widgetCount %= LARGE_QUANTITY;
                largeTotal = (double)large * LARGE_CONTAINER_PRICE;
                total += largeTotal;
            // checking to see if widget is medium, then do calculation
            } else if(widgetCount >= MEDUIM_QUANTITY ){
                medium = widgetCount/ MEDUIM_QUANTITY;
                widgetCount %= MEDUIM_QUANTITY;
                meduimTotal = (double)medium * MEDUIM_CONTAINER_PRICE;
                total += meduimTotal;
            // checking to see if widget is small, then do calculation   
            } else if(widgetCount >= SMALL_QUANTITY){
                small = widgetCount/ SMALL_QUANTITY;
                widgetCount %= SMALL_QUANTITY;
                smallTotal = (double)small * SMALL_CONTAINER_PRICE;
                total += smallTotal;
            // checking to see if widget = 0   
            } else if(widgetCount <= 0 ){
                loopDone = true;
            } else {
                System.out.println("Type in an integer: ");
                widgetCount = stdin.nextInt();
            }
        }
        System.out.println("Widget Manufacturing Company");
        System.out.println("Container Information Program");
        System.out.println("Enter the number of widgets to be shipped: " +
                firstWidgetCount);
        System.out.println("Container(s)\t Number");
        System.out.println();
        System.out.println("==========\t =====");
        System.out.println();
        System.out.println("Huge\t\t " + huge);
        System.out.println();
        System.out.println("Large\t\t " + large);
        System.out.println();
        System.out.println("medium\t\t " + medium);
        System.out.println();
        System.out.println("small\t\t " + small);
        System.out.println();
        System.out.println("==========\t =====");
        System.out.println();
        System.out.println("Total Cost\t " + total);
        System.out.println();
        System.out.println();
        System.out.println("Container Information Program completed.");
        
    }
    
}
