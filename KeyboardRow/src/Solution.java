import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] findWords(String[] words) {
        String[] temp = new String[]{"asdfghjkl", "zxcvbnm"};
        int[] rows = new int[26];

        for(int i = 0, pos = 1; i < 2; ++i, ++pos)
            for(int j = 0; j < temp[i].length(); ++j)
                rows[temp[i].charAt(j) - 'a'] = pos;

        List<String> found = new ArrayList<>();

        for(String word : words) {
            int n = word.length();
            if(n == 1) {
                found.add(word);
                continue;
            }
            String aux = word.toLowerCase();
            for(int i = 1; i < n; ++i) {
                if (rows[aux.charAt(i) - 'a'] != rows[aux.charAt(i - 1) - 'a'])
                    break;
                if(i == n - 1)
                    found.add(word);
            }
        }

        String[] ans = new String[found.size()];
        ans = found.toArray(ans);

        return ans;
    }
}
