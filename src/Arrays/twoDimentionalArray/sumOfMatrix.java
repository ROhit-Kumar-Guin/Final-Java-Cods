package Arrays.twoDimentionalArray;
import java.util.Scanner;

public class sumOfMatrix {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = scan.nextInt();
        System.out.print("Enter the number of columns : ");
        int m = scan.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
       
        System.out.print("Enter the first matrix : ");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                arr1[i][j] = scan.nextInt();
            }
        }
        System.out.print("Enter the second matrix : ");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                arr2[i][j] = scan.nextInt();
            }
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        System.out.println();
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
