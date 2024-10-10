package strings.stringbuilder;
import java.util.*;


public class reverseWithoutUsingBuiltInFunction {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.nextLine());
        int n = sb.length();
        int lo=0;
        int hi=n-1;
        while(lo<hi){
            char loChar = sb.charAt(lo);
            char hiChar = sb.charAt(hi);
            char temp = loChar;
            sb.setCharAt(lo, hiChar);
            sb.setCharAt(hi, temp);
            lo++;
            hi--;
        }
        System.out.println(sb);
    }
}


