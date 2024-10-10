package Arrays;

public class swapArrayUsingTwoPointers {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        int i = 0;
        int j = n-1;
        // int i = start index , int j = end index (part of array reverse)
        while (j>i) {
            swap(arr,i,j);
            i++;
            j--;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr , int x , int y){
        int temp = arr[x] ;
        arr[x] = arr[y] ;
        arr[y] = temp ;
    }
}
