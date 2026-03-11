1class Solution {
2    public int numberOfSubstrings(String s) {
3      HashMap<Character,Integer> mp = new HashMap<>();
4      int l = 0;
5      int ans = 0;
6      for(int i=0;i<s.length();i++){
7        mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
8        while(mp.size()==3){
9            ans=ans+s.length()-i;
10            if(mp.get(s.charAt(l))==1){
11                mp.remove(s.charAt(l++));
12            }
13            else{
14                mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
15                l++;
16            }
17        }
18      }
19      return ans;  
20    }
21}