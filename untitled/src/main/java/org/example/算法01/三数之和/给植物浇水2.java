package org.example.算法01.三数之和;

public class 给植物浇水2 {
    public static int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int left = 0;
        int right = plants.length - 1;
        int remainA = capacityA;
        int remainB = capacityB;
        int ans = 0;
        while (left < right) {
            if (remainA - plants[left] > 0) {
                remainA = remainA - plants[left];
            } else {
                remainA = capacityA;
                ans++;
            }
            if (remainB - plants[right] > 0) {
                remainB = remainB - plants[right];
            } else {
                remainB = capacityB;
                ans++;
            }
            left++;
            right--;
            if (left == right) {
                if (remainA >= remainB) {
                    if (remainA > plants[left]) {
                        return ans;
                    } else {
                        return ++ans;
                    }
                } else {
                    if (remainB > plants[right]) {
                        return ans;
                    } else {
                        return ++ans;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minimumRefill(new int[]{7,7,7,7,7,7,7}, 8, 7));
    }
}
