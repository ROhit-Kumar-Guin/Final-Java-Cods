package basics2;
import java.util.*;

public class sumOfTwoNumbers {
    public static void main(String[] args){
        @SuppressWarnings("resource")

        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = scan.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = scan.nextInt();
        int sum = a+b ;
        System.out.print("The sum is : "+sum);
        

    }
}
