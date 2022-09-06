/*
Running Sum

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

 */
package arrays;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] rSum = new int[len];
        rSum[0] = nums[0];
        for(int i=1; i<len; i++){
            rSum[i] = nums[i] + rSum[i-1];
        }
        return rSum;
    }
}
