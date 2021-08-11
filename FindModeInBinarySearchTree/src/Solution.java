import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private int max;

    private void findUTIL(TreeNode root, Map<Integer, Integer> map) {
        if(root == null)
            return;

        if(!map.containsKey(root.val))
            map.put(root.val, 1);
        else {
            int aux = map.get(root.val) + 1;
            map.replace(root.val, aux);
            if(aux > max) max = aux;
        }

        findUTIL(root.left, map);
        findUTIL(root.right, map);
    }

    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> m = new HashMap<>();
        findUTIL(root, m);
        List<Integer> ans = new ArrayList<>();

        for(Map.Entry<Integer, Integer> me : m.entrySet())
            if(me.getValue() == max)
                ans.add(me.getKey());

        int n = ans.size();
        int[] t = new int[n];

        for(int i = 0; i < n; ++i)
            t[i] = ans.get(i);

        return t;
    }
}