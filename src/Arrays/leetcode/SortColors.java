// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]


package Arrays.leetcode;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        for (int i : nums) {
            System.out.print(i);
        }
        System.out.println();
        sortColors(nums);
        for (int i : nums) {
            System.out.print(i);
        }


    }
    public static void sortColors(int[] nums){
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(high > mid){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums,mid,high);
                high--;
            }
    
        }
    }
    public static void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums [y];
        nums [y] = temp;
    }
    
}
