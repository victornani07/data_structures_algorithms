public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(1, null, null);
        TreeNode node1 = new TreeNode(2, null, null);
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node4 = new TreeNode(3, null, null);
        root.right = node1;
        root.left = node3;
        node1.left = node2;
        node2.right = node4;

        for(int i : solution.findMode(root))
            System.out.println(i);
    }
}
