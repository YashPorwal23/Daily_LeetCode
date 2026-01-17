1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
3        Arrays.sort(asteroids);
4        long val = mass;
5        for(int i=0;i<asteroids.length;i++){
6            if(val<asteroids[i]){
7                return false;
8            }
9            val+=asteroids[i];
10        }
11        return true;
12    }
13}