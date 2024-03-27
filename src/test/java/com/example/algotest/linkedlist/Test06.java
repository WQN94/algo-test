package com.example.algotest.linkedlist;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 第6题
 *
 * 某教练同时带教两位学员，分别以链表 l1、l2 记录了两套核心肌群训练计划，节点值为训练项目编号。
 * 两套计划仅有前半部分热身项目不同，后续正式训练项目相同。请设计一个程序找出并返回第一个正式训练项目编号。如果两个链表不存在相交节点，返回 null 。
 */
@SpringBootTest
public class Test06 {

    /**
     * 算法：
     * 定义两个指针A 和 B，分别指向 l1和 l2 的头节点。走完各自的链表后走对方的链表。
     * 相当于两个指针都分别走了一遍 l1 和 l2，当两个节点相交时(即 A=B )返回其中一个节点即可。否则返回null
     */
    @Test
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;
        while (A != B) {
            A = (A != null) ? A.next : headB;
            B = (B != null) ? B.next : headA;
        }
        return A;
    }
}
