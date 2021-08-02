import java.util.ArrayList;
import java.util.List;

public class Solution {
    private void findPath(TreeNode root, String path, List<String> paths) {
        if(root == null)
            return;

        if(path.equals(""))
            path += root.val;
        else
            path += "->" + root.val;

        if(root.right == null && root.left == null) {
            paths.add(path);
            return;
        }

        findPath(root.left, path, paths);
        findPath(root.right, path, paths);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        findPath(root, "", paths);

        return paths;
    }
}
