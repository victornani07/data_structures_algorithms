import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = new int[]{3,2,4};
        int target = 6;

        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}
