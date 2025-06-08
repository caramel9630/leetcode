package org.example.算法01.三数之和;

import java.util.Arrays;

public class 有效三角形的个数 {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int result = 0;
        for (int i = length - 1; i > 1; i--) {
            int left = 0;
            int right = i - 1;
            if (nums[right] + nums[right - 1] <= nums[i]) continue;
            if (nums[0] + nums[1] > nums[i]) {
                result += i*(i+1)*(i-1)/6;
                break;
            }
            while (left < right) {
                if (nums[right] + nums[left] <= nums[i]) {
                    left++;
                } else {
                    result += right - left;
                    right--;
                }
            }
        }
        return result;
    }


    public int triangleNumber2(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int result = 0;
        for (int i = 2; i < length; i++) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (nums[right] + nums[left] <= nums[i]) {
                    left++;
                } else {
                    result += right - left;
                    right--;
                }
            }
        }
        return result;
    }

}
