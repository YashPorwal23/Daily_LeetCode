1class Solution {
2    public int largestAltitude(int[] gain) {
3        int x = Math.max(0,gain[0]);
4        for(int i=1;i<gain.length;i++){
5            gain[i] = gain[i]+gain[i-1];
6            x = Math.max(x,gain[i]);
7        }
8        return x;
9    }
10}