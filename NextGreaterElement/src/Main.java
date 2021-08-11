public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};

        for(int i : solution.nextGreaterElement(nums1, nums2))
            System.out.println(i);
    }
}
