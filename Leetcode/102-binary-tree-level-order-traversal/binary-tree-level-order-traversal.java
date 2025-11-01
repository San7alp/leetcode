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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null){
            q.add(root);
        }
        else{
            return res;
        }
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode r=q.poll();
                
                list.add(r.val);
                if(r.left!=null){
                    q.add(r.left);
                }
                if(r.right!=null){
                    q.add(r.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}