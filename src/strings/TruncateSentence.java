/*
Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".

 */
package strings;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<k-1; i++){
            sb.append(str[i]+ " ");
        }
        sb.append(str[k-1]); //to remove trim();

        return sb.toString();

    }
}
