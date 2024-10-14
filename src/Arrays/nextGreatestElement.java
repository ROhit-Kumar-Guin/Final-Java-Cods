package Arrays;

public class nextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {11,23,54,67,84,12,34,5,78,12,34,54};
        int n = arr.length;
        int[] ans = new int[n];
        int i=0 , j=0 ;
        while(i<=n-1){
            int nextGreatestElement = 0;
            for(int k=i+1 ; k<=n-1 ; k++){
                nextGreatestElement = Math.max(nextGreatestElement, arr[k]);
            }
            ans[j] = nextGreatestElement;
            i++;
            j++;
            if (i==n) {
                ans[n-1] = -1;
            }
        }
        for (int ele : ans) {
            System.out.print(ele + " ");
        }











































        // int n = arr.length;
        // int[] ans = new int[n];
        // int i=0 , j=0;
        // while (i<n) {
        //     int greatest=0;
        //     for(int k=i+1 ; k<n ; k++){
        //         if (arr[k]>greatest) {
        //             greatest = arr[k];
        //         }
        //     }
        //     ans[j] = greatest;
        //     j++;
        //     i++;
        //     if (i==n) {
        //         ans[n-1] = -1;
        //     }
        // }
        
        // for (int ele : ans) {
        //     System.out.print(ele+" ");
        // }
    }
}
