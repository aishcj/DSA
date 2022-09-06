/*
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

 */
package linkedList;

public class MidOfLinkedList {
    public ListNode middleNode(ListNode head) {
        int cnt=0;
        ListNode temp = head;
        if(temp==null)
            return null;
        while(temp!=null){
            temp= temp.next;
            cnt++;
        }
        for(int i=0; i<cnt/2; i++){
            head = head.next;
        }
        return head;
    }
}
