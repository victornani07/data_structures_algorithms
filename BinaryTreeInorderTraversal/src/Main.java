import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
        List<Integer> list = solution.inorderTraversal(root);

        for(Integer i : list)
            System.out.println(i);
    }
}
