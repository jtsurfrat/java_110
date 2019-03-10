/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guifun;

/**
 *
 * @author jjsurfgirl
 */
import javax.swing.JOptionPane;

public class GUIFun {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        double temperature;
        double windSpeed;
        double windChill;
        boolean done = false;

        JOptionPane.showMessageDialog(null, "Welcome to your nightmare ");
        windSpeed = getGUIDouble("Enter Wind Speed");
        temperature = getGUIDouble("Enter Tempt");
        windChill = calcWindChill(windSpeed, temperature);
        displayResults(windSpeed, temperature, windChill);

    }

    public static double getGUIDouble(String prompt) {
        String input;
        boolean done = false;
        double result = 0;
        Double windSpeed;
        do {
            try {

                input = JOptionPane.showInputDialog(prompt);
                JOptionPane.showMessageDialog(null, "You entered: " + input);
                
                result = Double.parseDouble(input); // Wrapper Class 
                done = true;
            } catch (Exception e) {
                input = JOptionPane.showInputDialog(null, "Red line of death "
                        + "e.");

            }

        } while (!done);
        return result;
    }
    
    
    
    public static double calcWindChill(int windSpeed, int temp){
        
        return temp - Math.sqrt(windSpeed);
    }
    
    
    public static void displayResults(double windSpeed, double temp, double winchill){
        
        JOptionPane.showMessageDialog(null, "Temp: " + temp + "\nWindspeed " + 
                windSpeed + "\n WindChill: " +winchill);
    }

}
