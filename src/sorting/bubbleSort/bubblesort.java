package sorting.bubbleSort;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {1,23,2,45,67,33,23,45};
        int n = arr.length;
        print(arr);


        //......................................................
        //method 3
        for(int i=0 ; i<n-1 ; i++){
            
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
            boolean flag = true;
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                break;
            }
 
        }
        print(arr);



        //.......................................................
        //method 2
        // for(int i=0 ; i<n-1 ; i++){
        //     for(int j=0 ; j<n-i-1 ; j++){
        //         if(arr[j] > arr[j+1]){
        //             swap(arr,j,j+1);
        //         }
        //     }
 
        // }
        // print(arr);


        //.......................................................
        // //method 1
        // for(int i=0 ; i<n-1 ; i++){
        //     for(int j=0 ; j<n-1 ; j++){
        //         if(arr[j] > arr[j+1]){
        //             swap(arr,j,j+1);
        //         }
        //     }
 
        // }
        // print(arr);
        //..........................................................
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
