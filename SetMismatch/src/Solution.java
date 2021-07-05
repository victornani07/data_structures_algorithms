public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] occurences = new int[nums.length];

        for (int num : nums) ++occurences[num - 1];

        int num1 = 0, num2 = 0;

        for(int i = 0; i < occurences.length; ++i) {
            if (occurences[i] == 2)
                num1 = i + 1;
            if (occurences[i] == 0)
                num2 = i + 1;
        }

        return new int[]{num1, num2};
    }
}
