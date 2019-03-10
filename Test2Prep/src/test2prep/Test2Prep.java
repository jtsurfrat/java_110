/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2prep;

/**
 *
 * @author jjsurfgirl
 */
public class Test2Prep {
    
    // exist in the class
    // public static = stuff

    /**
     * @param args the command line arguments
     * ++ increment operator
     * -- decrement operator
     * do, while are indermentent loops
     * for indeterment 
     * what  squence does for loop excute in, does one init, then test,
     * updates
     * iteration of number of times it exictues 
     * what's an initfent loop goes fore ever: 4-4 in book
     * know input validation
     */
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        System.out.println(x + ":" + y);
        System.out.println(x++); // increments forst
        System.out.println(++y);
        System.out.println(x + ":" + y);
        
        String blrg = "waTch pEOple diE";
        
        
        
        System.out.println(countCapitals(blrg));
        
        // scope only exits in the for loop
        for (int i = 0;i < 10; i++){
            System.out.println(i);
            
           
        }
        // doestn't work
//        System.out.println(i);
        
        // doestent excute because semi-colon
//        int i;
//        for (int i = 0;i < 10; i++);{
//            System.out.println(i);
//            
//           
//        }

        // doestent excute because semi-colon
//        int i;
//        for (i = 0;i < 10; i++){
//            System.out.println(i);
//            
//           
//        }

//for (int r = 0; r < 10; r++){
//    for(int s = 0; s < 10; s++) {
//        for (int t = 0; t < 10; t++){
//            System.out.println(r + ":" + s ":" + t);
//    }
//}
    
        System.out.println("Barg");
        
        // know termology of expetions
        
//                for (int i = 0,j= 0; i < 10; i++ j +=5){
//            System.out.println(i);
//          

//        for(int i = 0, j = 0; i; i < 10 || j < 100; i++, j+= 5){
//            if(i % 3 == 0){
//                continue;
//            } else {
//                if(i % 7 == 0){
//                    break;
//                }
//            }

//public static void doNothing(double blah){
//    System.out.println(blah);
//}

//           
        }
    double temps[] = {0.4, 5.3};
    int total = 0;
    double avgTemp;
    int k;
    for(k = 0; k < temps.length; k++){
	total += temps[k];
	avgTemp = total/temps.length;
	
	
}   
    
    
    public static int countCapitals(String str){
        return 0;
        
        
    }
                
}
//}
    
     
//        for (int i = 0,j= 0; i < 10; i++ j +=5){
//            System.out.println(i);
//            
//           
//        }
        //sSystem.out.println("Barg");
    
    
    
//}

// methods can return one item or nothing
    
//public static - modifiers
// staic = 1
// public anyone can use it
// void - returns nothing
 // func() -> argments and parameters


// when you call a method, you are calling that value
// int blrg - 3;
//doNothing(blrg)

//public static void doNothing(){
//' System.out.println(blah);

//}

// string value = adress in the heap

// looks for same
// public static void doNothing() {
//  System.out.println(blah);
//}

