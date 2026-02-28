1class Solution {
2    public int[] minDistinctFreqPair(int[] nums) {
3        HashMap<Integer,Integer> mp = new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
6        }
7        ArrayList<Integer> al = new ArrayList<>(mp.keySet());
8        if(al.size()<2){
9            return new int[]{-1,-1};
10        }
11        Collections.sort(al);
12        int frq = mp.get(al.get(0));
13        int arr[] = new int[2];
14        arr[0]=al.get(0);
15        for(int i=1;i<al.size();i++){
16            if(mp.get(al.get(i))!=frq){
17                arr[1]=al.get(i);
18                break;
19            }
20        }
21        if(arr[0]==0||arr[1]==0){
22            return new int[]{-1,-1};
23        }
24        return arr;
25    }
26}