/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forlab;

/**
 *
 * @author jjsurfgirl
 */
import java.util.Scanner;
public class ForLab {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner stdin = new Scanner(System.in);
        
        
        boolean notDone = true;
        do {
            System.out.println("AbC  song");
         //TODO code application logic here
            for (int count = 65; count < 91; count++){
                System.out.println((char)count + ", ");
                if(count % 7 == 0){
                    System.out.println(count + " is divisable by 7");
                }
            }
            System.out.println();
            System.out.println("Now I know my ABC's ");
            System.out.println("Next time, won't you sing with me!");

            for(int count = 91; count >= 65; count--){
                System.out.println((char)count + ", ");
                if(count % 7 == 0){
                    System.out.println(count + " is divisable by 7");
                }
            }
            System.out.println();
            System.out.println("Now I know my ABC's ");
            System.out.println("Next time, won't you sing with me!");

            for (int count = 65;count < 91; count++){
                if(count % 2 == 0){
                    System.out.println((char)count + ", ");
                }
            }
            System.out.println("Now I know my ABC's ");
            System.out.println("Next time, won't you sing with me!");
            
            for(int count = 65; count < 91; count++){
                if((char)count == 'a' || (char)count == 'e' || (char)count == 'i' 
                        || (char)count == 'u'){
                    System.out.println((char)count);
                    
                }
                char c = (char)count;
                if ("AEIOU".indexOf(count) == -1){
                    System.out.println(c);
                }
            }
            
            System.out.println("Will yo sing with me?");
            String userInput = stdin.nextLine().toUpperCase();
            
            if(userInput.equals("NO")){ // use equals for string
                notDone = false;
            }
            
        
        }while(notDone);
        }
    
}

