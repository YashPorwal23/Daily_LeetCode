1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3      HashSet<Character> set = new HashSet<>();
4      int l = 0;
5      int ans = 0;
6      for(int i=0;i<s.length();i++){
7        while(set.contains(s.charAt(i))){
8            set.remove(s.charAt(l++));
9        }
10        set.add(s.charAt(i));
11        ans=Math.max(ans,i-l+1);
12      }
13      return ans;  
14    }
15}