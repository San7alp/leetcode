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
    public TreeNode solve(int[] preorder, int[] inorder,int start,int end){
        if(start>end){
            return null;
        }
        int i=0;
        int rootval=preorder[indx];
        for(;i<end;i++){
            if(rootval==inorder[i]){
                break;
            }
        }
        indx++;
        TreeNode root=new TreeNode();
        root.val=rootval;
        root.left=solve(preorder,inorder,start,i-1);
        root.right=solve(preorder,inorder,i+1,end);
        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         indx=0;
         int n=inorder.length;
        return solve(preorder,inorder,0,n-1);
    }
}