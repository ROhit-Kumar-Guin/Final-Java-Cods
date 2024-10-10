package Arrays;
import java.util.*;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        System.out.println(arr + " " + arr.size());
        arr.add(20);
        System.out.println(arr + " " + arr.size());
        arr.add(30);
        System.out.println(arr + " " + arr.size());
        arr.add(40);
        System.out.println(arr + " " + arr.size());

        arr.remove(2);
        System.out.println(arr + " " + arr.size());

    }
}
