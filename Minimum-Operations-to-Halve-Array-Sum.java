1class Solution {
2    public int halveArray(int[] nums) {
3        PriorityQueue<Double> pq = new PriorityQueue<>((a,b)->Double.compare(b,a));
4        double sum = 0;
5        for(int x:nums){
6            pq.add((double)x);
7            sum+=(double)x;
8        }
9        double val = (double)sum/2;
10        int c=0;
11        while(sum>val){
12            double x = pq.poll();
13            double half = x/2;
14            sum=sum-(x)+half;
15            pq.add(half);
16            c++;
17        }
18        return c;
19    }
20}