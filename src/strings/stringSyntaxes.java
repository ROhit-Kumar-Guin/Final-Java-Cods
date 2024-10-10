package strings;

import java.util.Scanner;

public class stringSyntaxes {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        //strings are character array
        char[] ch = {'R','o','h','i','t'};
        for(char letter : ch){
            System.out.print(letter + " ");
        }

        //declaration
        String s = "My name is Rohit";
        System.out.println(s);

        //input string

        System.out.print("Enter full name : ");
        String str2 = scan.nextLine();
        System.out.println("Your full name is : " +str2);


        //lengthOf()
        System.out.println("Length of your name : " + str2.length());
        //charAt()
        System.out.println("charAt(3) is : "+str2.charAt(3));
        //substring()
        System.out.println("Substring from index 6 is : " + str2.substring(6));
        //indexOf()
        System.out.println("Index of a is " + str2.indexOf('a'));
        //compareTo()
        String a = "Absdefjjdjje";
        String b = "DFGh";
        System.out.println(a.compareTo(b));

        System.out.println(a.substring(3,6));
        System.out.println(a.substring(6,3));
        

    }
}
