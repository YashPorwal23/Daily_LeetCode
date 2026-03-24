1class Solution {
2    public int findLUSlength(String a, String b) {
3        if(a.equals(b)){
4            return -1;
5        }
6        return Math.max(a.length(),b.length());
7    }
8}