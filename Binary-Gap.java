1class Solution {
2    public int binaryGap(int n) {
3        String s = Integer.toBinaryString(n);
4        int ans = 0;
5        int c = 0;
6        int idx = -1;
7        for(int i=0;i<s.length();i++){
8            if(s.charAt(i)=='1'){
9                if(idx!=-1){
10                    ans=Math.max(ans,i-idx);
11                }
12                idx=i;
13            }
14        }
15        return ans;
16    }
17}