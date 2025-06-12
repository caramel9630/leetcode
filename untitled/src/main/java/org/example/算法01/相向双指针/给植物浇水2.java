package org.example.算法01.相向双指针;

public class 给植物浇水2 {
    public static int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int left = 0;
        int right = plants.length - 1;
        int remainA = capacityA;
        int remainB = capacityB;
        int ans = 0;
        while (left < right) {
            if (remainA - plants[left] >= 0) {
                remainA -= plants[left];
            } else {
                remainA = capacityA - plants[left];
                ans++;
            }
            if (remainB - plants[right] >= 0) {
                remainB -= plants[right];
            } else {
                remainB = capacityB - plants[right];
                ans++;
            }
            left++;
            right--;
        }
        if (left == right) {
            if (Math.max(remainA, remainB) < plants[left]) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minimumRefill(new int[]{7,7,7,7,7,7,7}, 8, 7));
    }
}
