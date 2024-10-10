package BinarySearch;

public class bs {
    public static void main(String[] args) {
        int[] arr = {22,34,56,78,90,112,334,54};
        int target = 59;
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        boolean flag = false;
        while(lo <= hi){
            int mid = ((lo+hi)/2);
            if(arr[mid] < target) lo = mid+1;
            else if(arr[mid] > target) hi = mid-1; 
            else if(arr[mid] == target) {
                flag = true ;
                break;
            }
        }
        System.out.println(flag);
    }
}
