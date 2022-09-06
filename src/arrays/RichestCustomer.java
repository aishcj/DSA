/*
Richest Customer Wealth

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.

 */

package arrays;

import java.util.Arrays;

public class RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int len = accounts[0].length;
        int[] wealth= new int[n];
        for(int i=0; i<n; i++){
            for(int j=0;j<len;j++){
                wealth[i]+=accounts[i][j];
            }
        }
        return Arrays.stream(wealth).max().getAsInt();
    }
}
