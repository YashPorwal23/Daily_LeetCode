1class Solution {
2    public boolean canBeEqual(String s1, String s2) {
3        char a[] = {s1.charAt(0),s1.charAt(2)};
4        char b[] = {s2.charAt(0),s2.charAt(2)};
5        char c[] = {s1.charAt(1),s1.charAt(3)};
6        char d[] = {s2.charAt(1),s2.charAt(3)};
7        Arrays.sort(a);
8        Arrays.sort(b);
9        Arrays.sort(c);
10        Arrays.sort(d);
11        return Arrays.equals(a,b) && Arrays.equals(c,d);
12    }
13}