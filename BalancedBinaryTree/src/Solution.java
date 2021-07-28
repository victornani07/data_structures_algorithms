public class Solution {
    private static class Height {
        int height;
    }

    private boolean isBalancedUTIL(TreeNode root, Height height) {
        if(root == null) {
            height.height = 0;
            return true;
        }

        Height lHeight = new Height(), rHeight = new Height();
        boolean isLeftBalanced = isBalancedUTIL(root.left, lHeight);
        boolean isRightBalanced = isBalancedUTIL(root.right, rHeight);

        height.height = Math.max(lHeight.height, rHeight.height) + 1;

        if(Math.abs(lHeight.height - rHeight.height) > 1)
            return false;

        return isLeftBalanced && isRightBalanced;
    }

    public boolean isBalanced(TreeNode root) {
        return isBalancedUTIL(root, new Height());
    }
}
