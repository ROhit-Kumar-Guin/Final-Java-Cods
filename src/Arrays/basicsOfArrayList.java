package Arrays;
import java.util.*;

public class basicsOfArrayList {
    public static void main(String[] args) {
        //Normal array
        //int[] arr = new int[6];
        //Array list
        //by default arrays ki value 0 hoti hai pr array  list ki nai
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(0, 10);
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);
        

        System.out.println(arr);
        System.out.println(arr.size());
        // System.out.println(arr.get(2));

        //to change the value
        arr.set(2, 100);
        arr.set(3, null);
        System.out.println(arr);

        arr.add(90);
        System.out.println(arr);
        System.out.println(arr.size());

        //for(int i=0 ; i<arr.size() ; i++){            arrays ke liye length operator or arraylist ke liye size()
        
        //  System.out.println(arr.get(i));
        //}
    }
}
