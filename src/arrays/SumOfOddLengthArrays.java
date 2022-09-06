/*
Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

 */
package arrays;

public class SumOfOddLengthArrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int sum=0;
        for(int i=1; i<=len; i++){
            if(i%2==1){
                sum +=sumOfX(arr,i);
                // System.out.println(sum);
            }
        }
        return sum;
    }

    public int sumOfX(int[] arr, int x){
        int sum=0;
        for(int i=0;i<=arr.length-x; i++){
            if(x!=1){
                for(int j=i; j<i+x;j++){
                    sum+=arr[j];
                    //   System.out.println(sum);
                }

            }
            else{
                sum+=arr[i];
                //  System.out.println(sum);
            }


        }
        return sum;
    }
}
