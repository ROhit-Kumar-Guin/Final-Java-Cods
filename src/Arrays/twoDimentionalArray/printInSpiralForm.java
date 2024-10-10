package Arrays.twoDimentionalArray;

import java.util.Scanner;

public class printInSpiralForm {
   
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int n = scan.nextInt();
        System.out.println("Enter no of columns : ");
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

        int minR=0 , maxR = n-1 , minC = 0 , maxC=m-1;
        while(minR<=maxR && minC<=maxC){
            //left to right
            for(int j=minC ; j<=maxC ;j++){
                System.out.print(arr[minR][j]+" ");
            }
            minR++;

            if(minR>maxR || minC>maxC) break;

            //top to bottom 
            for(int i=minR ; i<=maxR ; i++){
                System.out.print(arr[i][maxC]+" ");
            }
            maxC--;

            if(minR>maxR || minC>maxC) break;

            //right to left
            for(int j=maxC ; j>=minC ;j--){
                System.out.print(arr[maxR][j]+" ");
            }
            maxR--;

            if(minR>maxR || minC>maxC) break;

            //bottom to top
            for(int i=maxR ; i>=minR ; i--){
                System.out.print(arr[i][minC]+" ");
            }
            minC++;
            
        }
    }
}
