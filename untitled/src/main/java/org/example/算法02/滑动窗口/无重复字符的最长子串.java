package org.example.算法02.滑动窗口;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.HashMap;

public class 无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String S) {
        char[] s = S.toCharArray(); // 转换成 char[] 加快效率（忽略带来的空间消耗）
        int n = s.length;
        int ans = 0;
        int left = 0;
        int[] cnt = new int[128]; // 也可以用 HashMap<Character, Integer>，这里为了效率用的数组
        for (int right = 0; right < n; right++) {
            char c = s[right];
            cnt[c]++;
            while (cnt[c] > 1) { // 窗口内有重复字母
                cnt[s[left]]--; // 移除窗口左端点字母
                left++; // 缩小窗口
            }
            ans = Math.max(ans, right - left + 1); // 更新窗口长度最大值
        }
        return ans;
    }

    public int lengthOfLongestSubstring2(String S) {
        char[] s = S.toCharArray(); // 转换成 char[] 加快效率（忽略带来的空间消耗）
        int n = s.length;
        int ans = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < n; right++) {
            char c = s[right];
            map.put(c, map.get(c)+1);
            while (map.get(c) > 1) { // 窗口内有重复字母
                char leftChar = s[left]; // 移除窗口左端点字母
                map.put(leftChar, map.get(leftChar) - 1);
                left++; // 缩小窗口
            }
            ans = Math.max(ans, right - left + 1); // 更新窗口长度最大值
        }
        return ans;
    }
}
