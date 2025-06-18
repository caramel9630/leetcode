package org.example.算法03.二分法;

public class 寻找旋转排序数组中的最小值2 {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] > nums[nums.length - 1]){
                left = mid;
            } else if (nums[mid] < nums[nums.length - 1]) {
                right = mid;
            } else {
                right--;
            }
        }
        return nums[right];
    }
}
