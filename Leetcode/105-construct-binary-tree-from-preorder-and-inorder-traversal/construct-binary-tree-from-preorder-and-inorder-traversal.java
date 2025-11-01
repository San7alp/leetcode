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
    int indx=0;
    public TreeNode solve(int[]pre,int[]in,int start,int end){
        if(start>end){
            return null;
        }
        int i=0;
        int val=pre[indx];
        for(;i<=end;i++){
            if(in[i]==val){
                break;
            }
        }
        indx++;
        TreeNode root=new TreeNode();
        root.val=val;
        root.left=solve(pre,in,start,i-1);
        root.right=solve(pre,in,i+1,end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return solve(preorder,inorder,0,inorder.length-1);
    }
}