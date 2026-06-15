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
12    public ListNode deleteMiddle(ListNode head) {
13        if(head==null || head.next==null){
14            return null;
15        }
16        ListNode temp = head;
17        int c=0;
18        while(temp!=null){
19            c++;
20            temp=temp.next;
21        }
22        int mid = c/2;
23        temp = head;
24        c=0;
25        while(temp!=null){
26            c++;
27            if(c==mid){
28                temp.next=temp.next.next;
29                break;
30            }
31            temp=temp.next;
32        }
33        return head;
34    }
35}
36