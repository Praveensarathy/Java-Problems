/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode n = l1;
        int sum,x,y;
        x=y=sum=0;
        ListNode m = l2;

        while(n !=null || m!=null){
            sum = n.val+m.val +x;
            if(sum>9){
                y=x%10;
                list.add(y);
                x = x/10;
            }
            else{
                x=0;
                list.add(sum);
            }
            n=n.next;
            m = m.next;
            
        }
        return list;
    }
}
