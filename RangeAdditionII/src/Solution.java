public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int newM = m, newN = n;

        for(int[] temp : ops) {
            newM = Math.min(newM, temp[0]);
            newN = Math.min(newN, temp[1]);
        }

        return newM * newN;
    }
}
