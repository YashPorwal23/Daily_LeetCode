1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        int min=Integer.MAX_VALUE;
4        Arrays.sort(arr);
5        for(int i=0;i<arr.length-1;i++){
6            min=Math.min(min,arr[i+1]-arr[i]);
7        }
8        List<List<Integer>> ans = new ArrayList<>();
9        for(int i=0;i<arr.length-1;i++){
10            List<Integer> al = new ArrayList<>();
11            if(arr[i+1]-arr[i]==min){
12                al.add(arr[i]);
13                al.add(arr[i+1]);
14                ans.add(al);
15            }
16        }
17        return ans;
18    }
19}