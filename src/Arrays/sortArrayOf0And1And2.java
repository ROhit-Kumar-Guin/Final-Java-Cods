package Arrays;

public class sortArrayOf0And1And2 {
    public static void main(String[] args) {
        //sort colors
        int[] nums = {1,1,2,2,1,1,2,2,0,0,0,0,2};
                //Dutch Flag Method
                int n = nums.length;
                int mid = 0 , hi = n-1 , lo = 0;
                while(mid<=hi){
                    if(nums[mid] == 0){
                        int temp = nums[lo];
                        nums[lo] = nums[mid];
                        nums[mid] = temp;
                        lo++;
                        mid++;
                    }
                    else if(nums[mid] == 1){
                        mid++;
                    }
                    else if(nums[mid] == 2){
                        int temp = nums[hi];
                        nums[hi] = nums[mid];
                        nums[mid] = temp;  
                        hi--;              
                    }
        
                }
                for (int ele : nums) {
                    System.out.print(ele);
                }
                
        
        
        
                // int n = nums.length;
                // int noOfZeroes=0 ;
                // int noOfOnes=0 ;
                // for (int i=0 ; i<n ; i++){
                //     if(nums[i] == 0) noOfZeroes++;
                //     if(nums[i] == 1) noOfOnes++;
                // }
                // for (int i=0 ; i<n ; i++){
                //     if(i < noOfZeroes){
                //         nums[i] = 0;
                //     }
                //     else if(i >= noOfZeroes && i<noOfZeroes+noOfOnes){
                //         nums[i] = 1;
                //     }
                //     else{
                //         nums[i] = 2;
                //     }
                // }
    }
}
