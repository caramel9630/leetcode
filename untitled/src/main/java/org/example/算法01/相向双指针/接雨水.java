package org.example.算法01.相向双指针;

public class 接雨水 {

    public int trap(int[] height) {
        //同一个height[x]中的左右木板长度不同，接水量取决于短板，所以取左右两边的最大高度，再看同一个height[x]的左右两边的最短木板减去高度就是接水量
        int answer = 0;
        int length = height.length;

        int[] pre_max = new int[length];
        pre_max[0] = height[0];
        int[] post_max = new int[length];
        post_max[length - 1] = height[length - 1];

        for (int i = 1; i < length; i++) {
            pre_max[i] = Math.max(pre_max[i-1], height[i]);
        }
        for (int j = length - 2; j >= 0 ;j--) {
            post_max[j] = Math.max(post_max[j+1], height[j]);
        }
        for (int x = 0; x < length; x++) {
            answer += Math.min(post_max[x], pre_max[x]) - height[x];
        }
        return answer;
    }

    public int trap2(int[] height) {

        int answer = 0;
        int length = height.length;
        int left = 0;
        int right = length - 1;

        int pre_max = 0;
        int post_max =  0;

        while (left < right) {
            pre_max = Math.max(pre_max, height[left]);
            post_max = Math.max(post_max, height[right]);
            answer += pre_max > post_max ? post_max - height[right--] : pre_max - height[left++];
        }
        return answer;
    }
}
