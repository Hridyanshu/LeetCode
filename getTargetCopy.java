/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    //queue is used for BFS
    Queue<TreeNode> queue = new LinkedList<>();
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned.val == target.val)
            return cloned;
        if(cloned.left != null) {
            queue.add(cloned.left);
        }
        if(cloned.right != null) {
            queue.add(cloned.right);
        }
        return getTargetCopy(original, queue.remove(), target);
    }
}
