package Arrays;
import java.util.*;

public class maxInArray {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the size of the array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            System.out.printf("Enter the %dth element : ",i+1);
            arr[i] = scan.nextInt();
        }


        //finding max
        int max = arr[0];
        for(int i=0 ; i<n-1 ; i++){
            if(arr[i] < arr[i+1]){
                max = arr[i+1];
            }
        }
        System.out.println("max value is : "+max);

        // int min2 = Integer.MIN_VALUE;
        // System.out.println(min2);
    }
}
