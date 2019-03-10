/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statearray;

/**
 * Extra credit stat assignment
 * @author Jenna Connolly
 * print out stats
 */

import java.util.*;
import java.text.DecimalFormat;

public class StateArray {

    /**
     * Title array stats operation Jenna Connolly
     */
    public static void main(String[] args) {

        int[] randArray; // creating array
        int nintyNine = 99; // creating number 99

        randArray = new int[nintyNine]; // initizing array with 99 items
        randomNumArray(randArray);
        print5NumberSummary(randArray); // prints 5 methods

    }
    
    
    // print out the deviation method
    public static void printStandardDeviation(int [] array, double mean){
        int num = array.length;
        
        double [] varArray = new double[num];
        double sum = 0;
        double variance = 0;
        DecimalFormat formatter = new DecimalFormat("#0.0");
        // looping over the array
        for(int i = 0; i < array.length; i++){
            // divieding by mean
            varArray[i] = array[i]-mean; //minus mean

            //System.out.println("Deviat: " + varArray[i]);
            varArray[i] =  Math.pow(varArray[i], 2); // square it      
           // System.out.println(varArray[i] + ": Squared");
            // sum
            sum += varArray[i];
            //System.out.println(sum + ": sum");
            // square it
            
        }
        variance = sum/(num -1);
        System.out.println(formatter.format(variance) + ": Variance");
    }

    // prints most come numbers
    public static void printMode(int[] array) {
        // most common numbers that appear
        int[] counterArray = new int[array.length + 2];
        
        for (int i = 0; i < array.length; i++) {
            counterArray[array[i]]++; // counting elements to each 
                                       // new array
        }
        // prints
        for (int i = 0; i < counterArray.length; i++) {
            if(counterArray[i] == 0){
                continue;
            } else {
                System.out.println("array item: " + (i)
                    + " has: " + counterArray[i] + " times");
            }
            
        }

    }

    public static void print5NumberSummary(int[] randArray) {
        int[] sortAccending;
        double mean;
        double medium;
        int[] mode; // returns most used array items

        //randArray = randomNumArray(randArray);
        for (int i = 0; i < randArray.length; i++) {
            System.out.println(randArray[i] + ": Randam array Gen");
        }
        System.out.println();
        // makes array in acceding
        sortAccending = sortArray(randArray);
        // order
        for (int i = 0; i < sortAccending.length; i++) {
            System.out.println(sortAccending[i] + ": Sorted");
        }

        mean = printMean(sortAccending);
        medium = printMedium(sortAccending); // middle number of array
        System.out.println(mean + " : mean");

        System.out.println(medium + ": medium");
        
        printStandardDeviation(sortAccending, mean);
        printMode(sortAccending);

    }

    // sorts array in accending order
    public static int[] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

    // prints medium of each array
    public static int printMedium(int[] array) {
        // Comparator <Integer> cmp = Collections.reverseOrder();

        int middle = array.length / 2;
        System.out.println("middle: " + middle);
        int middleNum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " printMedium");
            if (i == middle) {
                middleNum = array[i];
                // System.out.println(middleNum + "array ");
            }
        }
        //sort(array, cmp); 
        return middleNum;
    }

    // returns the average of the arra
    public static double printMean(int[] array) {
        double total = 0;
        double mean = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println(total + ": Total");
        mean = total / array.length;
        System.out.println("mean: " + mean);
        return mean;
    }

    // random int generator
    public static int randomGen() {
        int num;
        int max = 100;
        int min = 1;
        Random rand = new Random();
        num = rand.nextInt(max - 1 + min) + min;
        return num;
    }

    // random Number array calls random Gen to creat random numbers
    public static int[] randomNumArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = randomGen();
            //System.out.println(array[i]);
        }

        return array;

    }
    


}
