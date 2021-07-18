public class Solutioon {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] < 9) {
            ++digits[digits.length - 1];
            return digits;
        } else {
            int i = digits.length - 1;
            ++digits[i];

            while(digits[i] == 10) {
                digits[i] = 0;
                if(i == 0) {
                    int[] temp = digits;
                    digits = new int[digits.length + 1];
                    for(int j = 1; j < digits.length; ++j)
                        digits[j] = temp[j - 1];
                    ++i;
                }
                digits[i - 1] = digits[i - 1] + 1;
                --i;
            }
        }

        return digits;
    }
}
