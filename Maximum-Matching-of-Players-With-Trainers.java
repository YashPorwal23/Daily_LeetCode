1class Solution {
2    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
3        Arrays.sort(players);
4        Arrays.sort(trainers);
5        int st = 0;
6        int end = 0;
7        int ans = 0;
8        while(st<players.length && end<trainers.length){
9            if(players[st]<=trainers[end]){
10                ans++;
11                st++;
12                end++;
13            }
14            else{
15                end++;
16            }
17        }
18        return ans;
19    }
20}