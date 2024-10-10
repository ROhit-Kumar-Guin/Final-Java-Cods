package basics2;
import java.util.*;

public class divisibleOrNot {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        if (num%5==0) {
            System.out.print(num+" is divisible by 5");
        }
        else{
            System.out.print(num+" is not divisible by 5");
        }
    }
}
