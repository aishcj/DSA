/*

  1 - 1 - 2
      |
     1 -2

Input: head = [1,1,2]
Output: [1,2]
 */
package linkedList;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        else if( head.next==null)
            return head;
        else if(head.next.next==null){
            if(head.val == head.next.val)
                return head.next;
            else
                return head;
        }

        ListNode slow = head;
        ListNode fast = slow.next.next;
        while(fast.next!=null && fast.next.next!=null){
            if(slow.val == fast.val){
                slow.next = fast.next;
                fast = fast.next.next;
            }
            else if(slow.val == slow.next.val){
                slow.next = fast;
                slow = fast;
                fast = fast.next.next;
            }
            else{
                slow = slow.next;
                fast = fast.next;
            }
        }

        while(slow!= null && slow.next!=null){
            if(slow.val == slow.next.val){
                slow.next = slow.next.next;
            }
            else
                slow = slow.next;
        }
        return head;
    }
}
