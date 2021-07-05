// You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately,
// due to some error, one of the numbers in s got duplicated to another number in the set,
// which results in repetition of one number and loss of another number.
// You are given an integer array nums representing the data status of this set after the error.
// Find the number that occurs twice and the number that is missing and return them in the form of an array.

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{3, 2, 2};

        System.out.println(Arrays.toString(solution.findErrorNums(nums)));
    }
}
