package strings;

import java.util.Scanner;

public class countVowels {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = scan.nextLine();
        int count = 0;
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' ){
                count++;
            }
        }
        System.out.print("Number of vowels in "+str+ " is : "+count);
    }
}
