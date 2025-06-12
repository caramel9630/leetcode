package org.example.算法01.相向双指针;

import java.util.Arrays;

public class 最接近的三数之和 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int length = nums.length;

        int minDiff = Integer.MAX_VALUE;
        int answer = 0;
        if (length == 3) return nums[0] + nums[1] + nums[2];

        for (int fix = 0; fix < length - 2; fix++) {
            int left = fix +1;
            int right = length - 1;

            if (fix > 0 && nums[fix] == nums[fix-1]) continue;
            if (target > nums[fix] + nums[right] + nums[right - 1]) {
                if (target - nums[fix] - nums[right] - nums[right - 1] < minDiff) {
                    answer = nums[fix] + nums[right] + nums[right - 1];
                    minDiff = target - nums[fix] - nums[right] - nums[right - 1];
                }
                continue;
            };
            if (target < nums[fix] + nums[left] + nums[left + 1]) {
                if (nums[fix] + nums[left] + nums[left + 1] - target < minDiff) {
                    answer = nums[fix] + nums[left] + nums[left + 1];
                }
                break;
            };
            while (left < right) {
                int sum = nums[fix] + nums[left] + nums[right];
                if (target == sum) {
                    return target;
                } else if (sum > target) {
                    if (sum - target < minDiff) {
                        answer = sum;
                        minDiff = sum - target;
                    }
                    right --;
                } else {
                    if (target - sum < minDiff) {
                        answer = sum;
                        minDiff = target - sum;
                    }
                    left++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{1,1,1,0}, -100));
    }
}
