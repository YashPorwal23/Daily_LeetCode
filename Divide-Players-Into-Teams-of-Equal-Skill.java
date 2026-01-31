1class Solution {
2    public long dividePlayers(int[] skill) {
3        Arrays.sort(skill);
4        int st=1;
5        int end=skill.length-2;
6        long sum=skill[st-1]+skill[end+1];
7        long ans=skill[st-1]*skill[end+1];
8        while(st<end){
9            if(skill[st]+skill[end]==sum){
10                ans=ans+(skill[st]*skill[end]);
11            }
12            else{
13                return -1;
14            }
15            st++;
16            end--;
17        }
18        return ans;
19    }
20}