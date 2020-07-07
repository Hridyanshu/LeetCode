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
    static int height(TreeNode root)
    {
        if(root == null) //tree is empty
            return 0;
        else
        {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return ((leftHeight>rightHeight) ? (leftHeight+1):(rightHeight+1));
        }
    }
    void levelElements(TreeNode node, int level, List<Integer> mylist)
    {
        if(node == null)
            return;
        if(level == 1)
        {
            mylist.add(node.val);
        }
        else
        {
            levelElements(node.left, level-1, mylist);
            levelElements(node.right, level-1, mylist);
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) { 
        List<List<Integer>> traversal = new LinkedList<List<Integer>>();
        int height = height(root);
        for(int i=height;i>=1;i--)
        {
            List<Integer> temp = new LinkedList<Integer>();
            levelElements(root, i, temp);
            traversal.add(temp);
        }
        return traversal;
    }
}
