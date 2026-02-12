1class Solution {
2    public int longestBalanced(String s) {
3        int ans = 0;
4        for(int i=0;i<s.length();i++){
5         HashMap<Character,Integer> mp = new HashMap<>();
6            for(int j=i;j<s.length();j++){
7                mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
8                int val = mp.get(s.charAt(j));
9                boolean chk = false;
10                for(var e:mp.entrySet()){
11                    if(e.getValue()!=val){
12                        chk=true;
13                        break;
14                    }
15                }
16                if(!chk){
17                    ans=Math.max(ans,j-i+1);
18                }
19            }
20        }
21        return ans;
22    }
23}