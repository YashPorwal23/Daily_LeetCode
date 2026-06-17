1class Solution {
2    public String processStr(String s) {
3        StringBuilder sb = new StringBuilder();
4        for(int i=0;i<s.length();i++){
5            char ch = s.charAt(i);
6            if(Character.isLowerCase(ch)){
7            sb.append(ch);
8            }
9            else if(ch=='#'){
10                sb.append(sb);
11            }
12            else if(ch=='%'){
13                sb.reverse();
14            }
15            else{
16                if(sb.length()>0){
17                sb.deleteCharAt(sb.length()-1);
18                }
19            }
20        }
21        return sb.toString();
22    }
23}