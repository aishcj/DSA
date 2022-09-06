/*
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

 */

package strings;

public class BalancedStrings {
    public int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int c = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'R')
                r++;
            else
                l++;
            if(r==l)
                c++;

        }
        return c;
    }
}
