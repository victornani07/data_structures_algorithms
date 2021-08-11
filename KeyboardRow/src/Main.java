public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = new String[]{"adsdf","sfd"};

        for(String word : solution.findWords(words))
            System.out.println(word);
    }
}
