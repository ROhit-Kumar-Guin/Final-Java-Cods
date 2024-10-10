package Arrays.assignement;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++) {
            System.out.print("Enter the element of the array : ");
            arr[i] = scan.nextInt();
        }

        int prev = arr[0];
        int current = arr[0];
        for(int i=0 ; i<n  ; i++){
            if(arr[i]>=current){
                prev = current;
                current = arr[i];
            }
        }
        System.out.println(prev);
        System.out.println(current);
    }
}
