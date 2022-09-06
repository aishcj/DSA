/*
Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
The only good substring of length 3 is "xyz".
 */
package slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class SubStringWithDistinctChars {
    public int countGoodSubstrings(String s) {
        int i=0;
        int j=0;
        int size = s.length();
        int cnt = 0;
        List<Character> c = new ArrayList<>();
        while(j<size){
            char temp = s.charAt(j);
            c.add(temp);
            if(j-i+1 < 3)
                j++;
            else if(j-i+1 == 3){
                if(s.charAt(i)!=temp && s.charAt(i+1)!=temp && s.charAt(i)!=s.charAt(i+1))
                    cnt++;
                i++;
                j++;
            }
        }
        return cnt;
    }
}
