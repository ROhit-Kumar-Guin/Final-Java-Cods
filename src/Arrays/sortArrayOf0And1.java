package Arrays;

public class sortArrayOf0And1 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(j>i){
            if(arr[i] == 1 && arr[j] == 0){
                swap(arr,i,j);
            }
            else if(arr[i] == 1 && arr[j] == 1){
                j--;
            }
            else if(arr[i] == 0 && arr[j] == 0){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        for (int ele : arr) {
            System.out.print(ele);
        }
    }
    public static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
}
