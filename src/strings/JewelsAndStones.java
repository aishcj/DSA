package strings;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int l1=jewels.length();
        int l2=stones.length();
        int c = 0;
        for(int i=0; i<l1; i++){
            for(int j=0;j<l2;j++){
                if(stones.charAt(j) == jewels.charAt(i))
                    c++;
            }
        }
        return c;
    }
}
