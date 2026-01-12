1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3        HashSet<Integer> set1 = new HashSet<>();
4        HashSet<Integer> set2 = new HashSet<>();
5        int ans[] = new int[A.length];
6        int c=0;
7        for(int i=0;i<A.length;i++){
8            if(A[i]==B[i]){
9                c++;
10            }
11            if(set2.contains(A[i])){
12                c++;
13            }
14            if(set1.contains(B[i])){
15                c++;
16            }
17            set1.add(A[i]);
18            set2.add(B[i]);
19            ans[i]=c;
20        }
21        return ans;
22    }
23}