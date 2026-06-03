1class Solution {
2    public int passwordStrength(String password) {
3        int ans = 0;
4        String s = "";   
5        HashSet<Character> set = new HashSet<>();
6        for(int i=0;i<password.length();i++){
7            if(!set.contains(password.charAt(i))){
8                set.add(password.charAt(i));
9                s+=password.charAt(i);
10            }
11        }
12        for(int i=0;i<s.length();i++){
13            char ch = s.charAt(i);
14            if((int) ch>= 97 && (int)ch<123){
15                ans++;
16            }
17            else if((int)ch>= 65 && (int)ch<91){
18                ans+=2;
19            }
20            else if((int)ch>=48 && (int)ch<58){
21                ans+=3;
22            }
23            else{
24                ans+=5;
25            }
26        }
27        return ans;
28    }
29}