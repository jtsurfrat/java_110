/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprogram;

/**
 *
 * @author jjsurfgirl
 */
public class StringProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String blrg = "waTch pEOple diE";
        
        
        
        System.out.println(countCapitals(blrg));
    }
    
    // count the character that have in set "KPQTX"
    public static int countHardCon(String str){
        String hardCon = "kpqtKPQTX";
        //char c;
        char c;
        int count = 0;
        
        for(int i = 0; i < str.length(); i++ ){
            c = str.charAt(i);
            if(hardCon.indexOf(c) != -1){
                count++;
            }
        }
         return count;       
                
        //return "stuff";
    }
    
    public static int countCapitals(String str){
        char c;
        int count =0;
        // search each char
        for(int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
//            System.out.println(str.charAt(i));

//           if( c >= 65 && c <= 90){
//               return count++;
//           }
            if("kpqtxKPQTX".indexOf(str.charAt(i)) !=-1){
                count++;
            }
        }
        return count;
    }
    
}

// ethics paper
// flock of seaguls 
//