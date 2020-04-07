package Day22;

import java.util.List;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Plus {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
         head.next = new ListNode(4);
         head.next.next = new ListNode(1);
         ListNode b = new ListNode(3);
         b.next = new ListNode(2);
         b.next.next = new ListNode(1);
         ListNode h = plusAB(head,b);
        for (;h != null;h=h.next){
            System.out.print(h.val+" ");
        }
    }
    public static ListNode plusAB(ListNode a, ListNode b) {
        if(a == null){
            return b;
        }
        if (b == null){
            return a;
        }
        int A = 0;
        int B = 0;
        for (int i = 0;a != null;a=a.next,i++){
            A += (a.val*pow(i));
        }
        for (int i = 0;b != null;b=b.next,i++){
            B += (b.val*pow(i));
        }
        int sum = A+B;
        ListNode pHead = null;
        ListNode cur = pHead;
        for (;sum > 0;sum =sum/10){
            ListNode newNode = new ListNode(sum%10);
            if(pHead ==null){
                pHead = newNode;
                cur = newNode;
            }else {
                cur.next = newNode;
                cur = newNode;
            }

        }
        return pHead;
    }
    private static ListNode reverseList(ListNode pHead){
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode prev = null;
        ListNode newHead = null;
        ListNode cur = pHead;
        while (cur != null){
            ListNode next = cur.next;
            if(next == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return newHead;
    }
    private static int pow(int x){
        int sum = 1;
        for (int i=0;i<x;i++){
            sum *=10;
        }
        return sum;
    }
}
