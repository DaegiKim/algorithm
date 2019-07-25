package hackerrank.print_the_elements_of_a_linked_list;

public class Solution {
    static void printLinkedList(SinglyLinkedListNode head) {
        if(head != null) {
            System.out.println(head.data);
            printLinkedList(head.next);
        }
    }
}

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
}
