package strings;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        char[] ans = new char[n];
        for(int i=0; i<n; i++){
            ans[indices[i]] = s.charAt(i);
        }
        return String.valueOf(ans);
    }
}
