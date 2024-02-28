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
    public int findBottomLeftValue(TreeNode root) {
        var que=new ArrayDeque<TreeNode>();
        TreeNode node=root;
        que.offer(node);
        while(!que.isEmpty()){
            node=que.poll();
            if(node.right!=null)que.offer(node.right);
            if(node.left!=null)que.offer(node.left);
        }
        return node.val;
    }
    
}