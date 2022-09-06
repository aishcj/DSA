/*
Input: blocks = "WBBWWBBWBW", k = 7
Output: 3
Explanation:
One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
so that blocks = "BBBBBBBWBW".
It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
Therefore, we return 3.
 */
package slidingWindow;

public class MinRecolorsToKConsecutiveBlackBlocks {
    public int minimumRecolors(String blocks, int k) {
        int i=0;
        int j=0;
        int w=0;
        int min = Integer.MAX_VALUE;
        while(j<blocks.length()){
            if(blocks.charAt(j) == 'W')
                w++;
            if(j-i+1 < k)
                j++;
            else if(j-i+1 == k){
                min = Math.min(min,w);
                if(blocks.charAt(i) == 'W'){
                    w--;
                }
                i++;
                j++;
            }
        }
        return min;
    }
}
