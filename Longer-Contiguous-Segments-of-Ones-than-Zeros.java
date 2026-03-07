1class Solution {
2    public boolean checkZeroOnes(String s) {
3        int ans1=0;
4        int ans2=0;
5        int one = 0;
6        int zero= 0;
7        for(int i=0;i<s.length();i++){
8            if(s.charAt(i)=='1'){
9                one++;
10                ans2=Math.max(ans2,zero);
11                zero=0;
12            }
13            else{
14                zero++;
15                ans1=Math.max(ans1,one);
16                one=0;
17            }
18        }
19        ans1=Math.max(ans1,one);
20        ans2=Math.max(ans2,zero);
21        if(ans1>ans2) return true;
22        return false;
23    }
24}