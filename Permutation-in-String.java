1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        if(s1.length()>s2.length()) return false; 
4        HashMap<Character,Integer> mp1 = new HashMap<>();
5        for(int i=0;i<s1.length();i++){
6            mp1.put(s1.charAt(i),mp1.getOrDefault(s1.charAt(i),0)+1);
7        }
8        HashMap<Character,Integer> mp2 = new HashMap<>();
9        for(int i=0;i<s1.length();i++){
10            mp2.put(s2.charAt(i),mp2.getOrDefault(s2.charAt(i),0)+1);
11        } 
12        if(mp1.equals(mp2)) return true;
13        int len = s1.length();
14        for(int i=len;i<s2.length();i++){
15            if(mp2.get(s2.charAt(i-len))==1){
16                mp2.remove(s2.charAt(i-len));
17            }
18            else{
19                mp2.put(s2.charAt(i-len),mp2.get(s2.charAt(i-len))-1);
20            }
21            mp2.put(s2.charAt(i),mp2.getOrDefault(s2.charAt(i),0)+1);
22            if(mp1.equals(mp2)){
23                return true;
24            }
25        }
26        return false;
27    }
28}