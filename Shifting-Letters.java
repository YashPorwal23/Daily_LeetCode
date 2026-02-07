1class Solution {
2    public String shiftingLetters(String s, int[] shifts) {
3      int arr[] = new int[shifts.length];
4      long sum  = 0;
5      for(int x:shifts){
6        sum+=x;
7      }
8      for(int i=1;i<shifts.length;i++){
9        shifts[i]= (shifts[i]+shifts[i-1])%26;
10      }
11      arr[0]=(int)((sum)%26);
12      for(int i=1;i<shifts.length;i++){
13        arr[i]=(int)((sum-shifts[i-1])%26);
14      }
15      StringBuilder sb = new StringBuilder();
16      for(int i=0;i<s.length();i++){
17        int val =s.charAt(i)-'a';
18        int val2=(val+arr[i])%26;
19        char ch= (char)(val2+'a');
20        sb.append(ch);
21      }
22      return sb.toString();
23    }
24}