1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        int arr[] = new int[101];
4        for(int i=0;i<bulbs.size();i++){
5            arr[bulbs.get(i)]++;
6        }
7        List<Integer> al = new ArrayList<>();
8        for(int i=0;i<arr.length;i++){
9            if(arr[i]%2!=0){
10                al.add(i);
11            }
12        }
13        return al;
14    }
15}