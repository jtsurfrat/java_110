/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writingclasses;

/**
 *
 * @author jjsurfgirl
 */
public class WritingClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stats myStats = new Stats("Bacon");
        Stats yourStats = new Stats("Rufus");
        myStats.setWins(0); // call a method for an object "objectName.Method"
        myStats.setLosses(0);
        
        for(int i = 0; i < 100; i++){
           int d1 = (int)(Math.random() * 6 + 1);
           int d2 = (int)(Math.random()* 6 +1);
           
           if(d1 + d2 > 4 && d1 +d2 < 9){
               myStats.winner();
               yourStats.loser();
           } else {
               myStats.loser();
               yourStats.winner();
           }
        }
        System.out.println(myStats);
        System.out.println(yourStats);
        
    }
    
}
// test question if you don't provide a constructor they
// provide on for you

// Creating a basic new data type
class StatsDataType {
    int wins;
    int losses;
}
