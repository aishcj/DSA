/*
Input: num = 240, k = 2
Output: 2
Explanation: The following are the substrings of num of length k:
- "24" from "240": 24 is a divisor of 240.
- "40" from "240": 40 is a divisor of 240.
Therefore, the k-beauty is 2.
 */
package slidingWindow;

public class KBeautyOfNum {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int cnt =0;
        int i=0;
        int j=0;
        while(j<s.length()){
            if(j-i+1 <k)
                j++;
            else if(j-i+1 == k){
                String sub = s.substring(i,i+k);
                int n = Integer.parseInt(sub);
                if(n!=0 && num%n == 0){
                    cnt++;
                }
                i++;
                j++;
            }

        }
        return cnt;
    }
}
