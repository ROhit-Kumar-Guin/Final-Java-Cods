package sorting.selectionSort;

public class selectionSortButPuttingGreatestElementAtRightMostPosition {
    public static void main(String[] args) {
        int[] arr = {33,5,66,32,23,56,33,21,55};
        print(arr);
        int n = arr.length;


        for(int i=0 ; i<n-1 ; i++){
            int max = Integer.MIN_VALUE;
            int maxIdx = -1;
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[j]>max) {
                    max = arr[j];
                    maxIdx = j;
                }
            }

            //swap
            swap(arr,maxIdx,n-i-1);
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
