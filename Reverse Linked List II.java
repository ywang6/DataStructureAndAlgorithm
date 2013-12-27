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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode pre = newHead;
        ListNode preM = pre;
        for(int i =1; i<=n; i++)
        {
            if(i==m)
            preM = pre;
            if(i>m&&i<=n)
            {
                pre.next = head.next;
                head.next = preM.next;
                preM.next = head;
                head = pre;
            }
            pre = head;
            head = head.next;
            
        }
        return newHead.next;
    }
}
