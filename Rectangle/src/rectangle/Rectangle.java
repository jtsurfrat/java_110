/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 * Description: Blueprint for Rectanlangl
 *
 * @author jjsurfgirl ask r making images out of asks
 */
public class Rectangle {

    // Instance Variables
    private int width = 4;
    private int height = 8;
    private char symbol = '*';

    public Rectangle() {
        width = 1;
        height = 1;
        symbol = '*';
    }

    public Rectangle(int width, int height, char symbol) {
        this.width = width;
        this.height = height;
        this.symbol = symbol;
    }

    // Getters
    public int getWidth() {
        return width;
    }

    // Setters
    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }

    }

    //getters
    public int getHeight() {
        return height;
    }

    // setters
    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }

    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    // define what makes it equal
    public boolean equals(Rectangle other) {
        return this.width == other.width && this.height == other.height
                && this.symbol == other.symbol;
    }

    @Override
    public String toString() {
        return "Height: " + height + "\nWidth: " + width + "\n"
                + "Symbol " + symbol;
    }

    void printRectangle() {
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                System.out.print(this.symbol);
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        Rectangle q = new Rectangle();
        r.printRectangle();

        q.setWidth(4);
        q.setHeight(8);
        q.setHeight(-10);
        q.setSymbol('*');

        q.printRectangle();
        System.out.println(r.getWidth());
        System.out.println(q.getWidth());
        //r = q;
        System.out.println(r);
        System.out.println(q);
//        if(r.equals(q)){
//            System.out.println("Equal");
//        }
        System.out.println("is q equal r? " + q.equals(r));

        Rectangle w = new Rectangle(10, 20, '@');
        System.out.println(w.toString());
        w.printRectangle();
        
        int value = 5;
	if(value > 0){
		for(int index = 1; index < value; index++){
			System.out.print("-");
		}
		System.out.println();
		
		
	} else {
			
	}
        
        
int x = 5;
int y = 3;
int z = 2;
int min = 0;
if(x < y && x < z){
	min = x;
	
} else if (y < x && y < z){
	min = y;
	
} else {
	min = z;
	
}
System.out.println(min);

    }

}
