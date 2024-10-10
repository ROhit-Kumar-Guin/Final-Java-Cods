package Arrays;

import java.util.Scanner;

public class greaterThenNumber {
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

        //Count the number of elements in given array greater 
        //than a given number x

        int count = 0;
        System.out.print("Enter the element to compare : ");
        int x = scan.nextInt();
        for(int i=0 ; i<n ; i++){
            if(arr[i] > x){
                count++;
            }
        }
        System.out.println("The number of element greater then x is: "+count);

    }
}
