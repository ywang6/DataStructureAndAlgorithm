/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
       ListNode curr=head;
        if(curr==null) return null;
        while(curr!=null && curr.next!=null){
            ListNode next = curr.next;
            if(curr.next.val == curr.val){
                curr.next = curr.next.next;
                continue;
            }
            curr = next;
        }
        return head;
    }
}
