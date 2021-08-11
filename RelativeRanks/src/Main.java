public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] score = new int[]{10,3,8,9,4};

        for(String s : solution.findRelativeRanks(score))
            System.out.println(s);
    }
}
