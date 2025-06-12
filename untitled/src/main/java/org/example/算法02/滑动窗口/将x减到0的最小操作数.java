package org.example.算法02.滑动窗口;

import java.net.URLEncoder;
import java.util.Arrays;

public class 将x减到0的最小操作数 {
    public static int minOperations(int[] nums, int x) {
        int left = 0;
        int length = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int target = sum - x;
        int count = Integer.MAX_VALUE;
        int sum2 = 0;
        if (target < 0) {
            return -1; // 全部移除也无法满足要求
        }
        for (int right = 0; right < length; right++) {
            sum2 += nums[right];
            while (sum2 > target) {
                sum2 -= nums[left++];
            }
            if (sum2 == target) {
                count = Math.min(count, length -(right - left + 1));
            }
        }
        return count ==  Integer.MAX_VALUE ? -1 : count;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{3,2,20,1,1,3}, 10));
    }
}
