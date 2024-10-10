package Arrays;

public class swapArrayNormal {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=0 ; i<n/2 ; i++){
            int j = n-1-i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
