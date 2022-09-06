/*
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
 */
package strings;

public class CheckIfPanagram {
    public boolean checkIfPangram(String sentence) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<26; i++){
            if(sentence.contains(String.valueOf(alpha.charAt(i))))
                continue;
            else
                return false;
        }
        return true;
    }
}
