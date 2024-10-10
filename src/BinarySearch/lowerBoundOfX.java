package BinarySearch;

public class lowerBoundOfX {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;

        int target = 40;
        int lowerBound = -1;
        int lo = 0;
        int hi = n-1;

        while(lo<=hi){
            int mid = lo+((hi-lo)/2);
            if(mid == target){
                lowerBound = mid;
            }
        }
        System.out.println(lowerBound);//just for removing warning...when rewrite this code remove this line
    }
}
