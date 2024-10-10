package basics2;
import java.util.*;

public class terneryOperator {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println((n%2==0)?"Even":"Odd");
    }
}
