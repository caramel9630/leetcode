package org.example.算法02.滑动窗口;

import java.util.HashMap;

public class 最多K个重复元素的最长子数组 {
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0;
        int length = nums.length;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < length; right++) {
            int numRight = nums[right];
            map.merge(numRight, 1, Integer::sum);
            while (map.get(right) > k) {
                int numLeft = nums[left++];
                map.merge(numLeft, -1, Integer::sum);
            }
            result = Math.max(right - left + 1, result);
        }
        return result;
    }
}
