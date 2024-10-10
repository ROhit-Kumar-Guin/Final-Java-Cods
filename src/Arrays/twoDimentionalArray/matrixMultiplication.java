package Arrays.twoDimentionalArray;

import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of rows of 1st matrix: ");
        int m = scan.nextInt();
        System.out.println("Enter no of columns of 1st matrix: ");
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Enter the arr : ");
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                a[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter no of rows of 2nd matrix: ");
        int p = scan.nextInt();
        System.out.println("Enter no of columns of 2nd matrix: ");
        int q = scan.nextInt();
        int[][] b = new int[p][q];
        System.out.println("Enter the arr : ");
        for(int i=0 ; i<p ; i++){
            for(int j=0 ; j<q ; j++){
                b[i][j] = scan.nextInt();
            }
        }

        System.out.println("1st arr : ");
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("2nd arr : ");
        for(int i=0 ; i<p ; i++){
            for(int j=0 ; j<q ; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        
        //code

        
        if(a[0].length != b.length){
            System.out.print("Multiplication not possible");
        }
        else{
            int[][] c = new int[a.length][b[0].length];
            for(int i=0 ; i<c.length ; i++){
                for(int j=0 ; j<c[0].length ; j++){
                    for(int k=0 ; k<b.length ; k++){
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(c[i][j] + " " + "|");
                }
                System.out.println();
            }
            // res
            // System.out.println("Res arr : ");
            // for(int i=0 ; i<a.length ; i++){
            //     for(int j=0 ; j<b[0].length ; j++){
            //         System.out.print(c[i][j] + " ");
            //     }
            //     System.out.println();
            // }
        }
    }
}
