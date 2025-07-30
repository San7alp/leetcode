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
    int index;
    public TreeNode buildAlgo(int[] inorder, int[] postorder,int start,int end){
        if(start>end){
            return null;
        }
        int rootval=postorder[index];
        index--;
        int i=0;
        while(rootval!=inorder[i]){
            i++;
        }
        TreeNode root=new TreeNode();
        root.val=rootval;
        root.right=buildAlgo(inorder,postorder,i+1,end);
        root.left=buildAlgo(inorder,postorder,start,i-1);
        return root;


    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index=inorder.length-1;
        return buildAlgo(inorder,postorder,0,inorder.length-1);
    }
}