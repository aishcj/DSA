/*
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
 */
package linkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode temp2 = head;
        if(head==null)
            return null;
        while(head.next!=null){
            temp =head.next;
            head.next=head.next.next;
            temp.next = temp2;
            temp2 =temp;
        }
        return temp2;

    }
}
