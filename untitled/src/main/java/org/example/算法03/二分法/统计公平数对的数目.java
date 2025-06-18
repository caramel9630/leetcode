package org.example.算法03.二分法;

import java.util.Arrays;

public class 统计公平数对的数目 {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > upper) break;
            int left = locateTarget(nums, i, lower - nums[i]);
            int right = locateTarget(nums, i, upper - nums[i] + 1) - 1;
            res += right - left + 1;
        }
        return res;
    }
    private int locateTarget (int[] nums, int start, int target) {
        int left = start, right = nums.length;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
