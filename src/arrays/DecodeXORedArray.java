package arrays;

public class DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        int len = encoded.length;
        int[] res = new int[len+1];
        res[0] = first;
        for(int i=1; i<=len; i++){
            res[i] = res[i-1] ^ encoded [i-1];
        }
        return res;
    }
}
