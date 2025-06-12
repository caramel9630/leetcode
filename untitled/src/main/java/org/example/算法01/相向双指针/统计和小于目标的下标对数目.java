package org.example.算法01.相向双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 统计和小于目标的下标对数目 {
    public static int countPairs(List<Integer> nums, int target) {
        nums.sort(null);
        int i = 0;
        int j = nums.size() - 1;
        int count = 0;
        while (i < j) {
            if (nums.get(i) + nums.get(j) < target) {
                count += j - i;
                i++;
            } else {
                j--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(countPairs(nums, 4));
    }
}
