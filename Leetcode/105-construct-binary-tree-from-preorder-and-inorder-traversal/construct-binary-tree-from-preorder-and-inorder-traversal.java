/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int index=0;
    public TreeNode buildAlgo(int[] preorder, int[] inorder,int start,int end){
        if(start>end){
            return null;
        }
        int rootval=preorder[index];
        int i=0;
        while(rootval!=inorder[i]){
            i++;
        }
        index++;
        TreeNode root=new TreeNode();
        root.val=rootval;
        root.left=buildAlgo( preorder,  inorder, start,i-1);
        root.right=buildAlgo( preorder,  inorder, i+1,end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildAlgo(preorder,inorder,0,inorder.length-1);
    }
}