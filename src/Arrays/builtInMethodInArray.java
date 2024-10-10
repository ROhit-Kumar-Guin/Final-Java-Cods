package Arrays;
import java.util.*;

public class builtInMethodInArray {
    public static void main(String[] args) {
        int[] arr = {13,23,6,6465,3};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        
    }
}
