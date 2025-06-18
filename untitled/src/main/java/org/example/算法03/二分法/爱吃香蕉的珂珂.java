package org.example.算法03.二分法;

public class 爱吃香蕉的珂珂 {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0, right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        while (left + 1 < right) {
            int mid = (right + left) >>> 1;
            if (canEatAll(piles, mid, h)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }
    private boolean canEatAll(int[] piles, int speed, int h) {
        int time = piles.length;
        for (int pile : piles) {
            time += (pile - 1) / speed; // 向上取整
            if (time > h) {
                return false;
            }
        }
        return true;
    }
}
