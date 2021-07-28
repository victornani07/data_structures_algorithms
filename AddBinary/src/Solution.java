public class Solution {
    public String addBinary(String a, String b) {
       int na = a.length() - 1, nb = b.length() - 1, carry = 0, nc = 0;
       String sum = "", c = "";

       while(na >= 0 && nb >= 0) {
           int digitSum = (a.charAt(na) - '0') + (b.charAt(nb) - '0') + carry;
           int nextDigit = digitSum % 2;
           sum = nextDigit + sum;
           carry = digitSum / 2;
           --na;
           --nb;
       }

       if(na == -1 && nb == -1) {
           if(carry == 1)
               sum = carry + sum;

           return sum;
       }

       if(na == -1) {
           c = b;
           nc = nb;
       } else if(nb == -1) {
           c = a;
           nc = na;
       }

       if(carry == 0) {
           sum = c.substring(0, nc + 1) + sum;
           return sum;
       }

       while(nc >= 0) {
           int digitSum = c.charAt(nc) - '0' + carry;
           int nextDigit = digitSum % 2;
           sum = nextDigit + sum;
           carry = digitSum / 2;
           --nc;
       }

       if(carry == 1)
           sum = carry + sum;

       return sum;
    }
}
