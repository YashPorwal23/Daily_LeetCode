1class Solution {
2    public int minSetSize(int[] nums) {
3        HashMap<Integer,Integer> mp = new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
6        }
7        ArrayList<Integer> al = new ArrayList<>();
8        for(var e:mp.entrySet()){
9            al.add(e.getValue());
10        }
11        Collections.sort(al,Collections.reverseOrder());
12        int ans = 0;
13        int temp = 0;
14        int c = 0; 
15        while(temp<nums.length/2){
16            temp+=al.get(c++);
17            ans++;
18        }
19        return ans;
20    }
21}