1class Solution {
2    public long interchangeableRectangles(int[][] rectangles) {
3        HashMap<Double,Integer> mp = new HashMap<>();
4        long ans = 0;
5        for(int i=0;i<rectangles.length;i++){
6            int wid = rectangles[i][0];
7            int hei = rectangles[i][1];
8            double frac = ((double)wid/hei);
9            if(mp.containsKey(frac)){
10                ans+=mp.get(frac);
11            }
12            mp.put(frac,mp.getOrDefault(frac,0)+1);
13        }
14        return ans;
15    }
16}