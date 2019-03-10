/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocerymenu;

/**
 * Description: Array Lists
 * 
 * @author Jenna Connolly
 */
public class GroceryMenu {
    
    
    
    
    
//
//    /**
//     * @param args the command line arguments
//     */
    public static void main(String[] args) {
        //List myList = new List(30);
        BetterList myList = new  BetterList(); 
        myList.addItem("Fire Ball");
        myList.addItem("Banananas");
        myList.addItem("Tacos");
        for(int i = 0; i <5; i++){
            myList.addItem("Item " + i);
        }
        System.out.println(myList.getCount());
        myList.addItem(2,"Spam");
        System.out.println(myList.toString());
        myList.printList();
        myList.removeItem(2);
        myList.printList();
        myList.replaceItem(1, "rum");
        
        
        
        
        myList.printList();
        myList.addItem("Cheese");
        myList.removeItem(2);
        myList.printList();
        myList.removeItem(4);
        myList.printList();
//        
       // boundary checkign
       myList.removeItem(myList.getCount());
        myList.printList();
       
        System.out.println(args.length);
        int nums;
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
       // sum(1,2,3,4,5);
//       nums = Integer.parseInt(args[2]);
       
    }
//    
//    // variable length argment
//    public static void sum(int... nums){
//        for(int val : nums){
//            System.out.println(val);
//        }
//    }
    
}

// 