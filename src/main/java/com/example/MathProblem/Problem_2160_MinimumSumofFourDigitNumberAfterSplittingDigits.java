package com.example.MathProblem;

import java.util.Arrays;

public class Problem_2160_MinimumSumofFourDigitNumberAfterSplittingDigits {
    public static void main(String[] args) {

    }
    static class Solution {
        public int minimumSum(int num) {
            int[] dig = new int[4];
            int cur = 0;
            while(num > 0) {
                dig[cur++] = num % 10;
                num /= 10;
            }
            Arrays.sort(dig);
            int num1 = dig[0] * 10 + dig[2];
            int num2 = dig[1] * 10 + dig[3];
            return num1 + num2;
        }
    }
}
