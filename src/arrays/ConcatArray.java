/*
Concatenation of array

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]

 */

package arrays;

public class ConcatArray {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size*2];
        int mid = size;
        for(int i=0; i<size; i++){
            ans[i] = nums[i];
            ans[mid] = nums[i];
            mid++;
        }
        return ans;
    }
}
