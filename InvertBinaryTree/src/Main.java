public class Main {
    public static void preorder(TreeNode root) {
        if(root == null)
            return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, null, null);
        TreeNode node1 = new TreeNode(2, null, null);
        TreeNode node2 = new TreeNode(7, null, null);
        TreeNode node3 = new TreeNode(1, null, null);
        TreeNode node4 = new TreeNode(3, null, null);
        TreeNode node5 = new TreeNode(6, null, null);
        TreeNode node6 = new TreeNode(9, null, null);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        Solution solution = new Solution();
        preorder(solution.invertTree(root));

    }
}
