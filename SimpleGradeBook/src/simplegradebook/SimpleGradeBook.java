/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplegradebook;

/**
 *
 * @author jjsurfgirl
 */
import java.util.Scanner;
public class SimpleGradeBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] grades; // List of grades for a test
        // variable hols value of address
        grades = getGrades(); // Call a method to get the grades
        //printGrades(grades);
       // printAverage(grades);
        System.out.println(findLargest(grades));
        System.out.println(findLargestLoc(grades));
        sort(grades);
        printGrades(grades);
        int seed = 7;
        
        System.out.println("Seed: " + seed + ": In list: " + 
            binaryGrades(grades,seed));
//        for(int j = 0; j < grades.length; j++){
//            for (int i = 0; i < grades.length - (j+1); i++){
//                if(grades[i] > grades[i + 1]){
//                   swap(grades,i,i + 1);
//
//                }
//            
//            }
//            printGrades(grades); 
//        }
        
        
       // printGrades(grades); 
        
        
    }
    public static boolean binaryGrades(int[] grades, int seed){
        int index = grades.length/2;
        return true;
    }
    
    public static boolean searchGrades(int[] grades, int seed){
        for(int i = 0; i < grades.length; i++){
            if(grades[i] == seed){
                return true;
            }
        }
        return false;
    }
    
    public static void sort(int[] grades){
        for(int j = 0; j < grades.length; j++){
            for (int i = 0; i < grades.length - (j+1); i++){
                if(grades[i] > grades[i + 1]){
                   swap(grades,i,i + 1);

                }
            
            }
            //printGrades(grades); 
        }
    }
    
    public static void swap(int[] grades, int i, int j){
        int temp = grades[i];
        grades[i] = grades[j];
        grades[j] = temp;
    }
    
    public static int findLargest(int[] grades){
        int largest = grades[0];
        for(int i = 1; i < grades.length; i++){
            if(grades[i] > largest){
                largest = grades[i];
            }
        }
        return largest;
    }
    
    public static int findLargestLoc(int[] grades){
        int largestLoc = 0;
        int ll = 0;
        for(int i = 1; i < grades.length; i++){
            if(grades[i] > grades[largestLoc]){
                largestLoc = i;
            }
        }
        return largestLoc;
    }
    
    
    public static int getSum(int[] grades){
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return sum;
    }
    public static void printAverage(int[] grades){
        System.out.println("Average is: " +getSum(grades)/grades.length);
    }
    
    public static void printGrades(int[] grades){
//        for(int i = 0; i < grades.length;i++){
//            System.out.println(grades[i]);
//        }
        int count = 1;
        for(int grade: grades){
            System.out.print(grade + ", ");
            if (count%30 == 0){
                System.out.println("");
            }
        }
        System.out.println("");
    }
    
    public static int[] getGrades(){
        Scanner keyboard = new Scanner(System.in);
        int[] grades;
        int numGrades;
        
        System.out.println("How many grades will be entered?");
        numGrades = keyboard.nextInt();
        grades = new int[numGrades];
        
        for(int i = 0; i < grades.length; i++) {
//            System.out.println("Enter grade " + (i + 1));
//            grades[i] = keyboard.nextByte();
            
            int nextGrade = (int)(Math.random() * 100 + 1);
            grades[i] = nextGrade;
        }
        return grades; // reaturn grades
    }
    
}
