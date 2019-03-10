/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testperson;

/**
 * Description: used to test our person class
 * @author jjsurfgirl
 */
public class TestPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person him = new Person();
       Person her = new Person("Pat",21);
       
       System.out.println(him.toString());
       System.out.println(her.toString());
       System.out.println(him.equals(her));
       
       him.setName("Pat");
       him.setAge(21);
       System.out.println(him.toString());
       System.out.println(him.equals(her));  
       
    }
    
}
