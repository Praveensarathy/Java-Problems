    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        SinglyLinkedListNode n = llist;
        SinglyLinkedListNode m = llist;
        while(n.next!=null){
            for(m = n.next;m!=null;m = m.next){
                if(n.data == m.data){
                    n.next = m.next;
                }
            }
            if(n.next!=null){
                n=n.next;    
            }
            
        }
        return llist;
    }
