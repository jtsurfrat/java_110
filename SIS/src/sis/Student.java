/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis;

/**
 *
 * @author jjsurfgirl
 */
public class Student extends Person22 {
    private int creditsTaking;

    public Student(int creditsTaking,String name, int id) {
        super(name, id);
    }

    @Override
    public String toString() {
        return super.toString() +"Student| " + name +
                "creditsTaking=" + creditsTaking + 
                "id" + super.getId() +  " |";
    //}
    }
    
    
}
