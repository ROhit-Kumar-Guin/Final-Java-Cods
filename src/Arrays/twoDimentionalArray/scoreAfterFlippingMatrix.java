package Arrays.twoDimentionalArray;

import java.util.Scanner;

public class scoreAfterFlippingMatrix {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int n = scan.nextInt();
        System.out.print("Enter no of columns : ");
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the arr : ");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Previous arr : ");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //code

        for(int i=0 ; i<n ; i++){
            if(arr[i][0] == 0){
                for(int j=0 ; j<m ; j++){
                    if(arr[i][j] == 0) arr[i][j] = 1;
                    else arr[i][j] = 0;
                }
            }
        }

        for(int j=1 ; j<m ; j++){
            int zero = 0 , one = 0;
            for(int i=0 ; i<n ; i++){
                if(arr[i][j] == 0) zero++;
                else if(arr[i][j] == 1) one++;
            }
            if(zero>one){
                for(int k=0 ; k<n ; k++){
                    if(arr[k][j] == 0) arr[k][j] = 1;
                    else arr[k][j] = 0;
                }
            }
        }

        int score = 0;
        int x = 1; 
        for(int j=m-1 ; j>=0 ; j--){
            for(int i=0 ; i<n ; i++){
                score += (arr[i][j]*x);
            }
            x *= 2;
        }
        System.out.print("Score is = " + score);
    }
}

