package Arrays.assignement;

import java.util.*;

public class q4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++) {
            System.out.print("Enter the element of the array : ");
            arr[i] = scan.nextInt();
        }



        ArrayList<Integer> ans = new ArrayList<>();
        int temp = Integer.MIN_VALUE;
        for(int i=0 ; i<n-1 ; i++){
            int count = 0 ;
            if(arr[i] == temp){
                continue;
            }
            for(int j=i+1 ; j<n ; j++){
                
                if(arr[i]==arr[j]){
                    count++;
                    arr[j] = temp;
                }
            }
            if(count>=1){
                ans.add(arr[i]);
            }
        }
        System.out.print(ans);
    }
    

        
        
}
