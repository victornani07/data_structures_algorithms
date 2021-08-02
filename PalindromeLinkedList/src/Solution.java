import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> nodes = new ArrayList<>();

        while(head != null) {
            nodes.add(head.val);
            head = head.next;
        }

        int i = 0, j = nodes.size() - 1;

        while(i <= j) {
            if(nodes.get(i) != nodes.get(j))
                return false;
            ++i;
            --j;
        }

        return true;
    }
}
