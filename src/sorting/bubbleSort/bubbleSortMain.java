package sorting.bubbleSort;

public class bubbleSortMain {
    public static void main(String[] args) {
        int[] arr = {1,34,67,33,4465,33,213,223,3224,2313,456};
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=0 ; j<arr.length-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
            
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
