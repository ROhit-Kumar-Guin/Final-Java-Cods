package Arrays.twoDimentionalArray.Revision2DArray;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] transpose = new int[3][3];
        for(int i=0 ; i<arr1.length ; i++){
            for(int j=0 ; j<arr1[0].length ; j++){
                transpose[j][i] = arr1[i][j];
            }
        }
        for (int[] row : transpose) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }


        //m2 without using extra array
        int[][] arr2 = {{10,20,30},{40,50,60},{70,80,90}};


        for (int[] row : arr2) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();


        for(int i=0 ; i<arr2.length ; i++){
            for(int j=0 ; j<arr2[0].length ; j++){
                if(i<j){
                    swap(arr2,i,j);
                }
            }
        }

        for (int[] row : arr2) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    public static void swap(int[][] arr2,int i ,int j){
        int temp = arr2[i][j];
        arr2[i][j] = arr2[j][i];
        arr2[j][i] = temp;
    }
}
