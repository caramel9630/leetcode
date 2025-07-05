package org.example.算法04.反转链表;

import java.util.List;

public class 反转链表2 {
//    public class ListNode {
//        int val;
//        ListNode next;
//        ListNode() {}
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//    }
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        ListNode dummy = new ListNode(0, head);
//
//        ListNode p0 = dummy;
//        for (int i = 1; i < left; i++) {
//            p0 = p0.next;
//        }
//
//        ListNode pre = null, cur = p0.next;
//        for (int i = 0; i < right - left + 1; i++) {
//            ListNode nxt = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = nxt;
//        }
//
//        p0.next.next = cur;
//        p0.next = pre;
//        return dummy.next;
//    }
}
