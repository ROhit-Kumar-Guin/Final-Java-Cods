package Arrays;

import java.util.Scanner;

public class secondHighestElement {
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

        //finding the  second highest

        int highest = arr[0];
        int secHighest = arr[0];
        for(int i=0 ; i<n-1 ; i++){
            if(arr[i] < arr[i+1]){
                highest = arr[i+1];
                secHighest = arr[i];
            }
        }
        System.out.println("The highest element is : "+highest);
        System.out.println("The second highest element is : "+secHighest);
    }
}
