public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;

        if(p != null && q != null) {
            if (p.val != q.val)
                return false;

            boolean left = isSameTree(p.left, q.left);

            if(!left)
                return false;

            boolean right = isSameTree(p.right, q.right);

            return right;
        }

        return false;
    }
}
