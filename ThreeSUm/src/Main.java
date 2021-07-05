import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> triplets = solution.threeSum(nums);

        for(List<Integer> tripletList : triplets) {
            for (Integer number : tripletList)
                System.out.print(number + " ");
            System.out.println();
        }
    }
}
