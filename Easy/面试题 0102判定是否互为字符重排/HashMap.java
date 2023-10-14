public class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1Chars = s1.toCharArray();
        Map<Character, Integer> s1Map = getMap(s1);
        Map<Character, Integer> s2Map = getMap(s2);
        for (char s1Char : s1Chars) {
            if (!s2Map.containsKey(s1Char) || s2Map.get(s1Char) != s1Map.get(s1Char)) {
                return false;
            }
        }
        return true;
    }

    // 统计指定字符串str中各字符的出现次数，并以Map的形式返回
    private Map<Character, Integer> getMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }
        return map;
    }
}
/*
    解题思路：
        0.HashMap计数
        1.如果一个字符串经过重新排列后，能够变成另外一个字符串，那么它们的每个不同字符的出现次数是相同的
        2.如果出现次数不同，那么表示两个字符串不能够经过重新排列得到
            例如："abc"中'a'字符出现1次，'b'字符出现1次，'c'字符出现1次
                 "bad"中'a'字符出现1次，'b'字符出现1次，'c'字符出现0次，'d'字符出现1次
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了19.56% 的用户
    内存消耗：36.1 MB, 在所有 Java 提交中击败了65.04% 的用户
 */