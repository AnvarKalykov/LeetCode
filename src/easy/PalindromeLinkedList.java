package easy;

public class PalindromeLinkedList {
    int val;
    PalindromeLinkedList next;
    PalindromeLinkedList() {}
    PalindromeLinkedList(int val) { this.val = val; }
    PalindromeLinkedList(int val, PalindromeLinkedList next) { this.val = val; this.next = next; }
}


class Solution234 {
    static PalindromeLinkedList left;
    public boolean isPalindromeHelper(PalindromeLinkedList node){
        if(node == null){
            return true;
        }
        boolean res = isPalindromeHelper(node.next);
        PalindromeLinkedList right = node;
        if(res == false){
            return false;
        }
        else{
            if(left.val == right.val){
                left = left.next;
                return true;
            }
            else{
                return false;
            }
        }
    }
    public boolean isPalindrome(PalindromeLinkedList head) {
        left = head;
        boolean res = isPalindromeHelper(head);
        return res;
    }
}