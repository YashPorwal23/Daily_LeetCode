1class Solution {
2    public List<Integer> findValidElements(int[] nums) {
3        List<Integer> al = new ArrayList<>();
4        if(nums.length==1){
5            al.add(nums[0]);
6            return al;
7        }
8        int lmax[] = new int[nums.length];
9        int rmax[] = new int[nums.length];
10        lmax[0] = nums[0];
11        al.add(nums[0]);
12        for(int i=1;i<nums.length;i++){
13            lmax[i] = Math.max(lmax[i-1],nums[i]);
14        }
15        rmax[rmax.length-1] = nums[nums.length-1];
16        for(int i=nums.length-2;i>=0;i--){
17            rmax[i] = Math.max(rmax[i+1],nums[i]);
18        }
19        for(int i=1;i<nums.length-1;i++){
20            if(nums[i]>lmax[i-1] || nums[i]>rmax[i+1]){
21                al.add(nums[i]);
22            }
23        }
24        al.add(nums[nums.length-1]);
25        return al;
26    }
27}