//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//You can return the answer in any order.

package Arrays.leetcode;



public class TwoSumsProblem {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums,target);
        for (int ele : ans) {
            System.out.println(ele);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i=0 ; i<nums.length ; i++) {
            boolean flag = false ;
            for (int j=i+1 ; j<nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    flag = true ;
                    break;
                }
                if(flag == true) break;
            }
        }
        return arr;
    }
}
