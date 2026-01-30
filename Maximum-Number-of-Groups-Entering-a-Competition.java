1class Solution {
2    public int maximumGroups(int[] grades) {
3       int c=1;
4       int ans=0;
5       for(int i=0;i<grades.length;i+=c){
6        ans++;
7        c++;
8       }
9       return ans; 
10    }
11}