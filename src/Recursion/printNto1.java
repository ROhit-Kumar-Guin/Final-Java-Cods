package Recursion;
import java.util.*;

public class printNto1 {

    public static void print(int num){
        if(num==0) return;
        else{
            System.out.println(num);
            print(num-1);
        }
      
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        scan.close();
        print(num);
    }
}
