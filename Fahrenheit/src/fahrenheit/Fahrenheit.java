/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheit;

/**
 *
 * @author jjsurfgirl
 */
public class Fahrenheit {

    /**
     * @param args the command line arguments
     * test 0 for celius
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(toFarhenheit(32));
        System.out.println(toCeilus(0));
    }
    
    public static double toFarhenheit(double farenheit){
        double celius;
        celius = (farenheit - 32)/ 1.8;  
        return celius;
    }
    
    public static double toCeilus(double celius){
        double farenheit;
        farenheit = (1.8 * celius)+ 32;
        return farenheit;
    }
    
}
