package easy;

/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
 */

public class MiddleLinkedList {
    int val;
    MiddleLinkedList next;
    MiddleLinkedList() {}
    MiddleLinkedList(int val) { this.val = val; }
    MiddleLinkedList(int val, MiddleLinkedList next) { this.val = val; this.next = next; }
}

class Solution876 {
    public MiddleLinkedList middleNode(MiddleLinkedList head) {
        MiddleLinkedList temp = head;
        int count = 1;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        int middle = 0;
        if (count % 2 == 0) {
            middle = count / 2;
        } else {
            middle = count / 2 + 1;
        }
        count = 1;
        temp = head;
        while (count != middle) {
            temp = temp.next;
            count++;
        }
        return temp;
    }
}