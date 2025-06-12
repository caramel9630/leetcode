package org.example.算法03.二分法;

import java.util.Arrays;

public class 咒语和药水的成功对数 {

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int target = (int) ((success - 1)/spells[i]);
            if (target < potions[potions.length - 1]) {
                spells[i] = potions.length - locateTraget(potions, target);
            } else {
                spells[i] = 0;
            }
        }
        return spells;
    }
    private static int locateTraget(int[] nums, int target) {
        int left = -1, right = nums.length;
        while (left + 1 < right) {
            int mid = (right + left) >>> 1;
            if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(successfulPairs(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7)));
    }
}
