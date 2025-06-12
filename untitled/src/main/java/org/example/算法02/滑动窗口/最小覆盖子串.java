package org.example.算法02.滑动窗口;

public class 最小覆盖子串 {
    public String minWindow(String s, String t) {
        char[] chart = t.toCharArray();
        int[] count = new int[128];
        int less = 0;
        for (char i : chart) {
            if (count[i] ==0) {
                less++;
            }
            count[i] += 1;
        }
        int length_s = s.length(), length_t = t.length();
        int left_s = 0;
        int ans_left = -1, ans_right = length_s;
        if (length_s < length_t) return "";
        for (int right_s = 0; right_s < length_s; right_s++) {
            char chars = s.charAt(right_s);
            count[chars] -= 1;
            if (count[chars] == 0) {
                less--;
            }
            while (less == 0) {
                if (right_s - left_s < ans_right - ans_left) {
                    ans_right = right_s;
                    ans_left = left_s;
                }
                char leftchar = s.charAt(left_s);
                if (count[leftchar] == 0){
                    less++;
                }
                count[leftchar] += 1;
                left_s++;
            }
        }
        return ans_left < 0 ? "" : s.substring(ans_left, ans_right + 1);
    }
}
