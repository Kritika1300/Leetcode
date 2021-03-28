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
   
    public boolean isValidBST(TreeNode root) {
         ArrayList<Integer> a = new ArrayList<>();
         ArrayList<Integer> res = helper(root,a);
         boolean ans = true;
            for(int i = 0; i < res.size()-1 ; i++){
                if(res.get(i) >= res.get(i+1)) {
                    ans = false;
                    break;
                }
            }
         if(ans) {return true;}
         else {return false; }
    }
    public ArrayList<Integer> helper(TreeNode root,ArrayList<Integer> a) {
        if(root == null) return a;
        helper(root.left,a);
        a.add(root.val);
        helper(root.right,a);
        return a;
    }
}