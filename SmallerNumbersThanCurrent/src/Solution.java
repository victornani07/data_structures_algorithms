import java.util.*;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, List<Integer>> indexes = new HashMap<>();
        int[] smaller = new int[nums.length];

        for(int i = 0; i < nums.length; ++i)
            if(!indexes.containsKey(nums[i])) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                indexes.put(nums[i], list);
            } else {
                List<Integer> list = indexes.get(nums[i]);
                list.add(i);
                indexes.replace(nums[i], list);
            }

        Arrays.sort(nums);
        int s = 0;

        for(int i = 0; i < nums.length; ++i) {
            if(i > 0 && nums[i] != nums[i - 1])
                s = i;

            List<Integer> list = indexes.get(nums[i]);
            smaller[list.get(0)] = s;
            list.remove(0);
            indexes.replace(nums[i], list);
        }

        return smaller;
    }
}
