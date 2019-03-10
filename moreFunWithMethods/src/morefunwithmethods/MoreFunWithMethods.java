/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 Test question what is the name goes by the arguemtns when you call it,
what is it called whn 2 methods have the same name = overloading, it goes off the number
of args and type of metho
// test question: static method,seizea,call method, and passed data 
 */
package morefunwithmethods;

/**
 *
 * @author jjsurfgirl
 * all arguestns are passed by value 
 */
public class MoreFunWithMethods {

    /**
     * @param args the command line arguments
     */ // methods can only return 1 thing
    //modifiers   can't return
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 2;
        int y = 4;
        
        Point p = new Point(2, 4);
        Point q = new Point(3, 9);
        p.doublePoint();
        p.printPoint();
        p.setPoint(4,9);
        p.printPoint();
        q.setPoint(4, 42);      // Set q to (4, 42)
        q.printPoint();        // print the new q
        
    /*    Point p = new Point(); // creating Object
        p.printPoint();
        printPoint(x, y);
        //printPoint(p);
        doublePoint(x,y);
        printPoint(x,y);
        //doublePoint(p);
        p.doublPoint();
        printPoint(p);
      */ 

         
    }
           public static void doublePoint(Point p) {
               p.x *= 2;
               p.y *= 2;
           }
           
           public static void  doublePoint(int a, int b) {
               a *= 2;
               b *= 2;
               
           }
    
           public static void printPoint(int a, int b){
            System.out.println(a + ":" + b);
        }
           
            public static void printPoint(Point p){
            System.out.println(p.x + ":" + p.y);
        }
    
    
}

class Point {
    int x = 2; // intstance varaible
    int y = 4;
    
    public Point(int x, int y) { //constructor
        this.x = x;
        this.y = y;
    }
    
    public void setPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void printPoint(){
        System.out.println(x + ":" + y);
    }
    public void doublePoint(){
        this.x *= 2;
        this.y *= 2; // this = this object
    }
}