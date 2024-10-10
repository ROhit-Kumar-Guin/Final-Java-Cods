package Arrays.twoDimentionalArray;

import java.util.Scanner;

public class rotatearrBy90DegreeOfAnyNxNarr {
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

        //transpose

        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                if(i<j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        //rotate
        for(int i=0 ; i<row ; i++){
            int top = 0;
            int bottom = col-1;
            while(top<bottom){
                int temp = arr[i][top];
                arr[i][top] = arr[i][bottom];
                arr[i][bottom] = temp;
                top++;
                bottom--;
            }
        }
        System.out.println("Final arr : ");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
