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
12    public int pairSum(ListNode head) {
13        int c = 0 ;
14        ListNode temp = head;
15        while(temp!=null){
16            c++;
17            temp=temp.next;
18        }
19        ListNode dummy = new ListNode(0);
20        ListNode tail = dummy;
21        temp = head;
22        while(temp!=null){
23            tail.next = new ListNode(temp.val);
24            tail=tail.next;
25            temp=temp.next;
26        }
27        int p = 0;
28        int ans = 0;
29        ListNode rev = reverse(dummy);
30        while(p<(c/2) && (head!=null && rev!=null)){
31            int sum = head.val+rev.val;
32            ans = Math.max(ans,sum);
33            head=head.next;
34            rev=rev.next;
35        }
36        return ans;
37    }
38    public ListNode reverse(ListNode data){
39        ListNode prev = null;
40        ListNode curr = data;
41        while(curr!=null){
42            ListNode next = curr.next;
43            curr.next = prev;
44            prev=curr;
45            curr=next;
46        }
47        return prev;
48    }
49}