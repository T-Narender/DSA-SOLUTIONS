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
    public boolean isSameTree(TreeNode p, TreeNode q) {
     
        if(!Isidentical(p,q)){
            return false;
        }
        return true;
    }
    public static boolean Isidentical(TreeNode p , TreeNode q){
        if(p==null && q==null){
            return true;
        }
        else if(p == null || q == null || p.val!=q.val){
            return false;
        }
        if(!Isidentical(p.left,q.left)){
            return false;
        }
        if(!Isidentical(p.right,q.right)){
            return false;
        }
        return true;
    }
}
