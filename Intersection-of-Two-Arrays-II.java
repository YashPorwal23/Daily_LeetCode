1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        HashMap<Integer,Integer> mp = new HashMap<>();
4        ArrayList<Integer> al = new ArrayList<>();
5        for(int i=0;i<nums1.length;i++){
6            mp.put(nums1[i],mp.getOrDefault(nums1[i],0)+1);
7        }
8        for(int i=0;i<nums2.length;i++){
9            if(mp.containsKey(nums2[i])&& mp.get(nums2[i])>0){
10                al.add(nums2[i]);
11                mp.put(nums2[i],mp.get(nums2[i])-1);
12            }
13        }
14        int arr[] = new int[al.size()];
15        for(int k=0;k<al.size();k++){
16            arr[k]=al.get(k);
17        }
18        return arr;
19    }
20}