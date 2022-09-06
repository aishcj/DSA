/*
Input: n = 5, start = 0
Output: 8
Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
Where "^" corresponds to bitwise XOR operator.
 */
package arrays;

public class XORoprInArray {
    public int xorOperation(int n, int start) {
        //  int[] nums = new int[n];
        // nums[0] = start + 2 * 0;
        int ans= start;
        for(int i=1; i<n; i++){

            ans ^= (start + 2 *i);
        }
        return ans;
    }
}
