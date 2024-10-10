package sorting.bubbleSort;

public class SortArrayInDecreasingOrder {
    public static void main(String[] args) {
        int[] arr = {33,5,66,32,23,56,33,21,55};
        int n = arr.length;

        for(int i=0 ; i<n-1 ; i++){
            for(int j=n-1 ; j>i ; j--){
                if(arr[j]>arr[j-1]) swap(arr,j,j-1);
            }
        }
        print(arr);
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
