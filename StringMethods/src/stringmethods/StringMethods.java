package stringmethods;

/**
 * Description:
 *
 * @author You
 */
import java.util.Random;

public class StringMethods {

    public static void main(String[] args) {
        // Call each method to demonstrate it's functionality
//        System.out.println("is G a digit: " + isDigit('G'));
//        System.out.println("is 8 a digit: " + isDigit('8'));
//        System.out.println("is 'c' a digit: " + isDigit('c'));
//        System.out.println(toLowerCase("COingIsFun"));
//        System.out.println(charactersOnly("Ba7dkcT"));
//        System.out.println(charactersOnly(7+"b8"));
//        System.out.println(isPalindrome("abc d!!#cb123a")) ;
//        System.out.println(isPalindrome("civic"));
//        System.out.println(reverse("reverse"));
//        System.out.println(jumble("reverse"));
//        System.out.println(swapPairs ("reverse"));
//        System.out.println(countVowels("missasseppssa"));
//        System.out.println(countConsonants("missasseppssa"));
//        System.out.println(allDigits("123456"));
//          System.out.println(allDigits("1234e56"));
//        System.out.println(allAlpha("alphanumeric"));
//        System.out.println(allAlpha("alphanum&1eric"));
//        System.out.println(stripVowels("missasseppssa"));
//        System.out.println(stripConsonants("missasseppssa"));
//        System.out.println(replace("mississippi",'i','o'));
//        System.out.println(countChar("mississippi", 's'));
//        System.out.println(countChar("mississippi", 'p'));
//        System.out.println(multiString("blargle"));
//        System.out.println(lowerCase("I'm Not Shouting"));
//        System.out.println(upperCase("I'm Not Shouting!"));
//        System.out.println(findInStr("find the missing dissing listing xz", "sing"));
        //System.out.println(findInStr("missippi", "dg"));
//        System.out.println(findInStr("find the missing dissing listing", 'n'));
//        System.out.println(findInStrLast("find the missing dissing listing", "sing"));
//        System.out.println(findInStrLast("find the missing dissing isting ", 'n'));
        System.out.println(inOrder(42, 24, 86));
        System.out.println(equals("cat","cat"));
    }
// Private helper method that strips out spaces and non-characters
// from a String

    private static String charactersOnly(String str) {
        String newby = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                newby += c + ",";
            } else {

            }

            // if it is character, add it to newby
            // else skip it
        }
        System.out.println(newby);
        return newby;
    }
// Private helper method that checks to see if a character is a digit

    private static boolean isDigit(char c) {
        return (c >= 48 && c <= 57);
//        if(c >= 48 && c <= 57){
//            return true;
//        } else {
//            return false;
//    }   
        //return true;
    }
// Private helper method that checks to see if a character is a vowell

    private static boolean isVowell(char c) {
//        if(c == 'a' || c == 'A'){
//            
//        }
        boolean message = false;
        switch (c) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'O':
            case 'o':
            case 'u':
            case 'U':
                message = true;
        }
        return message;

    }

    private static String toLowerCase(String str) {
        String newby = "";

        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
            // In this loop, check each charatcter
            // If it is a captial letter, add the corresponing
            // lower case to newby
            // else 
            // just add the character to newby
            char c = str.charAt(i);
            //if(isVowell(c)){
            if (c >= 65 && c <= 90) {
                c += 32;
                //newby += '#';
            }
            newby += c;
        }
        return newby;
    }
// Private helper method that checks to see if a character is a
// consonant

    private static boolean isConsonant(char c) {
        // if it is between b and d or between f and h, 
        //j and m or between p and t or between v and z
        //char c = str.charAt(i);
        boolean charCheck = isVowell(c);

        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
            // if(c != charCheck){

        }
//        }
        return true;
    }
// Private help method that checks if two strings are equal

    private static boolean equals(String str1, String str2) {
//        str1 = lowerCase(str1);
//        str2 = lowerCase(str2);
//        System.out.println(str1);
        boolean isEqual = false;
        int st1Length = str1.length();
        int st2Length = str2.length();

        // check length
        // check each character
        //if any charater
        //char c;
        if (st1Length != st2Length) {
            isEqual = false;
        } else {
            for (int i = 0; i < st1Length; i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    isEqual = true;
                } else {
                    isEqual = false;
                    break;
                }
            }

            
        }
        
           return isEqual;
           
    }
        /**
         * isPalindrome accepts a string and returns true if the string is a
         * palindrome, otherwise returns false; should ignore spaces,
         * punctuation and case (upper and lower are the same). So, the
         * following ARE palindromes: "Never odd or even.â  , â  Cigar? Toss
         * it in a can. It is so tragic.â  , â  A man, a plan, a canal:
         * Panama.â 
         */
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        boolean isTrue = false;

        while (str.charAt(left) == str.charAt(right) && left < right) {
            left++;
            right--;
        }
        if (left < right) {
          //  System.out.print("Thats not a paladron");
            isTrue = false;
        } else {
          //  System.out.print("Thats is paladron");
            isTrue = true;
        }

//        for(int i = 0; i < str.length(); i++){
//            
//            for(int j = str.length() -1; j >= 0; j-- ){
//                char c = str.charAt(i); 
//                char d = str.charAt(j);
//                System.out.println(c + " :" + d);
////                System.out.println(d + " d is ");
////                if(c.equals(d)){
////                     
////                }
//            }
//           
//        }
        return isTrue;
    }

    /**
     * reverse accepts a string and returns a string that is the reverse of the
     * original
     *
     * @param str
     * @return reversed representation of str
     */
    public static String reverse(String str) {
        String stuff = "";
        int last = str.length() - 1;
        for (int i = last; i >= 0; i--) {
            char c = str.charAt(i);

            stuff += c;
        }
        // System.out.println(stuff);
        return stuff;
    }

    public static int randomNum(int min, int max) {
        Random random = new Random();
        int result;
        result = random.nextInt(max - min + 1) + min;

        return result;
    }

    /**
     * jumble accepts a string and returns a jumbled version of the original:
     * for this method, jumbled means that two randomly chosen characters other
     * than the first and last characters of the string are swapped; this method
     * must use the class, Random (see chapter 5). Examples of what this method
     * might do: â fistâ returns â fsitâ , â muchâ returns â
     * mcuhâ
     *
     * @param str string to be jumbled
     *
     */
    public static String jumble(String str) {

        int first = 1;
        int last = str.length() - 2;
        int rand1;
        int rand2;
        // calling random function
        rand1 = randomNum(first, last);
        rand2 = randomNum(first, last);

    

        //"reverse"
        char letter1;
        char letter2;
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
//            for (int j = 0; j < str.length(); j++){
            char c = str.charAt(i);
//                System.out.println(c + " c is :");
            if (rand1 == i) {
                //letter1 = c;
//                    System.out.println(letter1 + "--letter1 ");
                letter2 = str.charAt(rand2);
                c = letter2;
                newString += c;
               // System.out.println(letter2 + ": Letter :" + i);
            } else if (rand2 == i) {
                letter1 = str.charAt(rand1);
                c = letter1;
                newString += c;
                //System.out.println(letter1 + "----letter2 " + i);
            } else {
                newString += c;
            }

        }
       // System.out.println(newString);

        return newString;

    }

    /**
     * poop swapPairs accepts a string and returns a string that has adjacent
     * pairs of the original string swapped; for strings of odd length, leave
     * the last character unchanged. Examples: IN: examples OUT: xemalpse IN:
     * count OUT: ocnut
     */
    public static String swapPairs(String str) {
        String strNew = "";
        int last = str.length();
        char odd;
        char even;

        for (int i = 0; i < last; i++) {
            char c = str.charAt(i);

            if (i == last - 1) {
                strNew += c;
                //System.out.println("stuff");
                break;
            }

            if (i % 2 == 0) {

                strNew += str.charAt(i + 1); // adds next charater
                strNew += str.charAt(i); //adding character where at
             //   System.out.println(strNew + "  strNew");
                even = c;
            } else {
//                strNew += str.charAt(i-1);
//                strNew += str.charAt(i);
//                System.out.println(c + " c is");
//                odd = c;
            }

            // bacon!
        }
       // System.out.println(strNew + " "
       //         + "done");
        return strNew;
    }

    /**
     * countVowels accepts a string of any characters and returns the number of
     * vowels in the string. (aeiou)
     *
     * @param str
     * @return integer count of vowels in str
     */
    public static int countVowels(String str) {
        int last = str.length();
        int counter = 0;
        for (int i = 0; i < last; i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                counter += 1;
            }
        }
        //System.out.println(counter);
        return counter;
    }

    /**
     * countConsonants accepts a string of any characters and returns the number
     * of consonants in the string
     *
     * @param str
     * @return integer count of consonants in str
     */
    public static int countConsonants(String str) {
        int last = str.length();
        int counter = 0;
        for (int i = 0; i < last; i++) {
            char c = str.charAt(i);
            if (c != 'a' || c != 'e' || c != 'i' || c != 'o' || c != 'u') {
                counter += 1;
            }
        }
        return counter;
    }

    /**
     * allDigits accepts a string and returns true if every character is a
     * digit, otherwise false
     *
     * @param str
     * @return true of all digits, false otherwise
     */
    public static boolean allDigits(String str) {
        boolean message = false;
        int counter = 0;
        String stringNew = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
          //  System.out.println(c);
            if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5'
                    || c == '6' || c == '7' || c == '8' || c == '9' || c == '0') {
                counter += 0;
              //  System.out.println("bacon");
            } else {
                counter += 1;
            }
        }
       // System.out.println(counter);
        if (counter > 0) {
            message = false;
        } else {
            message = true;
        }

        return message;
    }

    /**
     * allAlpha accepts a string and returns true if every character is a letter
     * (either case), otherwise false
     *
     * @param str
     * @return true if all alpha, false otherwise
     */
    public static boolean allAlpha(String str) {
        boolean isBacon = true;
        int counter = 0;

        //((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
          //  System.out.println(c);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                counter += 0;
            } else {
                counter += 1;
            }
        }

        if (counter > 0) {
            isBacon = false;
        }

        return isBacon;
    }

    /**
     * stripVowels accepts a string and returns the string with no vowels.
     * Example: IN: s-cat=tered OUT: s-ct=trd
     *
     * @param str
     * @return str with no vowels to be found
     */
    public static String stripVowels(String str) {
        int last = str.length();
        String newString = "";
        for (int i = 0; i < last; i++) {

            char c = str.charAt(i);
           // System.out.println(c);

            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                //System.out.println(c);
                newString += c;
            }

        }
       // System.out.println(newString);
        return newString;
    }

    /**
     * stripConsonants accepts a string and returns the string with no
     * consonants. Example: IN: s_cat$tered OUT: _a$ee
     */
    public static String stripConsonants(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println(c);
                newString += c;
            }
            System.out.println(c);
        }
        System.out.println(newString);
        return newString;
    }

    /**
     * replace accepts a string and two characters, returns the string with all
     * occurrences of char1 replaced by char2. Example: IN: mississippi, i, o
     * OUT: mossossoppo
     *
     * @param str
     * @param c1
     * @param c2
     * @return str with all instance of c1 replaced with c2
     */
    public static String replace(String str, char c1, char c2) {
//        char i = 'i';
//        char o = 'o';
        String bacon = "";
       // System.out.println(c1);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == c1) {
                c = c2;
            }
            bacon += c;
        }
        //System.out.println(bacon);
        return bacon;
    }

    /**
     * countChar accepts a string and a character, returns the number of
     * occurences of the character in the string. Example: IN: m.is_si-ssi=pp!i,
     * i OUT: 4
     *
     * @param str
     * @param c
     * @return integer count of c in str
     */
    public static int countChar(String str, char c) {
//        System.out.println(c);
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == c) {
                counter += 1;
            }
        }
//        System.out.println(counter);
        return counter;
    }

    /**
     * multiString accepts a string and returns a string with repeated
     * characters: the first character is repeated string-length times, the
     * second character is repeated one less time, until the last character is
     * included only once (not repeated). Example: IN: test OUT: tttteeesst IN:
     * sentence OUT: sssssssseeeeeeennnnnnttttteeeennncce
     *
     * @param str
     * @return revised string
     */
    public static String multiString(String str) {
        int strLength = str.length();
        //int strCounter = strLength;
        char repeatCh;
        String bacon = "";
        //System.out.println(strCounter);
        char c;
        //"blargle"
        for (int i = 0; i < strLength; i++) {
            for (int j = strLength - i; j > 0; j--) {
                c = str.charAt(i);
                //System.out.print(c);
                bacon += c;
            }

        }
       // System.out.println("");
        //System.out.println(bacon);
        return bacon;
    }

    /**
     * lowerCase accepts a string and returns the string in all lowercase; do
     * not use the String classâ  s toLowerCase method, do not use the
     * Character class method either.
     *
     * @param str
     * @return str in all lower case
     */
    public static String lowerCase(String str) {
        //if(c >= 65 && c <= 90 ){
//                c += 32;
        //newby += '#';
//            } 
//            newby += c;
        String newString = "";
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                c += 32;
            }
            newString += c;
        }
        //System.out.println(newString);
        return newString;
    }

    /**
     * upperCase accepts a string and returns the string in all uppercase; do
     * not use the String classâ  s toLowerCase method, do not use the
     * Character class method either.
     *
     * @param str
     * @return str in all upper case
     */
    public static String upperCase(String str) {
        String newString = "";
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c >= 97 && c <= 122) {
                c -= 32;
            }
            newString += c;
        }

        //System.out.println(newString);

        return newString;
    }

    /**
     * findInStr accepts two strings and returns the character index of the
     * position where the second string begins in the first; returns -1 if the
     * second string does not appear in the first. Examples: IN: mississippi ss
     * OUT: 2 IN: superlative zzl OUT: -1
     *
     * @param s1
     * @param s2
     * @return index of s2 in s1
     */
    public static int findInStr(String s1, String s2) {
        int strlength1 = s1.length();
        int strlength2 = s2.length();
        int stoppingPoint = s2.length();
       
        int found = 0;
        char c;
        int counter = 0;
        //int
        for (int i = 0; i <= strlength1- stoppingPoint; i++) {

           if(equals(s1.substring(i, strlength2), s2)) {
              found = i;
              break;
           } else if(i < strlength1 - stoppingPoint){
               strlength2++;
           } else {
               found  = -1;
               break;
           }
        }

        return found;
    }



/**
 * findInStr is an overloaded version of previous method, accepts a string and a
 * character, returns the index of the position where the character first
 * appears in the string; returns -1 if the character does not appear in the
 * string. Examples: IN: dazzling z OUT: 2 IN: superlative z OUT: -1
 *
 * @param s1
 * @param c
 * @return
 */
public static int findInStr(String s1, char c) {
        int s1Length = s1.length();
        char d;
        int found = 0;
        for(int i = 0; i < s1Length; i++){
            d = s1.charAt(i);
            if(d == c){
               //System.out.println(d) ;
               found = i;
               break;
            }
        }
       // System.out.println(found);
        return found;
    }

    /**
     * findInStrLast accepts two strings and returns the character index of the
     * rightmost position where the second string begins in the first; returns
     * -1 if the second string does not appear in the first. Examples: IN:
     * mississippi ss OUT: 5 IN: superlative zzl OUT: -1
     *
     * @param s1
     * @param s2
     * @return
     */
    public static int findInStrLast(String s1, String s2) {
//        int strlength1 = s1.length();
//        int strlength2 = s2.length();
//        int stoppingPoint = s2.length();

//          s2 = reverse(s2);
         // System.out.println(s2);
          int strLength1 = s1.length()-1;
          int strLength2 = s2.length()-1;
          int found = 0;
          int stoppingPoint = s2.length();
          
          for(int i = strLength1, j= strLength2; i >= 0; i--){
              if(s1.charAt(i) == s2.charAt(j)) {
                  found = i;
                  j--;
                  if(j == 0){
                      break;
                  }
              //found = i;
              break;
           }  else {
               j = 0;
               found  = -1;
               //break;
           }
         
          }
// nextcloud
// gitLab

        return found;
//        return -1;
    }

    /**
     * findInStrLast is an overloaded version of previous method, accepts a
     * string and a character, returns the index of the rightmost position where
     * the character first appears in the string; returns -1 if the character
     * does not appear in the string. Examples: IN: dazzling z OUT: 3 IN:
     * superlative z OUT: -1
     *
     * @param s1
     * @param c
     * @return revised String
     */
    public static int findInStrLast(String s1, char c) {
        int st1Length = s1.length() -1;
       // System.out.println(st1Length);
        char d;
        int found = 0;
        
        for(int i = st1Length; i > 0; i--){
          d = s1.charAt(i);  
          if(d == c){
              //System.out.println(d + "i " + i);
              found = i;
              break;
          }
        }
       // System.out.println(found);
        return found;
    }

    /**
     * inOrder accepts 3 integers and returns a string containing the three
     * integers in ascending order separated by a single space between the first
     * two and another single space between the second and third. Examples: 1,
     * 2, 3 returns â  1 2 3â  ; 199, 8, 23 returns â  8 23 199â  .
     *
     * @param a
     * @param b
     * @param c
     * @return String representation of numbers in order
     */
    
    public static String inOrder(int a, int b, int c) {
        String newString = "";
        int[] array = {a,b,c};
        int[] newArray = {0,0,0};
        if(a < b){ // a is less then b
            if(a < c){  // a is less then c
               newArray[0] = a;
            } else { // a is greater then c
               newArray[0] = c;
               newArray[1] = a;
            }
            if(b < c){  // b less then c
               newArray[1] = b;
               newArray[2] = c;
            } else {    // b is greater then c
               newArray[2] = b;
               newArray[1] = c;
            }
        } else {  // a is greater then b
            if(a < c){  // a is less then c
                newArray[1] = a;
                newArray[2] = c;
                
            } else {       /// a is greater then c
                newArray[2] = a;
                newArray[1] = c;
            }
            if(b < c){  // if b is less then c
                newArray[0] = b;
                //newArray[1] = c;
            } else {   // if b is greater then c
                newArray[1] = b;
                newArray[0] = c;
            }
        }
//        System.out.println(newArray[0]);
//        System.out.println(newArray[1]);
//        System.out.println(newArray[2]);
        //42, 24, 86
        for(int i = 0; i < newArray.length; i++){
            newString += newArray[i] + ", ";
        }
        return newString;
    }
}
