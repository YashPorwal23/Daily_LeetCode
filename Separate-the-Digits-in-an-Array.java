1class Solution {
2    public int[] separateDigits(int[] nums) {
3        ArrayList<Integer> al = new ArrayList<>();
4        for(int i=0;i<nums.length;i++){
5            String s = Integer.toString(nums[i]);
6            for(int j =0;j<s.length();j++){
7            al.add(Character.getNumericValue(s.charAt(j)));
8            }
9        }
10        int[] arr = new int[al.size()];
11        for (int i=0;i<al.size();i++) {
12            arr[i]=al.get(i);
13        }
14        return arr;
15    }
16}