public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};

        for(int i : new Solution().intersection(nums1, nums2))
            System.out.print(i + " ");
    }
}
