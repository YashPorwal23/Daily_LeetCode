class Solution {
    public int[] resultArray(int[] nums) {
      ArrayList<Integer> al1 = new ArrayList<>();  
      ArrayList<Integer> al2 = new ArrayList<>();
      al1.add(nums[0]);
      al2.add(nums[1]);
      for(int i=2;i<nums.length;i++){
        if(al1.get(al1.size()-1)>al2.get(al2.size()-1)){
            al1.add(nums[i]);
        }
        else{
            al2.add(nums[i]);
        }
      }
      int ans [] = new int[al1.size()+al2.size()];
      int c=0;
      for(int i=0;i<al1.size();i++){
        ans[i]=al1.get(i);
        c++;
      }
      int k=0;
      for(int i=c;i<ans.length;i++){
        ans[i]=al2.get(k++);
      }
      return ans; 
    }
}