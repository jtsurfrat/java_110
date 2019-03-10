/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis;

/**
 * Description: Demonstrates building class and inheritance
 * @author jjsurfgirl
 */
public class SIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create 3 people
        
        Person22 bubba = new Person22("Bubba", 123456);
        Person22 bertha = new Person22("Bertha", 666);
        Person22 starLord = new Person22("StarLord", 42);
        System.out.println(bubba);
        System.out.println(bertha);
        System.out.println(starLord);
        System.out.println(bubba.getNumPeople());
        System.out.println(bertha.getNumPeople());
        System.out.println(starLord.getNumPeople());
        
        Student ryan = new Student(15, "RyanToad", 0);
        Instructor meacham = new Instructor(15, "RyanToad", 86);
        System.out.println(ryan);
        System.out.println(meacham);
        
        System.out.println(meacham.getNumPeople());
        System.out.println(ryan.getNumPeople());
        
        Person22 clone = ryan;
        System.out.println(clone);
        
        if(clone == ryan){
            System.out.println(clone);
        }
        
        //Student cody = (Student)bubba; bad bubba isn't a student
        
        Person22[] people = new Person22[100];
        
        for (int i = 0; i < 100; i++){
            people[i] = new Person22("Student" + i, 1000+i);
        }
        
         for (int i = 0; i < 100; i++){
            System.out.println(people[i]);
        }
    }
    
}
