/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithprintf;

/**
 *
 * @author jjsurfgirl
 */
public class FunWithPrintF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double bill = 82.76;
        double badTip = .1;
        double goodTip = .15;
        double   greatTip = .2;
        
        final double TAX = 1.075;
        
        System.out.println("Bill       Tip        Total");
        System.out.printf("%1.2f %10.2f  %.2f %n",
                bill,
                bill * greatTip,
                bill * greatTip + bill * TAX);
        
        System.out.printf("%1.2f %10.2f  %.2f %n",
                bill,
                bill * goodTip,
                bill * goodTip + bill * TAX);
        
        System.out.printf("%1.2f %10.2f  %.2f %n",
                bill,
                bill * badTip,
                bill * badTip + bill * TAX);
    }
    
}
