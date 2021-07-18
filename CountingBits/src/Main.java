public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] setBits = solution.countBits(9);

        for(int i : setBits)
            System.out.println(i);
    }
}
