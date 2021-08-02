public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(1, null, null);
        TreeNode node1 = new TreeNode(2, null, null);
        TreeNode node2 = new TreeNode(3, null, null);
        TreeNode node3 = new TreeNode(5, null, null);

        root.left = node1;
        root.right = node2;

        node1.right = node3;

        for(String path : solution.binaryTreePaths(root))
            System.out.println(path);
    }
}
