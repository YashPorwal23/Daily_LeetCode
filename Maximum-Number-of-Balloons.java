1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        HashMap<Character,Integer> mp = new HashMap<>();
4        for(int i=0;i<text.length();i++){
5            char ch = text.charAt(i);
6            if(ch=='b'||ch=='a'||ch=='l'||ch=='o'||ch=='n'){
7            mp.put(ch,mp.getOrDefault(ch,0)+1);
8            }
9        }
10        if(mp.size()!=5){
11            return 0;
12        }
13        int ans = 0;
14        while(mp.size()==5){
15            if(mp.get('b')==1){
16                mp.remove('b');
17            }
18            else{
19                mp.put('b',mp.get('b')-1);
20            }
21            if(mp.get('a')==1){
22                mp.remove('a');
23            }
24            else{
25                mp.put('a',mp.get('a')-1);
26            }
27            if(mp.get('l')>1){
28            if(mp.get('l')==2){
29                mp.remove('l');
30            }
31            else{
32                mp.put('l',mp.get('l')-2);
33            }
34            }
35            else{
36                return ans;
37            }
38            if(mp.get('o')>1){
39            if(mp.get('o')==2){
40                mp.remove('o');
41            }
42            else{
43                mp.put('o',mp.get('o')-2);
44            }
45            }
46            else{
47                return ans;
48            }
49            if(mp.get('n')==1){
50                mp.remove('n');
51            }
52            else{
53                mp.put('n',mp.get('n')-1);
54            }
55            ans++;
56        }
57        return ans;
58    }
59}