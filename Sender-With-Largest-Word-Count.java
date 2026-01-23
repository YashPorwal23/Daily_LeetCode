1class Solution {
2    public String largestWordCount(String[] messages, String[] senders) {
3        HashMap<String,Integer> mp = new HashMap<>();
4        for(int i=0;i<messages.length;i++){
5            String s[] = messages[i].split(" ");
6            if(!mp.containsKey(senders[i])){
7                 mp.put(senders[i],s.length);
8            }
9            else{ 
10            mp.put(senders[i],mp.get(senders[i])+s.length);
11            }
12        }
13        String ans = "";
14        int val = Integer.MIN_VALUE;
15        for(var e:mp.entrySet()){
16            if(e.getValue()>val){
17                val=e.getValue();
18                ans=e.getKey();
19            }
20            else if(e.getValue()==val){
21                String temp=e.getKey();
22                int res=ans.compareTo(temp);
23                if(res>0){
24                    continue;
25                }
26                else{
27                    ans=temp;
28                }
29            }
30        }
31        return ans;
32    }
33}