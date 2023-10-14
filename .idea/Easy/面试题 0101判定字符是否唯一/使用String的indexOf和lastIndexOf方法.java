class Solution {
    public boolean isUnique(String astr) {
        for(int i = 0; i < astr.length(); i++){
            if(astr.indexOf(astr.charAt(i)) != astr.lastIndexOf(astr.charAt(i))){
                return false;
            }
        }
        return true;
    }
}