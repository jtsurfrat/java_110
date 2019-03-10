
package testperson;

/**
 *Person. class Holds charactistic and behaviors fo perons
 * @author jjsurfgirl
 * date: 10/15/2015
 */
public class Person {
    private String name;
    private int age;
    
    public Person(){
        this.name = "unknown";
        this.age = 0;
    }
//    public Rectangle(int width, int height, char symbo){
//        this.width = width;
//        this.height = height;
//        this.symbol = symbol;
//    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age > 0){
           this.age = age; 
        } else {
            System.out.println("Error!");
        }
        
    }
    
    public String toString(){
        return ("Name: " + this.name + "Age: " + this.age);
    }
    
    public boolean equals(Person otherGuy){
        if(this.name.equals(otherGuy.name)&& 
            this.age ==  otherGuy.age){
            return true;
        } else {
            return false;
        }
    }
    

    
}
