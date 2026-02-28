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
    TreeNode first;
    TreeNode middle;
    TreeNode prev;
    TreeNode last;
    public void recoverTree(TreeNode root) {
       helper(root);
       if(first!=null && last!=null){
        int t = first.val;
        first.val = last.val;
        last.val = t;
       }
       else if(first!=null && middle!=null){
        int t = first.val;
        first.val = middle.val;
        middle.val = t;
       }
    }
    void helper(TreeNode node){
        if(node == null) return;
        
        helper(node.left); 

        if(prev!=null && prev.val > node.val){
            if(first == null){
                first = prev;
                middle = node;
            }
            else{
                last = node;
            }
        }
        prev = node;

        helper(node.right);
    }
}
