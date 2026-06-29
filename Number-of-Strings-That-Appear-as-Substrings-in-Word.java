1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int c=0;
4        for(int i=0;i<patterns.length;i++){
5            String s = patterns[i];
6            if(word.contains(s)){
7                c++;
8            }
9        }
10        return c;
11    }
12}