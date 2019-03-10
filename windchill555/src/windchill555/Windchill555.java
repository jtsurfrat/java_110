/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windchill555;

import java.util.Scanner;

/**
 *
 * @author jjsurfgirl
 */
public class Windchill555 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int width = getInt("Enter width,", 3, 10);
        int heigth = getInt("Enter Hight", 3, 10);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");

            }
            System.out.println("*");
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < width; i++) {

            for (int j = 0; j < width; j++) {
                if (i == 0) {
                    System.out.print("*");
                }

                // test 1 print a line
                // print a hollow line
                // print a line
//                if(i == width.lenght){
//                    
//                }
            }
            // System.out.println("*");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println("");

        for (int j = 0; j < heigth - 2; j++) {
            System.out.print("*");

            for (int i = 0; i < width - 2; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

    public static void greeting() {
        System.out.println("Welcome to the Windchill program");
        System.out.println("Best Program ever!");
    }

    public static int getInt() {
        Scanner stdin = new Scanner(System.in);
        int input;
        input = stdin.nextInt();
        stdin.nextLine();
        return input;
    }

    public static int getInt(String prompt) {
        Scanner stdin = new Scanner(System.in);
        System.out.println(prompt);
        int input;
        input = stdin.nextInt();
        stdin.nextLine();
        return input;
    }

    public static int getInt(String prompt, int min, int max) {
        Scanner stdin = new Scanner(System.in);
        boolean done = false;
        int input;
        do {
            System.out.println(prompt + " between " + min + " and " + max);
            input = getInt();

            if (input < min || input > max) {
                System.out.println("Invalid, trying agin");
            } else {
                done = true;
            }

        } while (!done);

        return input;
    }

}
