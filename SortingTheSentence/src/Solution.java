public class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];

        for(String word : words)
            sorted[((word.charAt(word.length() - 1)) - '0') - 1] = word.substring(0, word.length() - 1);

        String sortedSentence = "";

        for(int i = 0; i < sorted.length; ++i) {
            sortedSentence += sorted[i];
            if(i != sorted.length - 1)
                sortedSentence += " ";
        }

        return sortedSentence;
    }
}
