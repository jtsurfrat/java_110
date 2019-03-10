/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofunwithprint;

/**
 * Description Practice reading from and writing to a file
 * @author jjsurfgirl
 */
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class Iofunwithprint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        try {
            // writing to a file
             PrintWriter outputFile = new PrintWriter("Names.txt");
            outputFile.println("Chris");
            outputFile.println("Kathyen");
            outputFile.close();
        } catch(Exception e) { // exceptions is something goes wrong
            System.out.println("Something went wrong.. ");
        }
       // Read from a file
       try {
           File inputFile = new File("Names.txt");
            Scanner input = new Scanner(inputFile);
            while (input.hasNext()){ // open file reads line by line
                //System.out.pirntln();
                System.out.println(input.nextLine());
            }
            
            
       } catch (Exception e) {
           System.out.println("File not found");
       }
       
       
    }
    
}
