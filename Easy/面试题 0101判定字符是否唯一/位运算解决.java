class Solution {
    public boolean isUnique(String astr) {
        Long base = 0L;
        for(int i = 0; i < astr.length(); i++){
            int dif = astr.charAt(i) - 'A';
            if((base & 1L<<dif) != 0L){
                return false;
            }
            base |= (1L<<dif);
        }
        return true;
    }
}