
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    SinglyLinkedListNode rev =null; 
    SinglyLinkedListNode temp = null; 
    SinglyLinkedListNode head = llist;

   while(head!=null){
    temp = head;
    head= head.next;
    temp.next= rev;
    rev = temp; 
}
    return temp;

    }
