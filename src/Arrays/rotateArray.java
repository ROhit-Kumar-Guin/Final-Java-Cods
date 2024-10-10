package Arrays;

import java.util.*;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length , k;
        int[] ans = new int[n];
        System.out.println("Enter the number : ");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();

        
        int j = 0 ;
        int i = n-k ;
        while (i <= n-1 ) {
            ans[j] = arr[i] ;
            i++;
            j++;
        }
        
        int l=k;
        int m=0;
        while(m<n-k-1){
            ans[l] = arr[m];
            l++;
            m++;
        }
        System.out.print(ans);
    }
}


// package Arrays;

// import java.util.*;

// public class rotateArray {
//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40,50,60,70};
//         int n = arr.length , k;
//         ArrayList<Integer> ans = new ArrayList<>();
//         System.out.println("Enter the number : ");
//         @SuppressWarnings("resource")
//         Scanner scan = new Scanner(System.in);
//         k = scan.nextInt();
        
//         int i = n-k ;
//         while (i <= n-1 ) {
//             ans.add(arr[i]) ;
//             i++;
            
//         }
//         int j = 0 ;
//         while(j<n-k-1){
//             ans.add(arr[j]);
//             j++;
//         }
//         System.out.print(ans);
//     }
// }
