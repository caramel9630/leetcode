class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        char[] words1 = s1.toCharArray();
        char[] words2 = s2.toCharArray();
        Arrays.sort(words1);
        Arrays.sort(words2);
        if(new String(words1).equals(new String(words2))){
            return true;
        }
        return false;
    }
}