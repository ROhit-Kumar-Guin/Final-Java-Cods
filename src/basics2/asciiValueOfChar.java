package basics2;
import java.util.*;

public class asciiValueOfChar {
    public static void main(String[] args){
        
        @SuppressWarnings("resource")

        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = scan.next().charAt(0);
        System.out.println(ch);
        System.out.println((int)ch);
    }
}
