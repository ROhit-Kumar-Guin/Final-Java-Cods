package sorting.bubbleSort;

public class PushZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,3,-40,3,0,4,6,0};
        print(arr);
        int n = arr.length;
        int noz = 0;
        for(int ele : arr){
            if(ele == 0){
                noz++;
            }
        }
        for(int i=0 ; i<noz ; i++){
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[j] == 0){
                    swap(arr, j, j+1);
                }
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
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
