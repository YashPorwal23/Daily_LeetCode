1class Solution {
2    public int[] recoverOrder(int[] order, int[] friends) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int x:friends){
5            set.add(x);
6        }
7        int c=0;
8        for(int i=0;i<order.length;i++){
9            if(set.contains(order[i])){
10                friends[c++]=order[i];
11            }
12        }
13        return friends;
14    }
15}