    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode n = head;
        List<SinglyLinkedListNode> list = new ArrayList<>();
        while(n!=null){
           if(list.contains(n.next)){
               return true;
           } 
           else{
               list.add(n.next);
               n=n.next;
           }
        }
         return false;
        // if(head.next == null){
        //     return false;
        // }
        // while(n!=null){
        //     n= n.next;
        //     if(n.data == head.data){
        //         return true;
        //     }
        //     else
        //         n = n.next;
        // }
      
       
    }
