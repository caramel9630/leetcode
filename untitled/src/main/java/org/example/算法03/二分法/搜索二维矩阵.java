package org.example.算法03.二分法;

public class 搜索二维矩阵 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = -1, right = n*m;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (matrix[mid/n][mid%n] < target){
                left = mid;
            } else {
                right = mid;
            }
        }
        if (right < n*m && matrix[right/n][right%n] == target) {
            return true;
        }
        return false;
    }
}
