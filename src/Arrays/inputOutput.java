package Arrays;
import java.util.*;

public class inputOutput {
    public static void main(String[] args) {
        int[] arr = new int[5];
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        for(int i=0 ; i<5 ; i++){
            System.out.printf("Enter %d element : ",i);
            arr[i] = scan.nextInt();
        }
        for(int i=0 ; i<5 ; i++){
            System.out.println(arr[i]);
        }
    }
}
