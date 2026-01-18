1class Solution {
2    public List<Integer> findLonely(int[] nums) {
3        HashMap<Integer,Integer> mp = new HashMap<>();
4        ArrayList<Integer> al = new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
7        }
8        for(int i=0;i<nums.length;i++){
9            if(mp.get(nums[i])==1){
10                if(!mp.containsKey(nums[i]-1)&&!mp.containsKey(nums[i]+1)){
11                    al.add(nums[i]);
12                }
13            }
14        }
15        return al;
16    }
17}