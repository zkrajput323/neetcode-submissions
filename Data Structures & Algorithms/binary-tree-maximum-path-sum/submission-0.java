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
    // global variable 
    int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        traverse(root);
        return maxSum;
        
    }

    int traverse(TreeNode root){
        // base case
        if(root == null)
            return 0;

        int left = Math.max(0,traverse(root.left));
        int right = Math.max(0,traverse(root.right));

        // update the maxSum
        maxSum = Math.max(maxSum, left+right+root.val);
        return Math.max(left,right) + root.val;    
    }




}
