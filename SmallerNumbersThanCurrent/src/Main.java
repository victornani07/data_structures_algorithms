public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{7,7,7,7};

        for(int i : solution.smallerNumbersThanCurrent(nums))
            System.out.println(i);
    }
}
