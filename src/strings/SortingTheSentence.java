/*
Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
 */
package strings;

public class SortingTheSentence {
    public String sortSentence(String s) {
        String[] subs = s.split(" ");
        int len = subs.length;
        String[] out = new String[len];
        for(int i=0; i<len; i++){
            int val= Integer.parseInt(String.valueOf(subs[i].charAt(subs[i].length()-1)));
            out[val-1] = subs[i].substring(0,subs[i].length()-1) + " ";
        }
        s="";
        for(int j = 0; j<len; j++){
            s+=out[j] ;
        }

        return s.trim();
    }
}
