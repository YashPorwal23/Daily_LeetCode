1class Solution {
2    public int maxDistance(int[] colors) {
3        int st = 0;
4        int end = colors.length-1;
5        int ans = 0;
6        while(st<=end){
7            if(colors[st]!=colors[end]){
8                ans=Math.max(ans,end-st);
9            }
10            st++;
11        }
12        st=0;
13        end = colors.length-1;
14        while(st<=end){
15            if(colors[st]!=colors[end]){
16                ans=Math.max(ans,end-st);
17            }
18            end--;
19        }
20        return ans;
21    }
22}