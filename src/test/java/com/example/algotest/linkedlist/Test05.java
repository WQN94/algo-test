package com.example.algotest.linkedlist;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 第5题
 *
 * 给定两个以 有序链表 形式记录的训练计划 l1、l2，分别记录了两套核心肌群训练项目编号，请合并这两个训练计划，按训练项目编号 升序 记录于链表并返回。
 * 注意：新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例 1：
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 *
 * 示例 2：
 * 输入：l1 = [], l2 = []
 * 输出：[]
 *
 * 示例 3：
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 *
 * 提示：
 * 0 <= 链表长度 <= 1000
 */
@SpringBootTest
public class Test05 {
    /**
     * 算法流程：
     * 初始化： 伪头节点 dum ，节点 cur 指向 dum 。
     * 循环合并： 当 l1 或 l2 为空时跳出；
     *          当 l1.val < l2.val 时： cur 的后继节点指定为 l1 ，并 l1 向前走一步；
     *          当 l1.val >= l2.val 时： cur 的后继节点指定为 l2 ，并 l2 向前走一步 ；
     *          节点 cur 向前走一步，即 cur = cur.next 。
     * 合并剩余尾部： 跳出时有两种情况，即 l1 为空 或 l2 为空。
     *              若 l1 != null ： 将 l1 添加至节点 cur 之后；
     *              否则： 将 l2 添加至节点 cur 之后。
     * 返回值： 合并链表在伪头节点 dum 之后，因此返回 dum.next 即可。
     */
    @Test
    public ListNode trainningPlan(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = (l1 == null) ? l2 : l1;
        return dum.next;
    }
}
