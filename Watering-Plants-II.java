1class Solution {
2    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
3       int st=0;
4       int end=plants.length-1;
5       int temp1=capacityA;
6       int temp2=capacityB;
7       int c=0;
8        while(st<=end){
9            if(st==end && plants[st]!=0){
10                if(Math.max(temp1,temp2)-plants[st]<0){
11                    c++;
12                }
13                break;
14            }
15            if(plants[st]<=temp1){
16                temp1-=plants[st];
17            }
18            else{
19                c++;
20                temp1=capacityA;
21                temp1-=plants[st];
22            }
23            if(plants[end]<=temp2){
24                temp2-=plants[end];
25            }
26            else{
27                c++;
28                temp2=capacityB;
29                temp2-=plants[end];
30            }
31            st++;
32            end--;
33        }
34        return c;
35    }
36}