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
        ArrayList<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null){
            q.add(root);
        }
        else{
            return list;
        }
        while(!q.isEmpty()){
            List<Integer> list1=new ArrayList();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode t=q.poll();
                int val=t.val;
                list1.add(val);
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);
                }
            }
            list.add(list1);

        }
        return list;

    }
}