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
    int counter = 0;
    Integer answer = null;
    public int kthSmallest(TreeNode root, int k) {
        
        inOrder(root,k);

        return answer;
       
    }
    void inOrder(TreeNode root, int k){
      
        if(root == null || answer != null){
            return;
        }

        inOrder(root.left,k);
        counter++;
        if(counter == k){
            answer = root.val;
            return;
        }
        inOrder(root.right, k);
        // counter++;
        // if(counter==k){
        //     answer = root.val
        // }

    }
    
}
