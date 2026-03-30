1class Solution {
2    public boolean checkStrings(String s1, String s2) {
3        int len1 = s1.length()/2;
4        int len2 = s1.length()/2;
5        if(s1.length()%2!=0){
6            len1++;
7        }
8        char a[] = new char[len1];
9        char b[] = new char[len1];
10        char c[] = new char[len2];
11        char d[] = new char[len2];
12        int idx = 0;
13        for(int i=0;i<s1.length();i+=2){
14            a[idx] = s1.charAt(i);
15            b[idx++] = s2.charAt(i);
16        }
17        idx=0;
18        for(int i=1;i<s1.length();i+=2){
19            c[idx] = s1.charAt(i);
20            d[idx++] = s2.charAt(i);
21        }
22        Arrays.sort(a);
23        Arrays.sort(b);
24        Arrays.sort(c);
25        Arrays.sort(d);
26        return Arrays.equals(a,b)&&Arrays.equals(c,d);
27    }
28}