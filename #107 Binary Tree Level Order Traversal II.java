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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>> res = new LinkedList<List<Integer>>();
        if(root == null) return res;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int count = q.size();
            LinkedList<Integer> tmp = new LinkedList<>();
            for(int i = 0; i < count; i++){
                TreeNode curr = q.poll();
                tmp.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
              res.add(tmp);
        }
        Collections.reverse(res);
        return res;
    }
}