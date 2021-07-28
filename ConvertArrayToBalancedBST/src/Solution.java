public class Solution {
    private TreeNode insert(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        if (key < root.val)
            root.left = insert(root.left, key);
        else if (key > root.val)
            root.right = insert(root.right, key);

        return root;
    }

    public TreeNode sortedArrayToBSTUTIL(int[] nums, int start, int end) {
        if(start > end)
            return null;

        int mid = (start + end) / 2;
        int key = nums[mid];
        TreeNode node = new TreeNode(key);
        node.left = sortedArrayToBSTUTIL(nums, start, mid - 1);
        node.right = sortedArrayToBSTUTIL(nums, mid + 1, end);

        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTUTIL(nums, 0, nums.length - 1);
    }
}
