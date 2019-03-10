/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradeaverage;

/**
 * Descriptions: Get grades and  average
 * @author jjsurfgirl
 */
import java.util.Scanner;
public class GradeAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdin= new Scanner(System.in);
        
        int grade;      // grade entered
        int total = 0;  // acumulator
        int count = 0;  // Number of grades
        double average;
        
        System.out.println("Enter Grades at a time. ");
        System.out.println("Enter a -1 when done. ");
        
        grade = stdin.nextInt();
        
        while (grade != -1 ){
            total += grade;
            count++;
            System.out.println("Enter next number");
            grade = stdin.nextInt();
            
        }
        // prints out grade average
        if (count > 0) {
            average = (double)total/count;
            System.out.printf("Average = %.2f%n", average);
        }
        
        // moduat and dividion
        int num = (int)(Math.random() * 9000 + 400);
        System.out.println(num);
        
        System.out.print(num);
        
        do {
            
            System.out.println(num % 10);
            
            num = num /10;
        } while(num > 0);
    }
    
}
