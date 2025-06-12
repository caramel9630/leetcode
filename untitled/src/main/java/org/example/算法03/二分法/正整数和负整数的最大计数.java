package org.example.算法03.二分法;

public class 正整数和负整数的最大计数 {
    public static int maximumCount(int[] nums) {
        int start = findTarget(nums, 0);
//        if (start == nums.length || nums[start] != 0) return nums.length;
        int end = findTarget(nums, 1);
        return Math.max(start, nums.length - end);
    }

    private static int findTarget(int[] nums, int target) {
        int left = -1, right = nums.length;
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

    public static void main(String[] args) {
        System.out.println(maximumCount(new int[]{-2,-1,-1,1,2,3}));
    }
}
