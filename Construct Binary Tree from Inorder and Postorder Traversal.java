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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return buildTree(inorder, postorder, inorder.length-1, 0,inorder.length-1);
    }
    public TreeNode buildTree( int[] inorder, int[] postorder,int pIdx,  int start,int end){
        if(start>end) return null;
        TreeNode node = new TreeNode(postorder[pIdx]);
        int index = 0;
        while(index<=inorder.length && inorder[index]!=postorder[pIdx])
            ++index;
        node.left = buildTree(inorder, postorder, pIdx + index -1 -end, start, index -1);
        node.right = buildTree(inorder, postorder, pIdx -1, index+1, end); 
        return node;
    }
}
