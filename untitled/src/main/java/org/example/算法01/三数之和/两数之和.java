package org.example.算法01.三数之和;

import java.util.Arrays;

class 两数之和 {
    public static int[] twoSum(int[] numbers, int target) {
        //思路就是一遍循环，如果头尾之和大于目标则将右指针左移，如果小于则将左指针右移。
        int left = 0;
        int right = numbers.length - 1;
        while(true) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
    }
}
