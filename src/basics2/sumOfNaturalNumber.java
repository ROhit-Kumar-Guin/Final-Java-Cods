package basics2;
import java.util.*;

public class sumOfNaturalNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int sum=0;
        for(int i=0 ; i<=num ; i++){
            sum+=i;
        }
        System.out.print(sum);
    }
}
