package org.example.算法03.二分法;

public class 完成旅途的最少时间 {
    public long minimumTime(int[] time, int totalTrips) {
        long left = Integer.MAX_VALUE, right = 0;
        for (int t : time) {
            left = Math.min(left, t);
        }
        right = left*totalTrips; // 最多需要的时间
        left--;
        while (left + 1 < right) {
            long mid = (left + right) >>> 1;
            if (exceedTotalTrips(time, totalTrips, mid)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }
    private boolean exceedTotalTrips (int[] time, int totalTrips, long speed) {
        long sum = 0;
        for (int t: time) {
            sum += speed/t;
            if (sum >= totalTrips) return true;
        }
        return false;
    }
}
