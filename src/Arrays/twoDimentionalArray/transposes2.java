package Arrays.twoDimentionalArray;
import java.util.*;


public class transposes2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = scan.nextInt();
        System.out.print("Enter the number of columns : ");
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
       
        System.out.print("Enter the matrix : ");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(i<j){
                    swap(arr, i, j);
                }
            }
        }
        System.out.println();
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void swap(int[][] arr,int i,int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}
