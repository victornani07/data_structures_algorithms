public class Solution {
    private int sumUTIL(TreeNode root, boolean isLeft) {
        if(root == null)
            return 0;

        if(root.left == null && root.right == null)
            if(isLeft)
                return root.val;

        return sumUTIL(root.left, true) + sumUTIL(root.right, false);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return sumUTIL(root, false);
    }
}
