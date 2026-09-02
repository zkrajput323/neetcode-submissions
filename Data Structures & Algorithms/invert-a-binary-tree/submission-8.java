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
    public TreeNode invertTree(TreeNode root) {
        if(root == null ){
            return root;
        }
        System.out.print("Printing root: "+root.val);


        TreeNode tempNode = null;

        invertTree(root.left);
        invertTree(root.right);
      //  if(root.left != null){
         tempNode = root.left;
       // }
       // if(root.left != null){
            root.left = root.right;
       // }
       // if(root.right != null){
            root.right = tempNode;
       // }

        

        return root;
        
        
    }
}
