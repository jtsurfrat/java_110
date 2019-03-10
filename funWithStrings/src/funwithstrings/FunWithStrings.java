/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithstrings;

/**
 *
 * @author jjsurfgirl
 * two different data types = hold data 
 * character holds any character
 * pimative data tybpes hold data
 * objects do things for us
 * object scanner reads from outside the progamm
 * object math - does
 * 
 */
import java.util.Scanner;

public class FunWithStrings {

    /**
     * @param args the command line arguments
     * charters are two bytes
     * test question:
     * strings are immutable - can not be change
     * java has gabrag collect, java keeps track what you have use
     * in java everything is pointer varialbe 
     * only objects are stored in the hep
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdli = new Scanner(System.in);
        // new = method
        String str = new String ("Hello World");
        System.out.println(str + " original string");
        System.out.println(str.toUpperCase());
        
        String name = "bacon";
        System.out.println(name.charAt(name.length() -1));
        
        
        // modifies and saves the original
        str = str.toUpperCase();
        
        System.out.println(str);
        
        // new
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(3));
        //everyone is point at 0 
        
        System.out.println(str.charAt(10));
        System.out.println("Enter a phase");
        str = stdli.nextLine();
        
        System.out.println(str.charAt(3));
        
        
       // System.out.println(str.charAt(10));
        
        int x = str.length();
        
        System.out.println(str.charAt(x-1));
        // antho
        //K(f(g(x) - compsition algerbra
        
        //
        System.out.println(str.length() -1);
        
        int i = str.indexOf(" ");
        
        
        // i is the space
        System.out.println(str.substring(0, i));
        System.out.println(str.substring(i));
        
        System.out.println(i);
        
        
        
    }
    
}
