/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windchill2.pkg333;

import java.util.Scanner;

/**
 *
 * @author jjsurfgirl
 */
public class Windchill2333 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
