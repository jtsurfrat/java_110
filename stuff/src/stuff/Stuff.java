/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;

/**
 *
 * @author jjsurfgirl
 */
import java.util.Scanner;
public class Stuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdin = new Scanner(System.in);
        int num = 1;
int total = 0;


//for(int i = 65; i < 70; i++) {
//	for(int j = 65; j < 70; j++){
//		System.out.print((char)j);
//	}
//        System.out.println((char)i);
//}

for (char i='a'; i<='e'; i++)
    for (char j='a'; j<='e'; j++) {
        System.out.print(i);
    System.out.println(j);
}
System.out.println();

for (char i='a'; i <='e'; i++){
    for(char j='a'; j <='e'; j++){
      System.out.print(i);
      System.out.println(j);
    
    }
    
}
System.out.println();
//int i,j,n=3;

//for( i=1;i<=n;i++){
//    for(j=1;j<=i;j++) {
//        System.out.print('*');
//        System.out.println();
//    }
//}
// traignles of *
int i,j,n=5;
for (i = 1; i <= n; i++){
    for( j=1; j<= i; j++){
        System.out.print("*");
        
    }
    System.out.println();
    
}


while (num > 0){
	num = stdin.nextInt();
	
	if(num % 2 == 0 && num > 0){
            total += num;
		
	}


    }



System.out.println(total);    
    }
 


    
    
    


}
