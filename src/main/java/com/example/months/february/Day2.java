package com.example.months.february;

// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/?envType=daily-question&envId=2025-02-02
public class Day2 {
  public boolean check(int[] nums) {
    int count = 0;
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      if (nums[i] > nums[(i + 1) % n]) {
        count++;
      }

      if (count > 1) {
        return false;
      }
    }
    return true;
  }
}
