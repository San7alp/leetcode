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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list=new ArrayList();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        list.add(root.val);
        while(!q.isEmpty()){
            TreeNode t=q.poll();
            if(t.left!=null){
                q.add(t.left);
                list.add(t.left.val);
            }
            if(t.right!=null){
                q.add(t.right);
                list.add(t.right.val);
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    
        
    }
}