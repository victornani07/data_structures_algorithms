public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = new int[]{0,2,3,4,6,8,9,11};

        for(String s : solution.summaryRanges(nums))
            System.out.println(s);
    }
}
