import java.util.ArrayList;
import java.util.List;

public class Solution {
    private boolean findPath(TreeNode root, TreeNode t, List<TreeNode> path){
        if(root == null)
            return false;

        path.add(root);

        if(root.val == t.val)
            return true;

        boolean leftPath = findPath(root.left, t, path);
        boolean rightPath = findPath(root.right, t, path);

        if(leftPath || rightPath)
            return true;

        path.remove(path.size() - 1);
        return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();

        boolean firstNodeSearch = findPath(root, p, path1);
        boolean secondNodeSearch = findPath(root, q, path2);

        if(!firstNodeSearch || !secondNodeSearch)
            return null;

        int i = 0;

        for(i = 0; i < path1.size() && i < path2.size(); ++i)
            if(path1.get(i).val != path2.get(i).val)
                break;

        return path1.get(i - 1);
    }
}
