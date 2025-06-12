package org.example.算法01.相向双指针;

import java.util.*;

public class 四数之和 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        List<List<Integer>> result  = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length - 3; i++) {
            if (i>0 && nums[i] == nums[i-1] ) continue;
            if ((long)nums[i] + nums[length-1] + nums[length-2] + nums[length-3] < target) continue;
            if ((long)nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) break;
            for (int j = i + 1; j < length - 2; j++) {
                if (j>i+1 && nums[j] == nums[j-1]) continue;

                int left = j + 1;
                int right = length - 1;
                if ((long)nums[i] + nums[j] + nums[right-1] + nums[right] < target) continue;
                if ((long)nums[i] + nums[j] + nums[left] + nums[left+1] > target) break;
                while (left < right) {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        result.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        for (left++; left<right && nums[left] == nums[left-1]; left++);
                        for (right--; left<right && nums[right] == nums[right+1]; right--);
                    } else if (sum > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fourSum(new int[] {-3,-2,-1,0,0,1,2,3}, 0));
    }
}
