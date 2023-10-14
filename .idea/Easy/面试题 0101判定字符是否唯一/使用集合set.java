class Solution {
    public boolean isUnique(String astr) {
        Set<Character> words = new HashSet<>();
        for(int i = 0; i < astr.length(); i++){
            if(!words.add(astr.charAt(i))){
                return false;
            }
        }
        return true;
    }
}