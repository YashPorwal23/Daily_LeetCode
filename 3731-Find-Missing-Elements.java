class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
            set.add(nums[i]);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                al.add(i);
            }
        }
        return al;
    }
}