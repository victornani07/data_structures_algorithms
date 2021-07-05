import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; ++i) {
            int num1 = nums[i], j = i + 1, k = nums.length - 1;
            while(j < k) {
                int num2 = nums[j], num3 = nums[k];
                if(num1 + num2 + num3 == 0) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(num1);
                    triplet.add(num2);
                    triplet.add(num3);
                    if(!triplets.contains(triplet))
                        triplets.add(triplet);
                    ++j;
                    --k;
                }
                else if(num1 + num2 + num3 > 0)
                    --k;
                else
                    ++j;
            }
        }

        return triplets;
    }
}
