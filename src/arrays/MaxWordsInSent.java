/*
Maximum number of Words found in a Sentence.

Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation:
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.


 */


package arrays;

import java.util.Arrays;

public class MaxWordsInSent {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int[] len=new int[n];
        for(int i=0;i<n;i++){
            len[i] = sentences[i].split(" ").length;
        }
        return Arrays.stream(len).max().getAsInt();
    }
}
