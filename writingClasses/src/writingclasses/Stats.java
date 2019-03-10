/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writingclasses;

/**
 * Description: Stats
 * @author jjsurfgirl
 */
public class Stats {
    
    // Instances Variables
    private String gamer;
    private int wins;
    private int losses;
    
    // constructors
    // if you provide on maek sure you write your own defalut
    
    public Stats(){
        this.gamer = "unknown";
        this.wins = 0;
        this.losses = 0;
    }
    
    public Stats(String gamer){
        this.gamer = gamer;
        this.wins = 0;
        this.losses = 0;
    }
    
    //Getters
    
    //Setters if you want data to be read only, leave these out.
    
    public void setWins(int wins){
        if (wins >= 0) {
            this.wins = wins;  // "this " refers to the instance variable
        }
    }
    // instructors 
    // Methods that actaully create our oject. If we don't write one, one is provide
    
    //public int
    
    // Getting return value of instance varialbe
    
    public String getGamer(){
        return this.gamer;
    }
    
    /**
     * set Losses. Updates the losses instance variable if >=
     * @param losses  int with new value for losses
     */
    
    public void setLosses(int losses){
        if(losses >= 0){
            this.wins = losses;
        }
    }
    
//    public int setLosses(){
//        return this.l
//    }
    
//    public String getLosses(){
//        return this.losses;
//    }
    
    //must always provide if two objects are equal
    // Compares the string gamer values
    public boolean equals(Stats other){
        return this.gamer.equals(other.gamer);
    }
    
    
    //Equal
    
    // to String
    
    //Methods actually do the work
    
    public String toString(){
        return "Gamer: " + this.gamer + "\n" +
                "Wins: " + this.wins + "\n" +
                "Losses: " + this.losses + "\n";
    }
    
    public void winner(){
        this.wins++;
    }
    public void loser(){
        this.losses++;
    }
    
}
/*

new Scanner = method
constructor method builds 
default 

public means everyone can get to it,
private means only you can use it


// if you don't 


*/