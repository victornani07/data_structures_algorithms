import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        for(int i = 0; i < s.length(); ++i) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(!m1.containsKey(a) && !m2.containsKey(b)) {
                m1.put(a, i);
                m2.put(b, i);
            } else if(m1.containsKey(a) && m2.containsKey(b)) {
                int i1 = m1.get(a);
                int i2 = m2.get(b);
                if(i1 != i2)
                    return false;
            } else
                return false;
        }

        return true;
    }
}
