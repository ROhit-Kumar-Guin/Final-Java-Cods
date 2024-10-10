package strings.stringbuilder;
import java.util.*;

public class toggleCharacters {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        StringBuilder s = new StringBuilder(scan.nextLine());
         for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;
          

            if(ascii>65 && ascii <90){
                ascii+=32;
                
            }
            else if(ascii>97 && ascii<122){
                ascii-=32;
                
            }
            ch = (char)ascii;
            s.setCharAt(i, ch);
         }
         System.out.println(s);
    }
}
