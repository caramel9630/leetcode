package org.example.算法02.滑动窗口;

public class 统计得分小于K的子数组数目 {
    public long countSubarrays(int[] nums, long k) {
        long res = 0;
        int left = 0;
        int length = nums.length;
        long sum = 0;
        for (int right = 0; right < length; right++) {
            sum += nums[right];
            while (sum * (right - left + 1) >= k) {
                sum -= nums[left++];
            }
            res += right - left + 1;
        }
        return res;
    }
}
