/*

 */
package television;

/**
 *
 * @author jjsurfgirl
 */
public class Television {
    private String MANUFACTURER;
    private int SCREEN_SIZE;
    private boolean powerOn;
    private int channel;
    private int volume;
    
    // constructors build objects, when they are initilized
    Television(String brand, int size){ // constructor
        this.MANUFACTURER = brand;   
        this.SCREEN_SIZE = size; // constructors make me happy!
        this.powerOn = false;
        this.volume = 20;
        this.channel = 2;
    }
    
    /**
     *  creating getters and setters
     * @return  manufactor or screen size
     */
    
    public String getManufacturer(){
        return MANUFACTURER;
    }
    
     /**
     *  creating getScreen Size method
     * @return  screen seize
     */
    
    public int getScreenSize(){
        return SCREEN_SIZE;
    }
    
     /**
     *  creating getVolume
     * @return  volume
     */
    
    public int getVolume(){
        return volume;
    }
    
     /**
     *  creating getChannel
     * @return  volume
     */
    
    public int getChannel(){
        return channel;
    }
    
     /**
     *  creating increease volume
     * increments volume by 1
     * @return  nothing,
     */
    
    public void increaseVolume(){
        this.volume += 1;
    }
      /**
     *  creating decreease volume
     * increments volume by 1
     * @return  volume
     */
    
    public void decreaseVolume(){
        this.volume -=1;
    }
    
    public void setChannel(int station){
        this.channel = station;
    }
    
    public void power(){ // changes power to on or off
        if(!powerOn){
            powerOn = true;
        } else {
            powerOn = false;
        }
    }
    
}


/*
package tues.sis;

/**
 *
 * @author john
 */
//public class Person {
//    private String name;
//    private int age;
//    protected static int numberOfPeople = 0;
//
//    @Override
//    public String toString() {
//        return this.name + " is " + this.age + " years old";
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//        
//        numberOfPeople++;
//    }
//}
//*/