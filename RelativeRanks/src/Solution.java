import java.util.*;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length, position = 4;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        String[] ranks = new String[n];
        Map<Integer, Integer> m = new HashMap<>();

        for(int i = 0; i < n; ++i) {
            pq.add(score[i]);
            m.put(score[i], i);
        }

        ranks[m.get(pq.poll())] = "Gold Medal";
        if(!pq.isEmpty()) ranks[m.get(pq.poll())] = "Silver Medal";
        if(!pq.isEmpty()) ranks[m.get(pq.poll())] = "Bronze Medal";

        while(!pq.isEmpty())
            ranks[m.get(pq.poll())] = "" + position++;

        return ranks;
    }
}
