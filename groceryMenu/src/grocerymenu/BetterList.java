/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocerymenu;

/**
 *
 * @author jjsurfgirl
 */

import java.util.ArrayList;
public class BetterList {
   
    private ArrayList<String> items;
    
    public BetterList(){
        items = new ArrayList<String>();
        
        // fun nothing
    }
    
    public BetterList(int size){
        items = new ArrayList<String>(size);
    }
    
    public void addItem(String newby){
        items.add(newby);
    }
    
    public void addItem(int index, String newby){
        items.add(index -1, newby);
    }
    

    
    public int getCount(){
        return items.size();
    }
    
    public void removeItem(int index){
        items.remove(index -1);
    }
    // I duck my searches
    
    public void printList(){
        for(int i = 0; i < items.size(); i++){
            System.out.println((i + 1) + ": " + items.get(i));
        }
    }
    
    public void replaceItem(int index, String newby){
        items.set(index -1, newby);
    }
    
}

// string methods last method

// mid = Math.max(Math.max(a,b), c)
// min Math.min(Math.max(a,b), c)
// max = Math.max(Math.max(a,b), c)