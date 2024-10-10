package Arrays;
import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to be searched : ");
        int num = scan.nextInt();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean flag = false ;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == num){
                flag = true;
                break;
            }
            else{
                flag = false;
            }
        }
        if(flag == true){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
