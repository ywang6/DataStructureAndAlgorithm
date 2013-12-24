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
        if(root.left!=null)
        {
            root.left.next = root.right != null?root.right : getNext(root);
        }
        if(root.right!=null)
        {
            root.right.next = getNext(root);
        }
        connect(root.right);// order is really important.
        connect(root.left);
    }
    public TreeLinkNode getNext(TreeLinkNode root)
    {
        TreeLinkNode cur = root;
        while(cur.next!=null)
        {
            cur = cur.next;
            if(cur.left!=null) return cur.left;
            if(cur.right!=null) return cur.right;
        }
        return null;
    }
}
