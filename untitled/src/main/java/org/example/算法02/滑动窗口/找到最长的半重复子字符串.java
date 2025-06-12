package org.example.算法02.滑动窗口;

import java.util.Arrays;

public class 找到最长的半重复子字符串 {
    public int longestSemiRepetitiveSubstring(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int length = s.length();
        int result = 1;
        int repeatNum = 0;
        for (int right = 1; right < length; right++) {
            if (chars[right] == chars[right - 1]) {
                repeatNum++;
            }
            if (repeatNum > 1) {
                left++;
                while (chars[left] != chars[left-1]) {
                    left++;
                }
                repeatNum = 1;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
