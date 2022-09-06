/*
Input: nums = [5,6,2,7,4]
Output: 34
Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
The product difference is (6 * 7) - (2 * 4) = 34.
 */
package arrays;

import java.util.Arrays;

public class MaxProductDiff {
    public int maxProductDifference(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        return (nums[len-1]*nums[len-2]) - (nums[0]*nums[1]);
    }
}
