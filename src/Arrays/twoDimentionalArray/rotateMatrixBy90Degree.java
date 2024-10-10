package Arrays.twoDimentionalArray;
import java.util.Scanner;

public class rotateMatrixBy90Degree {
    public static void main(String[] agrs){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the 3X3 matrix : ");
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Previous matrix : ");
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        //rotate code

        //transpose
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                if(i<j){
                    swap(arr,i,j);
                }
            }
        }
        System.out.println("Transpose of the matrix : ");
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        //rotate
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                if(j<1){
                    swap2(arr,i,j);
                }
            }
        }

        System.out.println("Current matrix : ");
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        

    }

    public static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    public static void swap2(int[][] arr, int i, int j) {
        int temp = arr[i][0];
        arr[i][0] = arr[i][2];
        arr[i][2] = temp;
    }
}