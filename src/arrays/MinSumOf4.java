package arrays;

import java.util.Arrays;

public class MinSumOf4 {
        public int minimumSum(int num) {
            int[] val = new int[4];
            for(int i=0; i<4; i++){
                val[i] = num%10;
                num=num/10;
            }
            Arrays.sort(val);
            val[0]=(val[0]*10) +val[2];
            val[1]= (val[1]*10) + val[3];
            return val[0]+val[1];
        }
    }

