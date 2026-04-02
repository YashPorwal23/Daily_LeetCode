1class Solution {
2    public int firstMatchingIndex(String s) {
3        int st = 0;
4        int end = s.length()-1;
5        while(st<=end){
6            if(s.charAt(st)==s.charAt(end)){
7                return st;
8            }
9            st++;
10            end--;
11        }
12        return -1;
13    }
14}