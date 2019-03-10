/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rand;

/**
 *
 * @author jjsurfgirl
 */
import java.util.Scanner;
import java.util.Random;
public class Rand {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        final int MIN_NUMBER = 64;
        final int MAX_NUMBER = 122;
        int trys = 0;
        String word = "Bacon";
        String [] letters = word.split("");
        System.out.println(letters[1]);
        
        Scanner keyboard = new Scanner(System.in);
        
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
        
        
        
    }
    
    public int findRandomNumberChar(){
        Random rand = new Random();
        return 0;
    }
    
}
