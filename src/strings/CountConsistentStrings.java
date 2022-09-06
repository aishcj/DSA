/*
Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
 */
package strings;

public class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt=0;
        for(String s:words){
            boolean flag = false;
            for(int i=0; i<s.length(); i++){
                if(allowed.contains(String.valueOf(s.charAt(i)))){
                    flag = true;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag == true)
                cnt++;
        }
        return cnt;

    }
}
