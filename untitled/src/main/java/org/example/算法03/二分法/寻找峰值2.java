package org.example.算法03.二分法;

public class 寻找峰值2 {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int left = -1, right = n;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1, max = 0;
            for (int i = 0; i < m; i++) {
                if (mat[i][mid] > mat[max][mid]) {
                    max = i;
                }
            }
            int preValue = mid - 1 >= 0 ? mat[max][mid - 1] : -1;
            int postValue = mid + 1 <= n - 1 ? mat[max][mid + 1] : -1;
            int currentValue = mat[max][mid];
            if (currentValue > postValue && currentValue > preValue) {
                return new int[]{max, mid};
            } else if (currentValue < postValue) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return new int[]{-1, -1};
    }
}
