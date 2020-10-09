class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int len = s.length();
        for(int i = 0;i < len - 1;i++){
            int flag = turnToInt(s.charAt(i));
            int flag_next = turnToInt(s.charAt(i+1));
            if(flag >= flag_next ) sum += flag;
            else if(flag < flag_next) sum -= flag;
        }

        return sum + turnToInt(s.charAt(len - 1));
    }
    public int turnToInt(char c){
        int res = 0;
        if(c == 'I') res = 1;
        else if(c == 'V') res = 5;
        else if(c == 'X') res = 10;
        else if(c == 'L') res = 50;
        else if(c == 'C') res = 100;
        else if(c == 'D') res = 500;
        else if(c == 'M') res = 1000;
        return res;
    }
}