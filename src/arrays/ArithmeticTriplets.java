/*
Input: nums = [0,1,4,6,7,10], diff = 3
Output: 2
Explanation:
(1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
(2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.
 */

package arrays;

public class ArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        int len= nums.length;
        int count =0;
        for(int k=len-1; k>0; k--){
            for(int j=k-1; j>0;j--){
                for(int i=j-1; i>=0; i--){
                    if(nums[j]-nums[i] == diff && nums[k]-nums[j] == diff){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
