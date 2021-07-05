import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1)
            return s.length();

        int length = 0, maxLength = 0;
        HashMap<Character, Integer> occurences = new HashMap<>();

        for(int i = 0; i < s.length(); ++i)
            if (!occurences.containsKey(s.charAt(i))) {
                occurences.put(s.charAt(i), i);
                ++length;
            } else {
                if (length > maxLength)
                    maxLength = length;
                length = 0;
                i = occurences.get(s.charAt(i));
                occurences.clear();
            }

        if (length > maxLength)
            maxLength = length;

        return maxLength;
    }
}
