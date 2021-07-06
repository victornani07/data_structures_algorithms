public class ConstructBST {
    public TreeNode insert(TreeNode root, int key) {
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
}
