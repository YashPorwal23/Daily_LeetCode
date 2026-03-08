1class Solution {
2    public String findDifferentBinaryString(String[] nums) {
3        ArrayList<String> al = new ArrayList<>();
4        ss(nums.length,al,0,"");
5        HashSet<String> set = new HashSet<>();
6        for(int i=0;i<nums.length;i++){
7            set.add(nums[i]);
8        }
9        for(int i=0;i<al.size();i++){
10            if(!set.contains(al.get(i))){
11                return al.get(i);
12            }
13        }
14        return "";
15    }
16    public void ss(int len,ArrayList<String> al,int val,String k){
17        if(val==len){
18            al.add(k);
19            return;
20        }
21        ss(len,al,val+1,k+"0");
22        ss(len,al,val+1,k+"1");
23    }
24}