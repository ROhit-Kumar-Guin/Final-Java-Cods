package Arrays.twoDimentionalArray.Revision2DArray;

public class PrintMatrixInWaveForm {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0 ; i<row ; i++){
            if(i%2 == 0){
                for(int j=0 ; j<col ; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            else {
                for(int j=col-1 ; j>=0 ; j--){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
