class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        int[] words = new int[128];
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length(); i++){
            words[s1.charAt(i)]++;
        }
        for(int j = 0; j < s2.length(); j++){
            words[s2.charAt(j)]--;
            if(words[s2.charAt(j)] < 0){
                return false;
            }
        }
        return true;
    }
}