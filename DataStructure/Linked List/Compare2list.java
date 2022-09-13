import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode n1 = head1;
        SinglyLinkedListNode n2 = head2;
        int i =0;
        while (n1!=null) {
            i++;
            n1 =n1.next;
        }
        int size1 = i;
        i=0;
        while (n2!=null) {
            i++;
            n2 =n2.next;
        }
        n1=head1;
        n2=head2;
        int size2 = i;
        if(size1 == size2){
            while(n1!=null&&n2!=null){
                if(n1.data==n2.data){
                    n1 = n1.next;
                    n2 = n2.next;    
                }
                else{
                    return false;
                }
            }
            return true;       
        }
        return false;
        
        
        
    }

    private static final Scanner scanner = new Scanner(System.in);
