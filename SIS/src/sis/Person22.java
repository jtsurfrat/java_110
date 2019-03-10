/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis;

/**
 * Description Jenna
 * @author jjsurfgirl
 */
public class Person22 {
    // field or intstance varaibles
    protected String name;
    private int id;
    protected static int numberOfPeople = 0; // child inherits from pareent
    // static = only 1
    
    public Person22(String name, int id) {
        this.name = name;
        this.id = id;
        this.numberOfPeople++;
    }

    public int getId() {
        return id;
    }
    
    
    
    public String String() {
        return "Person( " + "name=" + name + ", id=" + id + " )";
    }
    
    public int getNumPeople() {
        return numberOfPeople;
    }
}

// 10000 < 99999
