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
    public TreeNode sortedArrayToBST(int[] num) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
       if(num.length==0)
       return null;
       
        // ArrayList<TreeNode> q = new ArrayList<TreeNode>();
        // TreeNode t = new TreeNode(num[0]);
        // q.add(t);
        // int i = 1;
        // while(!q.isEmpty())
        // {
        //     TreeNode cur = q.remove(0);
        //     if(i<num.length)
        //     {
        //         cur.left = new TreeNode(num[i]);
        //         i++;
        //         q.add(cur.left);
        //     }
        //     if(i<num.length)
        //     {
        //         cur.right = new TreeNode(num[i]);
        //         i++;
        //         q.add(cur.right);
        //     }
        //     if(i>=num.length)
        //     break;
        // }
        // return t;
        return build(num, 0, num.length-1);
    }
    public TreeNode build(int[] num, int start, int end)
    {
        if(start>end)
        return null;
        int mid = start + (end-start)/2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = build(num, start, mid-1);
        root.right = build(num, mid+1, end);
        return root;
    }
}
