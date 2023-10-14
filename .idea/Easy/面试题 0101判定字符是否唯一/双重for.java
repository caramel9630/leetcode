class 双重for {
    public boolean isUnique(String astr) {
        if(astr.length() > 26){
            return false;
        }
        for(int i = 0; i < astr.length(); i++){
            for(int j = i + 1; j < astr.length(); j++){
                if(astr.charAt(i) == astr.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}