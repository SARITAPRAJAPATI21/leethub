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
    public ListNode rotateRight(ListNode head, int k) {
      if(head==null)  return null;

      
      ListNode lastnode;
      ListNode  breaknode;
      int size=0;
      ListNode temp=head;

      while(temp.next!=null){
          size++;
          temp=temp.next;
      }
       if(k%(size+1)==0)  return head;   //same list
   
     k=k%(size+1);// change the k value according to list size 

      lastnode=temp;

      temp=head;
      for(int i=0;i<size-k;i++){
      temp=temp.next;
      }
      
      breaknode=temp;
      

      lastnode.next=head;
      head=breaknode.next;
      breaknode.next=null;

      return head;
  }
    
    
   
}