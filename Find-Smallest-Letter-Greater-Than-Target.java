1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        for(int i=0;i<letters.length;i++){
4        char ch = letters[i];
5        if((int)ch>target){
6            return ch;
7        }
8      }
9      return letters[0];     
10    }
11}