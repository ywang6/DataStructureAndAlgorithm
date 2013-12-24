/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    static ListNode head;
    public TreeNode sortedListToBST(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null) return null;
        ListNode curr=head;
        this.head = head;
        int size=1;
        while (null != (curr = curr.next)) size++;
        return deep(0, size-1);
    }
    public TreeNode deep( int start, int end){
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode leftTree = deep( start, mid - 1);
        TreeNode root = new TreeNode(head.val);
        root.left = leftTree;
        head = head.next;
        root.right = deep( mid + 1, end);
        return root;
    }
}
