package Arrays.twoDimentionalArray;

import java.util.Scanner;

public class twoDimenMatrixInWaveForm {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int row = scan.nextInt();
        System.out.println("Enter no of columns : ");
        int col = scan.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the arr : ");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Previous arr : ");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // code
        System.out.println("New arr : ");
        for(int i=0 ; i<row ; i++){
            if(i%2 == 0){
                for(int j=0 ; j<col ;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }else{
                for(int j=col-1 ; j>=0 ; j--){
                    System.out.print(arr[i][j] + " ");
                } 
                System.out.println();
            }
        }

    }
}
