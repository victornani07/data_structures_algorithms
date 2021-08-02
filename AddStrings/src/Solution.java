public class Solution {
    public String addStrings(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int i = m - 1, j = n - 1, remainder = 0;
        StringBuilder result = new StringBuilder();

        do {
            int sum = remainder;
            if (i >= 0)
                sum += num1.charAt(i--) - '0';
            if (j >= 0)
                sum += num2.charAt(j--) - '0';
            remainder = sum / 10;
            result.append(sum % 10);
        } while (i != -1 || j != -1);

        if(remainder != 0)
            result.append(remainder);

        return result.reverse().toString();
    }
}
