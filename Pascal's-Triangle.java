1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> ans = new ArrayList<>();
4        for(int i=0;i<numRows;i++){
5            ArrayList<Integer> al = new ArrayList<>();
6            for(int j=0;j<=i;j++){
7                if(j==0 || j==i){
8                    al.add(1);
9                }
10                else{
11                    List<Integer> temp = ans.get(ans.size()-1);
12                    al.add(temp.get(j-1)+temp.get(j));
13                }
14            }
15            ans.add(al);
16        }
17        return ans;
18    }
19}