1class Solution {
2    public int[] sortByBits(int[] arr) {
3
4        Integer[] nums = new Integer[arr.length];
5
6        // convert int[] -> Integer[]
7        for(int i = 0 ; i < arr.length ; i++){
8            nums[i] = arr[i];
9        }
10
11        Arrays.sort(nums, (a, b) -> {
12
13            int countA = Integer.bitCount(a);
14            int countB = Integer.bitCount(b);
15
16            // sort by number of 1 bits
17            if(countA != countB){
18                return countA - countB;
19            }
20
21            // if same bits -> normal ascending
22            return a - b;
23        });
24
25        // convert back to int[]
26        for(int i = 0 ; i < arr.length ; i++){
27            arr[i] = nums[i];
28        }
29
30        return arr;
31    }
32}