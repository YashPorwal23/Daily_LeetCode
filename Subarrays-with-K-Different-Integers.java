1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        return count(nums,k)-count(nums,k-1);
4    }
5    public int count(int nums[],int k){
6        int l=0;
7        int c = 0;
8        HashMap<Integer,Integer> mp = new HashMap<>();
9        for(int i=0;i<nums.length;i++){
10            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
11            while(mp.size()>k){
12                if(mp.get(nums[l])==1){
13                    mp.remove(nums[l++]);
14                }
15                else{
16                    mp.put(nums[l],mp.get(nums[l])-1);
17                    l++;
18                }
19            }
20            c=c+(i-l+1);
21        }
22        return c;
23    }
24}