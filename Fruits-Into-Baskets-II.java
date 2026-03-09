1class Solution {
2    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
3        int c = 0;
4        for(int i=0;i<fruits.length;i++){
5            for(int j =0 ;j<fruits.length;j++){
6                if(fruits[i]<=baskets[j]){
7                    baskets[j]=-1;
8                    c++;
9                    break;
10                }
11            }
12        }
13        return fruits.length-c;
14    }
15}