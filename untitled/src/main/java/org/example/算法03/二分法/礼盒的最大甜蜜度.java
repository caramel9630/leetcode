package org.example.算法03.二分法;

import java.security.PrivilegedAction;
import java.util.Arrays;

public class 礼盒的最大甜蜜度 {

    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int left = -1, right = price[price.length - 1] - price[0] + 1;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (checkSweet(price, mid) >= k) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int checkSweet(int[] price, int mid) {
        int count = 1;
        int last = price[0];
        for (int i = 1; i < price.length; i++) {
            if (price[i] - last >= mid) {
                count++;
                last = price[i];
            }
        }
        return count;
    }
}

