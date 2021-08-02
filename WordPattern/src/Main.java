public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(solution.wordPattern(pattern, s));
    }
}
