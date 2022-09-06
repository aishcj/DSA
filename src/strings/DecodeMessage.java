/*
  t h e q u i c k b r o w n f x j m p s v l a z y d g
  a b c d e f g h i j k l m n o p q r s t u v w x y z


Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
Output: "this is a secret"
Explanation: The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".
 */
package strings;

import java.util.HashMap;

public class DecodeMessage {
    public String decodeMessage(String key, String message) {
        StringBuilder ans = new StringBuilder();
        HashMap<Character, Character> map = new HashMap<>();
        key = key.replaceAll(" ", "");
        char original = 'a';
        for(int i = 0; i<key.length();i++){
            if(!map.containsKey(key.charAt(i))){
                map.put((key.charAt(i)),original++);
            }
        }

        for(int i=0; i<message.length();i++){
            if(map.containsKey(message.charAt(i))){
                ans.append(map.get(message.charAt(i)));
            }
            else
                ans.append(message.charAt(i));
        }

        return ans.toString();
    }
}
