/*
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
 */
package linkedList;

public class ConvertBinNumInLLToInt {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int size=0;
        int num=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        for(int i=size-1; i>=0; i--){
            int base=1;
            int j=0;
            if(temp.val==1){
                while(j<i){
                    base*=2;
                    j++;
                }
            }
            else
                base=0;
            temp = temp.next;
            num+=base;
            // num = Math.pow(2,i); needs to be double
        }
        return num;
    }
}

//Time Complexity: O(1) + O(N) = O(N)
//Space Complexity: O(N)
