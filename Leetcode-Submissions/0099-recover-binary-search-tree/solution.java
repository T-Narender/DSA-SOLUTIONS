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
    TreeNode first = null;
    TreeNode middle = null;
    TreeNode last = null;
    TreeNode prev = null;
    public void recoverTree(TreeNode root) {
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left==null){
                checkInversion(curr);
                curr=curr.right;
            }
            else{
                //Find the in-order predecessor
                TreeNode predecessor = curr.left;
                while (predecessor.right != null && predecessor.right != curr) {
                    predecessor = predecessor.right;
                }
                if(predecessor.right==null){
                    predecessor.right=curr;
                    curr=curr.left;
                }
                else {
                    // Thread already exists; break it to restore tree structure
                    predecessor.right = null;
                    
                    checkInversion(curr);
                    curr = curr.right;
                }
            }

        }
        if (first != null && last != null) {
            int t = first.val;
            first.val = last.val;
            last.val = t;
        } else if (first != null && middle != null) {
            int t = first.val;
            first.val = middle.val;
            middle.val = t;
        }
        
    }
    private void checkInversion(TreeNode node) {
        if (prev != null && prev.val > node.val) {
            if (first == null) {
                first = prev;
                middle = node;
            } else {
                last = node;
            }
        }
        prev = node;
    }
}
