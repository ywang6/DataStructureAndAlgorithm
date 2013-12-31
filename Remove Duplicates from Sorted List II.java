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
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
       // if(head== null) return null;
        ListNode dummy= new ListNode(0);
        ListNode prev= dummy;
        ListNode cur= head;
        dummy.next= head;
        if(cur==null) return null;
        while(cur!=null&&cur.next!= null){
            ListNode next= cur.next;
            if(cur.val==next.val){
                while(next!=null&& cur.val==next.val){
                    next= next.next;
                }
                prev.next=next;
            } 
            else{
                prev=cur;
            }
            cur=next;
            
        }
        return dummy.next;
    }
}
