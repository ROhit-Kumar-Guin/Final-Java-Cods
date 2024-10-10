package Arrays.twoDimentionalArray;

import java.util.Scanner;

public class transposeOfMatrix {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = scan.nextInt();
        System.out.print("Enter the number of columns : ");
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        int[][] ans = new int[n][m];
       
        System.out.print("Enter the first matrix : ");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.print("Transpose of the matrix : ");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                ans[i][j] = arr[j][i];
            }
        }
        System.out.println();
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
