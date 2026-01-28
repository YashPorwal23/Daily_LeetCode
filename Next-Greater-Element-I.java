1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        HashMap<Integer,Integer> mp = new HashMap<>();
4        for(int i=0;i<nums2.length;i++){
5            mp.put(nums2[i],i);
6        }
7        Stack<Integer> st = new Stack<>();
8        int temp[] = new int[nums2.length];
9        st.push(nums2[nums2.length-1]);
10        temp[temp.length-1]=-1;
11        for(int i=nums2.length-2;i>=0;i--){
12            while(!st.isEmpty() && st.peek()<=nums2[i]){
13                st.pop();
14            }
15            if(st.isEmpty()){
16                temp[i]=-1;
17            }
18            else{
19                temp[i]=st.peek();
20            }
21            st.push(nums2[i]);
22        }
23        int ans[] = new int[nums1.length];
24        for(int i=0;i<nums1.length;i++){
25            ans[i]=temp[mp.get(nums1[i])];
26        }
27        return ans;
28    }
29}