class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> st = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                List<Integer> al = new ArrayList<>();
                int val = -(nums[i]+nums[j]);
                if(st.contains(val)){
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(val);
                    Collections.sort(al);
                    set.add(al);
                }
                else{
                st.add(nums[j]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> curr: set){
            ans.add(curr);
        }
        return ans;
    }
}