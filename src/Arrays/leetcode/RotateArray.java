//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
 

package Arrays.leetcode;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        for (int i : nums) {
            System.out.print(i);
        }
        System.out.println();
        rotate(nums, k);
        for (int i : nums) {
            System.out.print(i);
        }
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int i = 0;
        int j = n-k-1;
        reverse(nums,i,j);
        int p = n-k;
        int q = n-1;
        reverse(nums,p,q);
        reverse(nums,i,q);
    }
    public static void reverse(int[] nums, int x , int y){
        while(x<=y){
            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;
            x++;
            y--;
        }
    }
}
