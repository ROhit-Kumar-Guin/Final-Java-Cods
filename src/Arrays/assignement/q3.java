package Arrays.assignement;

import java.util.Scanner;

public class q3 {
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

        int current = arr[0];
        for(int i=0 ; i<n  ; i++){
            if(arr[i]<=current){
                current = arr[i];
            }
        }
        System.out.println(current);
    }
}
