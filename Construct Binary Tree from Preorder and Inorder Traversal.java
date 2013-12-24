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
     public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return buildTree(preorder, inorder, 0,0, inorder.length);
    }
    public TreeNode buildTree(int[] preorder, int[] inorder, int pIdx, int start, int end) {
        if(start >=end)
            return null;
        TreeNode node = new TreeNode(preorder[pIdx]);
        int inIndex=0;
        while(inIndex <= end && inorder[inIndex] != preorder[pIdx]) ++inIndex;
        node.left = buildTree(preorder, inorder, pIdx+1, start, inIndex);
        node.right = buildTree(preorder, inorder, pIdx + inIndex +1 - start, inIndex+1, end);
        return node;
    }
}
