package org.example.算法02.滑动窗口;

public class 最大连续1的个数III {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int length = nums.length;
        int zeroCount = 0;
        int result = 0;
        for (int right = 0; right < length; right++) {
            zeroCount += 1 - nums[right];
            while (zeroCount > k) {
                zeroCount -= 1 - nums[left++];
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
