//PROBLEM 48
//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

//You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[7,4,1],[8,5,2],[9,6,3]]

 

package Arrays.leetcode;

public class RotateArrayBy90Degree {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for (int[] row : matrix) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][] matrix) {
        transpose(matrix);
        //reverse each row
        for(int i=0 ; i<matrix.length ;i++){
            int top=0;
            int bottom = matrix[0].length-1;
            while(top<bottom){
                int temp = matrix[i][top];
                matrix[i][top] = matrix[i][bottom];
                matrix[i][bottom] = temp;
                top ++;
                bottom --;
            }
        }
    }
    public static void transpose(int[][] matrix) {
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(i<j){
                    swap(matrix,i,j);
                }
            }
        }
    }
    public static void swap(int[][] matrix ,int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
