package Arrays.twoDimentionalArray.Revision2DArray;
import java.util.*;

public class StoreRollAndMarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[2][3];
        for(int i=0 ; i<=arr.length-1 ; i++){
            for(int j=0 ; j<=arr[0].length-1 ; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        for (int[] row : arr) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        scan.close();
        
    }
}
