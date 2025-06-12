package org.example.算法03.二分法;

public class 在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        int start = locateTraget(nums, target);
        if (start == nums.length || nums[start] != target) return new int[]{-1, -1};
        return new int[]{start, locateTraget(nums, target + 1) - 1};
    }
    private int locateTraget(int[] nums, int target) {
        int left = -1;
        int right = nums.length;
        while (left + 1 < right) {
            int mid = left + (right - left)/2;
            if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
