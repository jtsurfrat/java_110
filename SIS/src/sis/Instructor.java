/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis;

/**
 * Description Instructor Extends Person
 * @author jjsurfgirl
 */
public class Instructor extends Person22{
    private int creditsTeaching;
    
    public Instructor(int creditsTeaching, String name, int id){
        super(name,id);
        this.creditsTeaching = creditsTeaching;
    }
    
    @Override
    public String toString() {
        return super.toString() +"Student|" + name +
                "creditsTeaching=" + creditsTeaching + 
                "id" + super.getId() +  "|";
    }

}
