package basics2;
import java.util.*;

public class numberOfDigitsInANumber {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int digit ;

        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        while(num>0){
            digit = num%10;
            num/=10;
            sum = sum+digit;
        }
        System.out.print(sum+" is the sum of digits");
    }
}
