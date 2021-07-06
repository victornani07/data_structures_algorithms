import java.util.ArrayList;
import java.util.List;

public class Solution {
    private void inorderTraversalUTIL(TreeNode node, List<Integer> list) {
        if(node == null)
            return;

        inorderTraversalUTIL(node.left, list);
        list.add(node.val);
        inorderTraversalUTIL(node.right, list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversalUTIL(root, list);

        return list;
    }
}
