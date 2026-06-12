1class Solution {
2    public boolean consecutiveSetBits(int n) {
3        String s = Integer.toBinaryString(n);
4        boolean chk = false;
5        for(int i=0;i<s.length()-1;i++){
6            if(s.charAt(i)=='1'&& s.charAt(i+1)=='1'){
7                if(chk){
8                    return false;
9                }
10                chk=true;
11            }
12        }
13        return chk;
14    }
15}