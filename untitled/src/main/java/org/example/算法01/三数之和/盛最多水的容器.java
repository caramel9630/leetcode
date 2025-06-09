package org.example.算法01.三数之和;

public class 盛最多水的容器 {

    //短边是决定面积的关键，如果面积更大则移动长边
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = (right - left) * Math.min(height[left], height[right]);
        while (left < right) {
            if (height[left] < height[right]) {
                result = Math.max((right - left)*height[left], result);
                left++;
            } else {
                result = Math.max((right - left)*height[right], result);
                right--;
            }
        }
        return result;
    }
}
