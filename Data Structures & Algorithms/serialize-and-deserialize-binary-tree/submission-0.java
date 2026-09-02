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

public class Codec {

    StringBuilder s = new StringBuilder();

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        traverse(root);
        return s.toString();
        
    }
    void traverse(TreeNode root){
        if(root == null){
            s.append("#");
            return;
        }else{
            s.append(root.val).append(",");
        }

        traverse(root.left);
        s.append(",");
        traverse(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        // .split will trim the trailing commas
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));

        return helper(queue);
        
    }
    TreeNode helper(Queue<String> q){
        String s = q.poll();
        if(s.equals("#")){
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(s));
        node.left = helper(q);
        node.right = helper(q);
        return node;
    }
}
