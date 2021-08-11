public class Main {
    public static void preorder(TreeNode root) {
        if(root == null)
            return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1, null, null);
        TreeNode node1 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node3 = new TreeNode(5, null, null);
        root1.left = node1;
        root1.right = node2;
        node1.left = node3;

        TreeNode root2 = new TreeNode(2, null, null);
        TreeNode node4 = new TreeNode(1, null, null);
        TreeNode node5 = new TreeNode(3, null, null);
        TreeNode node6 = new TreeNode(4, null, null);
        TreeNode node7 = new TreeNode(7, null, null);
        root2.left = node4;
        root2.right = node5;
        node4.right = node6;
        node5.right = node7;

        preorder(new Solution().mergeTrees(root1, root2));
    }
}
