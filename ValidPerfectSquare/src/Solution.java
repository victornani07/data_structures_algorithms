public class Solution {
    public boolean isPerfectSquare(int num) {
        for(long i = 1; i * i <= num; ++i)
            if(i * i == num)
                return true;

        return false;
    }
}
