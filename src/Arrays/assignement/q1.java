package Arrays.assignement;
import java.util.*;

public class q1 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++) {
            System.out.print("Enter the element of the array : ");
            arr[i] = scan.nextInt();
        }
        int prod = 1;
        for (int j : arr) {
            prod = prod*j;
        }
        System.out.println(prod);
    }
}
