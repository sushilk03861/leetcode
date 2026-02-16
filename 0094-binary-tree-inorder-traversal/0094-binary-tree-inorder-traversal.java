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
      public  void Inoder(TreeNode Node , List<Integer>result){
            if(Node==null){return;}
            Inoder(Node.left,result);
            result.add(Node.val);
            Inoder(Node.right,result);
        }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>result = new ArrayList<>();
        Inoder(root,result);
        return result;
       
    }
}