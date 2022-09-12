class Result {

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int pos) {
        SinglyLinkedListNode  n = llist;
        int i =1;
        if(pos == 0){
            return llist.next;
        }
        while(pos!=i){
            n=n.next;
            i++;
        }
        n.next = n.next.next;
     
        return llist;
    }
}
