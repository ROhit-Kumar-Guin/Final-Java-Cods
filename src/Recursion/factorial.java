package Recursion;
import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n == 1) return 1;
        int ans = n*fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        scan.close();
        System.out.println("Factorial of "+num+ " is "+ fact(num));
    }
}
