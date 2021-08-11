import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] next = new int[m];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n - 1; ++i)
            for(int j = i + 1; j < n; ++j)
                if(nums2[j] > nums2[i]) {
                    map.put(nums2[i], nums2[j]);
                    break;
                }

        for(int i = 0; i < m; ++i)
            next[i] = map.getOrDefault(nums1[i], -1);

        return next;
    }
}
