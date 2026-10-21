class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){return head;}
        if(head.next == null && head.val == val){return null;}
        ListNode curr = head;
        while(curr.next != null){
            if(head.val == val){
                if(head.next == null){
                    return null;
                }
                head = head.next;
            }
            else if(curr.next.val == val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }
}
