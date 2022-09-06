/*
Final Value after Operations

Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.
 */


package arrays;

public class FinalValAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        int length = operations.length;
        for(int i=0;i<length;i++){
            if (operations[i].equals("++X") || operations[i].equals("X++") ){
                x+=1;
            }
            else if (operations[i].equals("--X") || operations[i].equals("X--")){
                x-=1;
            }
            else
                System.out.println("Wrong Operation!");
        }

        return x;

    }
}
