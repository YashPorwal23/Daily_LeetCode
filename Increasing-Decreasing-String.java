1class Solution {
2    public String sortString(String s) {
3        HashMap<Character,Integer> mp = new HashMap<>();
4        for(int i=0;i<s.length();i++){
5            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
6        }
7        StringBuilder sb = new StringBuilder();
8        while(mp.size()!=0){
9           for(char ch ='a';ch<='z';ch++){
10            if(mp.containsKey(ch)){
11                sb.append(ch);
12                if(mp.get(ch)==1){
13                    mp.remove(ch);
14                }
15                else{
16                    mp.put(ch,mp.get(ch)-1);
17                }
18            }
19           }
20           for(char ch ='z';ch>='a';ch--){
21            if(mp.containsKey(ch)){
22                sb.append(ch);
23                if(mp.get(ch)==1){
24                    mp.remove(ch);
25                }
26                else{
27                    mp.put(ch,mp.get(ch)-1);
28                }
29            }
30           }  
31        }
32        return sb.toString();
33    }
34}