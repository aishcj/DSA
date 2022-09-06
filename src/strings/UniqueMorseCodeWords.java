/*
For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

Input: words = ["gin","zen","gig","msg"]
Output: 2
Explanation: The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."
There are 2 different transformations: "--...-." and "--...--.".
 */
package strings;

import java.util.*;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character,String> morseCode = new HashMap<>();
        char alpha = 'a';
        int cnt=1;

        int i=0;

        for(String m: morse){
            morseCode.put(alpha++,m);
        }

        String[] ans= new String[words.length];
        for(String w: words){
            String temp="";
            for(char c: w.toCharArray()){
                temp+=(morseCode.get(c));
            }
            ans[i++]=temp;
        }
        System.out.println(Arrays.toString(ans));
        Set<String> uni = new HashSet<>();
        for(String w: ans)
            uni.add(w);
        return uni.size();


    }
}

//Time Complexity = N + NxM + N = O(N*M)
//Space Complexity = 26 + 26 + N + N = O(N)

