/*
Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
Output: 4
Explanation: There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)].
 */
package arrays;

public class CountGoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int cnt = 0;
        int len = arr.length;
        for(int i=0; i<len-2; i++){
            for(int j=i+1; j<len-1; j++){
                if( (Math.abs(arr[i] - arr[j]) <= a)){
                    for(int k=j+1; k<len;k++){

                        if( (Math.abs(arr[j] - arr[k]) <= b) &&
                                (Math.abs(arr[i] - arr[k]) <= c) )
                            cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
