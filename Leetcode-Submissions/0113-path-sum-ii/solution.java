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
        List<List<Integer>> res = new ArrayList<>();
    private void findPaths(TreeNode node, int currSum, List<Integer> currPath, int targetSum){
        if(node == null){
            return;
        }
        currSum+=node.val;
        currPath.add(node.val);
        if(node.left==null && node.right==null){
            if(currSum==targetSum){
                res.add(new ArrayList<>(currPath));
            }
        }
        findPaths(node.left,currSum,currPath,targetSum);
        findPaths(node.right,currSum,currPath,targetSum);
        currPath.remove(currPath.size() - 1);

        

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        int currSum = 0;
        List<Integer> currPath = new ArrayList<>();
        findPaths(root,currSum,currPath,targetSum);
        return res;

    }
}
