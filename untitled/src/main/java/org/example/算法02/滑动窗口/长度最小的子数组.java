package org.example.算法02.滑动窗口;

public class 长度最小的子数组 {
    public static int minSubArrayLen(int target, int[] nums) {
        int result = nums.length + 1;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum - nums[left] >= target) {
                sum -= nums[left++];
            }
            if (sum >= target) {
                result = Math.min(result, right - left + 1);
            }
        }
        return result <= nums.length ? result : 0;
    }

    public static int minSubArrayLen2(int target, int[] nums) {
        int result = nums.length + 1;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result <= nums.length ? result : 0;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(2, new int[]{1,4,4}));
    }
}
