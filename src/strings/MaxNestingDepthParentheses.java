/*
Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3
Explanation: Digit 8 is inside of 3 nested parentheses in the string.
 */
package strings;

public class MaxNestingDepthParentheses {
    public int maxDepth(String s) {
        int cnt=0;
        int max = 0;
        for(char c: s.toCharArray()){
            if(c=='(')
                cnt++;
            else if(c==')'){
                max = Math.max(max,cnt);
                cnt--;
            }
            else
                continue;
        }
        return max;
    }
}

//Time Complexity: O(N)
//Space Complexity: O(2) = O(1);

