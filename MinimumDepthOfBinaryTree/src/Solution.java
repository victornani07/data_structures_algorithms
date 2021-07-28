public class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;

        if(root.left == null && root.right == null)
            return 1;

        if(root.right == null)
            return minDepth(root.left) + 1;

        if(root.left == null)
            return minDepth(root.right) + 1;

        return Math.min(minDepth(root.right), minDepth(root.left)) + 1;
    }
}
