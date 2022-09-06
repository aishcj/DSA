/*
Shuffle the Array

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

 */

package arrays;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] ans = new int[len];
        int j=0;
        for(int i=0;i<n;i+=2){
            ans[i]=nums[j];
            ans[i+1]=nums[n];
            n++;
            j++;
        }
        return ans;
    }

}
