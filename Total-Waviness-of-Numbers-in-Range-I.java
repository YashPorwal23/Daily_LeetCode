1class Solution {
2    public int totalWaviness(int num1, int num2) {
3        int count = 0;
4        for(int i=num1;i<=num2;i++){
5            String  x = i+"";
6            for(int j=1;j<x.length()-1;j++){
7                if((x.charAt(j)-'0'>x.charAt(j-1)-'0') && (x.charAt(j)-'0'>x.charAt(j+1)-'0')){
8                    count++;
9                }
10                if((x.charAt(j)-'0'<x.charAt(j-1)-'0') && (x.charAt(j)-'0'<x.charAt(j+1)-'0')){
11                    count++;
12                }
13            }
14        }
15        return count;
16    }
17}