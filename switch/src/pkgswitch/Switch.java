/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author jjsurfgirl
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char response = 'y';
        
        switch(response){
	case 'y':
		System.out.println("Your request is being processed is printed");
		break;
	case 'n':
		System.out.println("Thank you anyway for your consideration is printed");
		break;
	case 'h':
		System.out.println("Sorry, no help is currently available is printed");
		break;
	default:
		System.out.println("Invalid entry; please try again is printed ");
}
    }
    
}
