/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if(head==null) return head;
        ListNode slow = head, fast = head;
        
        while(slow!=null && slow.next!=null && fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            break;
        }
        if(slow==null||slow.next==null||fast==null||fast.next==null)
        return null;
        
        fast = head;
        while(fast!=slow)
        {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}