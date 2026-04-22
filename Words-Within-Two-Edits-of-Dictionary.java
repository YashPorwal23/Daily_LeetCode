1class Solution {
2    public List<String> twoEditWords(String[] queries, String[] dictionary) {
3        List<String> al = new ArrayList<>();
4        for(int i=0;i<queries.length;i++){
5            String s = queries[i];
6            for(int j=0;j<dictionary.length;j++){
7                int c = 0;
8                String k = dictionary[j];
9                for(int l=0;l<s.length();l++){
10                    if(s.charAt(l)!=k.charAt(l)){
11                        c++;
12                    }
13                }
14                if(c<3){
15                    al.add(s);
16                    break;
17                }
18            }
19        }
20        return al;
21    }
22}