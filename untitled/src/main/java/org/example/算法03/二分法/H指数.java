package org.example.算法03.二分法;

import java.util.Arrays;

public class H指数 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int res = 0;
        int length = citations.length;
        int left = -1, right = length;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (citations[mid] >= length - mid) {
                res = Math.max(res, length - mid);
                right = mid;
            } else {
                left = mid;
            }
        }
        return res;
    }
}
