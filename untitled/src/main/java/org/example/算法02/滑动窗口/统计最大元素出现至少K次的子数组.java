package org.example.算法02.滑动窗口;

import java.util.Arrays;

public class 统计最大元素出现至少K次的子数组 {
    public static long countSubarrays(int[] nums, int k) {
        int left = 0;
        int length = nums.length;
        int maxNum = Arrays.stream(nums).max().orElseThrow();
        int count = 0;
        long res = 0;
        for (int right = 0; right < length; right++) {
            if (nums[right] == maxNum) {
                count++;
            }
            while (count >= k) {
                if (nums[left] == maxNum) {
                    count--;
                }
                left++;
            }
            res += left;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countSubarrays(new int[]{1,3,2,3,3}, 2));
    }
}
