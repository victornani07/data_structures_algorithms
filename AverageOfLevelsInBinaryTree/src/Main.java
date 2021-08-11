public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(3, null, null);
        TreeNode node1 = new TreeNode(9, null, null);
        TreeNode node2 = new TreeNode(20, null, null);
        TreeNode node3 = new TreeNode(15, null, null);
        TreeNode node4 = new TreeNode(7, null, null);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        for(Double d : solution.averageOfLevels(root))
            System.out.println(d);
    }
}
