public class Solution {
    public int mySqrt(int x) {
        double r = x, precision = Math.pow(10, -1);

        while(Math.abs(x - r * r) > precision)
            r = (r + x / r) / 2;

        return (int)r;
    }
}
