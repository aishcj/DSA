/*
Input: s = "l|*e*et|c**o|*de|"
Output: 2
Explanation: The considered characters are underlined: "l|*e*et|c**o|*de|".
The characters between the first and second '|' are excluded from the answer.
Also, the characters between the third and fourth '|' are excluded from the answer.
There are 2 asterisks considered. Therefore, we return 2.
 */
package strings;

public class CountAsterisks {
    public int countAsterisks(String s) {
        int v=0;
        int cnt = 0;
        for(char c:s.toCharArray()){
            if(v%2==0){
                if(c=='*')
                    cnt++;
                else if(c=='|')
                    v++;
                else
                    continue;
            }
            else if(c=='|')
                v++;
        }
        return cnt;
    }
}
