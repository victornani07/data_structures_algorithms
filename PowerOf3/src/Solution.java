public class Solution {
    public boolean isPower(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
