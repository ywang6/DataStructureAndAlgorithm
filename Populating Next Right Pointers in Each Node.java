/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
         if(root==null) return;
        if(root.right!=null&& root.next!=null && root.next.left!=null)
            root.right.next = root.next.left;
        if(root.left!=null)
            root.left.next = root.right;
        connect(root.left);
        connect(root.right);
    }
}
