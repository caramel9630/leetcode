class 使用数组解决 {
    public boolean isUnique(String astr) {
        int[] arr = new int[128];
        for (int i = 0; i < astr.length(); i++) {
            //把字符和数组关联
            if (arr[astr.charAt(i)] != 0)
                return false;
            arr[astr.charAt(i)]++;
        }
        return true;
    }
}