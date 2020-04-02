package Day20;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Partition {

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(4);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(2);
        partition(head,3);
    }

    public static ListNode partition(ListNode pHead, int x) {
        // write code here
        if(pHead == null){
            return null;
        }
        ListNode newHead = null;
        ListNode cur = null;
        ListNode tmp = pHead;
        for (;pHead != null;pHead = pHead.next){
            ListNode newNode = new ListNode(pHead.val);
            if(pHead.val < x){
                if (newHead == null){
                    newHead = newNode;
                    cur = newNode;
                }else {
                    cur.next = newNode;
                    cur = newNode;
                }

            }
        }
        for (;tmp != null;tmp = tmp.next){
            ListNode newNode = new ListNode(tmp.val);
            if(tmp.val >= x){
                if (newHead == null){
                    newHead = newNode;
                    cur = newNode;
                }else {
                    cur.next = newNode;
                    cur = newNode;
                }
            }
        }
        return newHead;
    }
}
