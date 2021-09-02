package easy;

public class RemoveLinkedListElements {
    int val;
    RemoveLinkedListElements next;

    RemoveLinkedListElements() {
    }

    RemoveLinkedListElements(int val) {
        this.val = val;
    }

    RemoveLinkedListElements(int val, RemoveLinkedListElements next) {
        this.val = val;
        this.next = next;
    }
}


class Solution203 {
    public RemoveLinkedListElements removeElements(RemoveLinkedListElements head, int val) {

        if (head == null || (head.next == null && head.val != val)) {
            return head;
        }


        RemoveLinkedListElements ret = removeElements(head.next, val);


        if (head.val == val) {
            head.next = null;
        } else {
            head.next = ret;
            ret = head;
        }


        return ret;

    }
}