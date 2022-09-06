/*
Input: s = "Hello"
Output: "hello"
 */
package strings;

public class ToLowerCase {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        for(char c: s.toCharArray()){
            if((int)c >=65 && (int)c<=90){
                // int temp = c + (char)(32);
                ans.append((char)(c + (char)(32)));
            }
            else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
