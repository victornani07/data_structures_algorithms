import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] tokens = s.split(" ");

        if(tokens.length != pattern.length())
            return false;

        Map<Character, String> m1 = new HashMap<>();
        Map<String, Character> m2 = new HashMap<>();

        for(int i = 0; i < pattern.length(); ++i) {
            Character c = pattern.charAt(i);
            String t = tokens[i];
            if(!m1.containsKey(c) && !m2.containsKey(t)) {
                m1.put(c, t);
                m2.put(t, c);
            } else if(m1.containsKey(c)) {
                if (!m1.get(c).equals(t))
                    return false;
            } else if(m2.containsKey(t)) {
                if(m2.get(t) != c)
                    return false;
            }
        }

        return true;
    }
}
