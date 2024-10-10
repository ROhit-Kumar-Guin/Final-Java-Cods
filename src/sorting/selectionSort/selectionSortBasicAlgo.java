package sorting.selectionSort;

public class selectionSortBasicAlgo {
    
    public static void main(String[] args) {
        int[] arr = {33,5,66,32,23,56,33,21,55};
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=i ; j<n ; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }
            //swap
            swap(arr, i, mindx);
            
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
