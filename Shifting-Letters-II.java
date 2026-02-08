1class Solution {
2    public String shiftingLetters(String s, int[][] shifts) {
3        int arr[] = new int[s.length()+1];
4        for(int i=0;i<shifts.length;i++){
5            int st = shifts[i][0];
6            int end = shifts[i][1];
7            int dir = shifts[i][2];
8            if(dir==1){
9                arr[st]+=1;
10                arr[end+1]-=1;
11            }
12            else{
13                arr[st]-=1;
14                arr[end+1]+=1;
15            }
16        }
17        int curr=0;
18        StringBuilder sb = new StringBuilder();
19        for(int i=0;i<s.length();i++){
20            curr+=arr[i];
21            curr=(curr%26);
22            if(curr<0){
23                curr+=26;
24            }
25            int val = s.charAt(i)-'a';
26            int val2 = (curr+val)%26;
27            char ch = (char)(val2+'a');
28            sb.append(ch);
29        }
30        return sb.toString();
31    }
32}