1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder sb = new StringBuilder();
4        for(int i=0;i<words.length;i++){
5            String s  = words[i];
6            int sum = 0;
7            for(int j=0;j<s.length();j++){
8                sum=sum+weights[s.charAt(j)-'a'];
9            }
10            sum=sum%26;
11            sb.append((char)(122-sum));
12        }
13        return sb.toString();
14    }
15}