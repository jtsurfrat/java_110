/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moreguifun;

/**
 *
 * @author jjsurfgirl
 */
import javax.swing. *;
import java.awt.event. *;
import java.awt.*; // color me purple
public class MoreGUIFun extends JFrame {

    private JPanel panel; // referance to a panel
    private JLabel titleLabel; // Referace to a label
    private JLabel tempLabel;
    private JLabel wsLabel;
    private JLabel wcLabel;
    private JLabel resultLabel;
    private JTextField tempField;
    private JTextField wsField;
    private JButton calcButton;
    
           
    
    public MoreGUIFun(){
        final int WIDTH = 350;
        final int HEIGHT  = 250;
        setTitle("WindChill");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        buildPanel();
        add(panel); // tadd this object to the container
        setVisible(true);
    }
    
    public void buildPanel(){
         titleLabel = new JLabel("Welcome to Wind Chill!");
         tempLabel = new JLabel("Tempeture");
         wsLabel =  new JLabel("Wind Speed");
         wcLabel = new JLabel("Wind Chill");
         resultLabel = new JLabel("");
         tempField = new JTextField(10);
         wsField = new JTextField(10);
         wcLabel = new JLabel("Wind Chill");

         calcButton = new JButton("Calc Wind chill");
         calcButton.setBackground(Color.BLUE);
         calcButton.setForeground(Color.YELLOW);
         
         panel = new JPanel();
         panel.setLayout(new FlowLayout());
         //panel.setLayout(new GridLayout(2, 4));
         panel.add(titleLabel);
         panel.add(tempLabel);
         panel.add(tempField);
         panel.add(wsLabel);
         panel.add(tempField);
         panel.add(wsField);
         panel.add(wsLabel);
         panel.add(resultLabel);
         panel.add(calcButton);
        
        
        //panel = new JPanel();
        //panel.add(label);
        
        calcButton.addActionListener(new CalcButtonListener());
    }
    
    private class CalcButtonListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e){
            System.out.println("Click");
            
            double windChill;
            double windSpeed;
            double temperature;
            String input;
            input = wsField.getText();
            //resultLabel.setText(input);
            windSpeed = Double.parseDouble(input);
            input = tempField.getText();
            temperature = Double.parseDouble(input);
            windChill = temperature - Math.sqrt(windSpeed);
            resultLabel.setText(Double.toString(windSpeed));
        }
    }
    
    public static void main(String[] args) {
        
        
        MoreGUIFun window = new MoreGUIFun();
       
        
        
    }
    
}
