1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<List<Integer>> ans = new ArrayList<>();
4        for(int i=0;i<=rowIndex;i++){
5            ArrayList<Integer> al = new ArrayList<>();
6            for(int j=0;j<=i;j++){
7                if(j==0 ||j==i){
8                    al.add(1);
9                }
10                else{
11                    al.add(ans.get(ans.size()-1).get(j-1)+ans.get(ans.size()-1).get(j));
12                }
13            }
14            ans.add(al);
15        }
16        return ans.get(ans.size()-1);
17    }
18}