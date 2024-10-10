package Arrays.twoDimentionalArray;


public class maxInTwoDArray {
    public static void main(String[] args) {
        
       
        int[][] arr = {{1,2,3},{4,5,6}};
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0 ; i<arr.length ; i++){
            for (int j=0 ; j<arr[0].length ; j++){
                sum+=arr[i][j];
                // if (arr[i][j] > max) {
                //     max = arr[i][j];
                // }
                max = Math.max(max, arr[i][j]);
            }
        }
        System.out.println(max);
        System.out.println(sum);
    }
}
