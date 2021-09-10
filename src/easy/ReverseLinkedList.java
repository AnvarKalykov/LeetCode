package easy;

public class ReverseLinkedList {
    int val;
    ReverseLinkedList next;
    ReverseLinkedList() {}
    ReverseLinkedList(int val) { this.val = val; }
    ReverseLinkedList(int val, ReverseLinkedList next) { this.val = val; this.next = next; }
}


class Solution206 {
    public ReverseLinkedList reverseList(ReverseLinkedList head) {
        if(head==null || head.next==null)
            return head;
        ReverseLinkedList nextNode=head.next;
        ReverseLinkedList newHead=reverseList(nextNode);
        nextNode.next=head;
        head.next=null;
        return newHead;
    }
}