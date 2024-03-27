package com.example.algotest.linkedlist;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 第三题
 *
 * 给定一个头节点为 head 的单链表用于记录一系列核心肌群训练编号，请将该系列训练编号 倒序 记录于链表并返回。
 *
 * 示例 1：
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 *
 * 示例 2：
 * 输入：head = [1,2]
 * 输出：[2,1]
 *
 * 示例 3：
 * 输入：head = []
 * 输出：[]
 *
 * 提示：
 * 链表中节点的数目范围是 [0, 5000]
 * -5000 <= Node.val <= 5000
 */
@SpringBootTest
public class Test03 {

    @Test
    public void testMain() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        trainningPlan(listNode1);
        System.out.println(listNode1);
    }

    @Test
    public ListNode trainningPlan(ListNode head) {
        // 方法一：双指针
        /*ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;*/

        // 方法2：递归
        return trainningPlanRecur(null, head);
    }

    public ListNode trainningPlanRecur(ListNode pre, ListNode cur){
        if (cur == null) {
            return pre;
        }
        ListNode res = trainningPlanRecur(cur, cur.next);
        cur.next = pre;
        return res;
    }
}
