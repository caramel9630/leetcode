package org.example.算法03.二分法;

public class 寻找旋转排序数组中的最小值 {
    public int findMin(int[] nums) {
        int len = nums.length;
        int left = -1, right = len - 1;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] > nums[len - 1]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return nums[right];
    }
}
