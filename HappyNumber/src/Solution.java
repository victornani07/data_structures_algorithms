import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visited = new TreeSet<>();

        while(true) {
            int sum = 0;
            while(n > 0) {
                int digit = n % 10;
                sum = sum + (digit * digit);
                n /= 10;
            }
            n = sum;
            if(n == 1)
                return true;
            if(visited.contains(n))
                return false;
            visited.add(n);
        }
    }
}
