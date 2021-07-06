public class Solution {
    private String add(String num1, String num2) {
        int carry = 0;
        String sum = "";
        int size = num2.length() - num1.length();

        for(int i = 0; i < size; ++i)
            num1 = "0" + num1;

        for(int i = num1.length() - 1; i >= 0; --i) {
            int digit1 = num1.charAt(i) - '0';
            int digit2 = num2.charAt(i) - '0';
            int digitSum = digit1 + digit2 + carry;
            int digit = digitSum % 10;
            carry = digitSum / 10;
            sum = digit + sum;
        }

        if(carry != 0)
            sum = carry + sum;

        return sum;
    }

    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";

        String partialSum = "", product = "0", zeros = "";
        int carry = 0;

        for(int i = num2.length() - 1; i >= 0; --i) {
            int digit1 = num2.charAt(i) - '0';
            for (int j = num1.length() - 1; j >= 0; --j) {
                int digit2 = num1.charAt(j) - '0';
                int digitProduct = (digit1 * digit2) + carry;
                int resultDigit = digitProduct % 10;
                partialSum = resultDigit + partialSum;
                carry = digitProduct / 10;
            }

            if(carry != 0)
                partialSum = carry + partialSum;

            partialSum += zeros;

            if(product.equals("0"))
                product = partialSum;
            else
                product = add(product, partialSum);

            zeros += "0";
            carry = 0;
            partialSum = "";
        }

        return product;
    }
}
