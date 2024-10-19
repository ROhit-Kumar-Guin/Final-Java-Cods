//Given an m x n matrix, return all elements of the matrix in spiral order.
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]
package Arrays.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        List<Integer> answer = new ArrayList<>(9);
        answer = spiralOrder(arr);
        for(int i=0 ; i<9 ; i++){
            System.out.print(answer.get(i) + " ");
        }
    }



    
    public static List<Integer> spiralOrder(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        List<Integer> ans = new ArrayList<>();
        int minR = 0, minC = 0, maxR = n - 1, maxC = m - 1;
        while (minR <= maxR || minC <= maxC) {
            // left to right
            for (int j = minC; j <= maxC; j++) {
                ans.add(arr[minR][j]);
            }
            minR++;
            if (minR > maxR || minC > maxC)
                break;
            // top to bottom
            for (int i = minR; i <= maxR; i++) {
                ans.add(arr[i][maxC]);
            }
            maxC--;
            if (minR > maxR || minC > maxC)
                break;
            // right to left
            for (int j = maxC; j >= minC; j--) {
                ans.add(arr[maxR][j]);
            }
            maxR--;
            if (minR > maxR || minC > maxC)
                break;
            // bottom to top
            for (int i = maxR; i >= minR; i--) {
                ans.add(arr[i][minC]);
            }
            minC++;
        }
        return ans;
    }
}
