/*
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
 */
package arrays;

public class ArrayStringsEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = " ";
        String str2 =" ";
        for (String s: word1){
            str1+=s;
        }
        for (String s: word2){
            str2+=s;
        }
        if(str1.equals(str2)){
            return true;
        }

        else
            return false;
    }
}
