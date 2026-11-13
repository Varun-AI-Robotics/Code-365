class Solution {
    public boolean checkValidString(String s) {
        int cmin = 0;
        int cmax = 0;
        for(int i : s.toCharArray()){
            if(i == '('){
                cmax++;
                cmin++;
            } else if(i == ')'){
                cmax--;
                cmin--;
            } else if( i == '*'){
                cmax++;
                cmin--;
            }
        if(cmax < 0) return false;
        cmin = Math.max(cmin, 0);
        }
        return cmin == 0;
    }
}