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
    // static int min = 0;
    // public int minDepth(TreeNode root) {
    //     // Note: The Solution object is instantiated only once and is reused by each test case.
    //     if(root==null) return 0;
    //     ArrayList<TreeNode> q = new ArrayList<TreeNode>();
    //     q.add(root);
    //     q.add(null);
    //     while(!q.isEmpty())
    //     {
    //         TreeNode cur = q.remove(0);
    //         if(cur==null)
    //         {
    //             min++;
    //             if(!q.isEmpty()) q.add(null);
    //         }
    //         else
    //         {
    //             if(cur.left==null && cur.right==null) return min+1;
    //             if(cur.left!=null) q.add(cur.left);
    //             if(cur.right!=null) q.add(cur.right);
    //         }
    //     }
    //     return min;
    // }
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(root.left==null) return right+1;
        if(root.right==null) return left+1;
        return Math.min(left,right)+1;
    }
}
