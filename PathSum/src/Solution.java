public class Solution {
    private boolean hasPathSumUTIL(TreeNode root, int sumSoFar, int targetSum) {
        if(root == null)
            return false;

        sumSoFar += root.val;

        if(root.left == null && root.right == null)
            return targetSum == sumSoFar;

        boolean hasLeftSum = hasPathSumUTIL(root.left, sumSoFar, targetSum);
        boolean hasRightSum = hasPathSumUTIL(root.right, sumSoFar, targetSum);

        return hasLeftSum || hasRightSum;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumUTIL(root, 0, targetSum);
    }
}
