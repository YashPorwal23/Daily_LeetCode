class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int c = 1;
        while(true){
            if(!set.contains(k*c)){
                return k*c;
            }
            c++;
        }
    }
}