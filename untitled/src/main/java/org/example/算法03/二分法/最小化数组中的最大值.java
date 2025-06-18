package org.example.算法03.二分法;

import java.util.Arrays;

public class 最小化数组中的最大值 {
    public int minimizeArrayValue(int[] nums) {
        int left = -1, right = Arrays.stream(nums).max().orElseThrow() + 1;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (check(nums, mid)) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }
    private boolean check(int[] nums, int mid) {
        int extra = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            extra = Math.max(nums[i] + extra - mid, 0);
        }
        return nums[0] + extra > mid;
    }
}
