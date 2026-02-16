1class Solution {
2    public int prefixConnected(String[] words, int k) {
3        HashMap<String,Integer> mp = new HashMap<>();
4        int ans = 0;
5        for(int i=0;i<words.length;i++){
6            String s = words[i];
7            if(s.length()>=k){
8                String temp = s.substring(0,k);
9                mp.put(temp,mp.getOrDefault(temp,0)+1);
10            }
11        }
12        for(var e:mp.entrySet()){
13            if(e.getValue()>1){
14                ans++;
15            }
16        }
17        return ans;
18    }
19}