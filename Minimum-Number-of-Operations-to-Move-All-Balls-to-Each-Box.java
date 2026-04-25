1class Solution {
2    public int[] minOperations(String boxes) {
3        int ans[] = new int[boxes.length()];
4        for(int i=0;i<boxes.length();i++){
5            int temp = 0;
6            for(int j=0;j<boxes.length();j++){
7                if(j!=i){
8                    if(boxes.charAt(j)=='1'){
9                        temp=temp+(Math.abs(i-j));
10                    }
11                }
12            }
13            ans[i]=temp;
14        }
15        return ans;
16    }
17}