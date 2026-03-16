1class Solution {
2    public String trimTrailingVowels(String s) {
3        int idx = s.length();
4        for(int i=s.length()-1;i>=0;i--){
5            if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&& s.charAt(i)!='u'){
6                idx=i;
7                break;
8            }
9        }
10        if(idx==s.length())return "";
11        return s.substring(0,idx+1);
12    }
13}