class Solution {
    public boolean isUnique(String astr) {
        for(int i = 0; i < astr.length(); i++){
            char temp = astr.charAt(i);
            if(astr.indexOf(temp, i+1) != -1){
                return false;
            }
        }
        return true;
    }
}