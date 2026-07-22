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
    public ListNode swapPairs(ListNode head) {
        
        ListNode curr = head;
        int count=0;
        if(head==null)return null;
        while(curr!=null){
            count++;
            curr=curr.next;
        }

        
        curr=head;
        ListNode[] swaped = new ListNode[count];
        for(int i=0;i<count;i++){
            swaped[i]=curr;
            curr=curr.next;
        }
        for(int i=0;i+1<count;i=i+2){
            ListNode temp = swaped[i];
            
            swaped[i] = swaped[i+1];
            swaped[i+1]=temp;
        }
        for(int i=0;i<count-1;i++){
            
            swaped[i].next=swaped[i+1];
        }
        
        swaped[count-1].next=null;
        return swaped[0];
    }
}