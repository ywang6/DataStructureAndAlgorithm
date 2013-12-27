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
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(0);
        ListNode current=head, firstT = first, secondT = second;
        while(current !=null){
            if(current.val<x){
                firstT.next = current;
                firstT = firstT.next;
            }
            else{
                secondT.next = current;
                secondT = secondT.next;
            }
            current = current.next;
            firstT.next = null;
            secondT.next = null;
        }
        firstT.next = second.next;
        return first.next;
    }
}
