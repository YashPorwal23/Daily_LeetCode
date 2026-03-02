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
12    public boolean isPalindrome(ListNode head) {
13        ArrayDeque<Integer> st  = new ArrayDeque<>();
14        ListNode temp = head;
15        while(temp!=null){
16            st.push(temp.val);
17            temp=temp.next;
18        }
19        while(head!=null){
20            if(head.val!=st.pop()){
21                return false;
22            }
23            head=head.next;
24        }
25        return true;
26    }
27}