/*
Input: nums = [1,2,2,1], k = 1
Output: 4
Explanation: The pairs with an absolute difference of 1 are:
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]
 */
package arrays;

public class CountPairsAbsoluteDiff {
    public int countKDifference(int[] nums, int k) {
        int len = nums.length;
        int cnt=0;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(Math.abs(nums[i]-nums[j]) ==k)
                    // if((nums[i]-nums[j])==k || (nums[i]-nums[j])==k*-1)
                    cnt++;
            }
        }
        return cnt;
    }
}
