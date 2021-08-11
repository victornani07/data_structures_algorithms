import java.util.ArrayList;
import java.util.List;

public class Solution {
    private void traverse(TreeNode root, int level, List<Double> sum, List<Integer> count) {
        if(root == null)
            return;

        if(level < sum.size()) {
            sum.set(level, sum.get(level) + root.val);
            count.set(level, count.get(level) + 1);
        } else {
            sum.add((double)root.val);
            count.add(1);
        }
        traverse(root.left, level + 1, sum, count);
        traverse(root.right, level + 1, sum, count);
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> average = new ArrayList<>();
        List<Double> sum = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        traverse(root, 0, sum, count);

        for(int i = 0; i < sum.size(); ++i)
            average.add(sum.get(i) / count.get(i));

        return average;
    }
}
