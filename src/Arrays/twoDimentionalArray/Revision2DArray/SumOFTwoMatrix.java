package Arrays.twoDimentionalArray.Revision2DArray;

//|1 2 3|   |1 2 3|    
//|4 5 6| + |4 5 6| + ?
//|7 8 9|   |7 8 9|

public class SumOFTwoMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = new int[arr1.length][arr1[0].length];

        for(int i=0 ; i<arr1.length ; i++){
            for(int j=0 ; j<arr1[0].length ; j++){
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int[] row : ans) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }
}
