1class Solution {
2    public int closestTarget(String[] words, String target, int startIndex) {
3        int ans = Integer.MAX_VALUE;
4        for(int i=0;i<words.length;i++){
5            if(words[i].equals(target)){
6             int dist = Math.abs(i-startIndex);
7             int dist2 = startIndex+words.length-i;
8             int  dist3 = i+words.length-startIndex;
9             int min2 = Math.min(dist2,dist3);
10             ans = Math.min(ans,Math.min(dist,min2));
11
12            }
13        }
14
15        
16
17        if(ans==Integer.MAX_VALUE) return -1;
18        return ans;
19    }
20}