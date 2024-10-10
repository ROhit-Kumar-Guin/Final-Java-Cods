package Arrays;

import java.util.*;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {10,45,433,343,432};
        Arrays.sort(arr);
        int[] brr = arr;//shalow copy
        brr[0] = 100 ;
        System.out.println(arr[0]);
        //only added one more reference variable's name to the array

        int[] crr = Arrays.copyOf(arr,arr.length);
        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
        crr[0] = 200;
        System.out.println(arr[0]);
        System.out.println(crr[0]);
        for (int y : brr){
            System.out.print(y + " ");
        }
        System.out.println();
        for (int z : crr){
            System.out.print(z + " ");
        }
        System.out.println();
    }
}
