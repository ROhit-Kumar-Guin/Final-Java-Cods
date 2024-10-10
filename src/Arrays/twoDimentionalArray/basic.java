package Arrays.twoDimentionalArray;
import java.util.*;

public class basic {
    
    public static void main(String[] args){
        int[][] arr = new int[2][3];
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        //for taking input
        int [][] arr2 = {{1,2,3},{4,5,6}}; //another way of initialising
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<3 ; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        //for taking output
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //another way of printing
        for (int[] ele : arr2) {
            for (int x : ele) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
