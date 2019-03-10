/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tele2;

/**
 *
 * @author jjsurfgirl
 */
public class Tele2 {

    /**
     * @param args the command line arguments
     */
    public final String MANUFACTURER;
    public final int SCREEN_SIZE;
    public boolean powerOn;
    public int channel;
    public int volume;
    
    public Television(){
        this.MANUFACTURER = "unknown";
        this.SCREEN_SIZE = 0;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Television {
    /**
     * Name Jenna Connolly
     * Description: Telvision
     * @param args the command line arguments
     * 10/29/2018
     * 
     * powerOn:boolean
     * -channel: int -volume: int 
     * +Television(brand: String, size: int):
     * +setChannel (station: int): void +power( ): 
     * void +increaseVolume( ): void +decreaseVolume( ): 
     * void +getChannel( ): int +getVolume( ): int +getManufacturer( ):
     * String +getScreenSize( ): int 
     * 
     */
    public final String MANUFACTURER;
    public final int SCREEN_SIZE;
    public boolean powerOn;
    public int channel;
    public int volume;
    
    public Television(){
        this.MANUFACTURER = "unknown";
        this.SCREEN_SIZE = 0;
        
    }
    
    /*
    
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
    
    */
    
    
}
