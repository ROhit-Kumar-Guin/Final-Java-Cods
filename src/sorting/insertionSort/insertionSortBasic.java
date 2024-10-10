package sorting.insertionSort;

public class insertionSortBasic {
    public static void main(String[] args) {
        int[] arr = {33,5,66,32,23,56,33,21,55};
        print(arr);
        // int n = arr.length;

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
