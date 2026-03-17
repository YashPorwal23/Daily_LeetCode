1class Solution {
2    public String replaceWords(List<String> al, String s) {
3        Collections.sort(al,(a,b)-> a.length()-b.length());
4        String arr[] = s.split(" ");
5        StringBuilder sb = new StringBuilder();
6        for(int i=0;i<arr.length;i++){
7            boolean chk = false;
8            for(int j=0;j<al.size();j++){
9                if(arr[i].startsWith(al.get(j))){
10                    sb.append(al.get(j));
11                    if(i!=arr.length-1){
12                    sb.append(" ");
13                    }
14                    chk=true;
15                    break;
16                }
17            }
18            if(!chk){
19                sb.append(arr[i]);
20                if(i!=arr.length-1){
21                sb.append(" ");
22                }
23            }
24        }
25        return sb.toString();
26    }
27}
28