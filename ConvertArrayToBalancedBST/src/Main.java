public class Main {
    public static void preOrder(TreeNode node) {
        if (node == null)
            return;

        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node = solution.sortedArrayToBST(new int[]{-10,-3,0,5,9});
        preOrder(node);
    }
}
