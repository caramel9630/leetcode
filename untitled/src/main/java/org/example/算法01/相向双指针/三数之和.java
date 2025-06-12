package org.example.算法01.相向双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class 三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int x = 0; x < length - 2; x++) {
            if (x >0 && nums[x] == nums[x - 1]) continue;// 跳过重复数字
            if (nums[x] + nums[length - 1] + nums[length - 2] < 0) continue;//如果固定数字和最大的两个数都小于零，那么相当于这一回合的x没有答案，所以跳过这回合的x
            if (nums[x] + nums[x + 1] + nums[x + 2] > 0) break;//如果这回合最小的三个数的和都大于0，那么没必要再继续这个循环了，因为后面循环x的三数和必然大于0
            int left = x + 1;
            int right = length - 1;
            while (left < right) {
                int sum = nums[x] + nums[left] + nums[right];
                if (sum > 0) right--;
                if (sum < 0) left++;
                if (sum == 0) {
                    ans.add(List.of(nums[x], nums[left], nums[right]));
                    for (right--; left < right && nums[right] == nums[right + 1]; right--);// 跳过重复数字
                    for (left++; left < right && nums[left] == nums[left - 1]; left++);// 跳过重复数字
                }
            }
        }
        return ans;
    }
}
