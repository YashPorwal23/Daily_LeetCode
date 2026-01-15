1class Solution {
2    public int wateringPlants(int[] plants, int capacity) {
3        int ans=0;
4        int temp=capacity;
5        for(int i=0;i<plants.length;i++){
6            if(plants[i]<=capacity){
7                ans++;
8            }
9            else{
10                capacity=temp;
11                ans=ans+(i-0)+(i+1);
12            }
13            capacity-=plants[i];
14        }
15        return ans;
16    }
17}