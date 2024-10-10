package strings;

import java.util.Scanner;

public class printAllSubstrings {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scan.nextLine();

        for(int i=0 ; i<=str.length() ; i++){
            for(int j=i ; j<=str.length() ; j++){
                System.out.print(str.substring(i,j) + " ");
            }
            System.out.println();
        }
    }
}
