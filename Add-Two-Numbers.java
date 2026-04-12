1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummy = new ListNode();
14        ListNode temp = dummy;
15        int sum = 0;
16        int carry = 0;
17        while(l1 !=null && l2!=null){
18             sum = sum+l1.val+l2.val;
19             carry = sum/10;
20                temp.next = new ListNode(sum%10);
21                temp=temp.next;
22                sum = carry; 
23                l1=l1.next;
24                l2=l2.next;
25        }
26        while(l1!=null){
27             sum = sum+l1.val;
28             carry = sum/10;
29             temp.next = new ListNode(sum%10);
30             temp=temp.next;
31             sum = carry; 
32             l1=l1.next;
33        }
34        while(l2!=null){
35             sum = sum+l2.val;
36             carry = sum/10;
37             temp.next = new ListNode(sum%10);
38             temp=temp.next;
39             sum = carry; 
40             l2=l2.next;
41        }
42        if(carry>0){
43            temp.next=new ListNode(carry);
44        }
45        return dummy.next;
46    }
47}