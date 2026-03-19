1class Solution {
2    public List<String> findAndReplacePattern(String[] words, String pattern) {
3        ArrayList<String> al = new ArrayList<>();
4        LinkedHashMap<Character,Integer> mp = new LinkedHashMap<>();
5        for(int i=0;i<pattern.length();i++){
6            mp.put(pattern.charAt(i),mp.getOrDefault(pattern.charAt(i),0)+1);
7        }
8        for(int i=0;i<words.length;i++){
9            LinkedHashMap<Character,Character> mp1 = new LinkedHashMap<>();
10            String s=words[i];
11            for(int j=0;j<s.length();j++){
12            if(!mp1.containsKey(s.charAt(j))){
13                mp1.put(s.charAt(j),pattern.charAt(j));
14            }
15          }
16          if(mp1.size()==mp.size()){
17          StringBuilder sb = new StringBuilder();
18          for(int k=0;k<s.length();k++){
19            sb.append(mp1.get(s.charAt(k)));
20          }
21          if(sb.toString().equals(pattern)){
22            al.add(s);
23          }
24        }
25        }
26        return al;
27    }
28}