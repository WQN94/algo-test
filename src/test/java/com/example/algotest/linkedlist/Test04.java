package com.example.algotest.linkedlist;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 第4题
 *
 * 给定一个头节点为 head 的链表用于记录一系列核心肌群训练项目编号，请查找并返回倒数第 cnt 个训练项目编号。
 * 示例 1：
 * 输入：head = [2,4,7,8], cnt = 1
 * 输出：8
 *
 * 提示：
 * 1 <= head.length <= 100
 * 0 <= head[i] <= 100
 * 1 <= cnt <= head.length
 */
@SpringBootTest
public class Test04 {
    /**
     * 初始化： 前指针 former 、后指针 latter ，双指针都指向头节点 head  。
     * 构建双指针距离： 前指针 former 先向前走 cnt 步（结束后，双指针 former 和 latter 间相距 cnt 步）。
     * 双指针共同移动： 循环中，双指针 former 和 latter 每轮都向前走一步，直至 former 走过链表 尾节点 时跳出
     *              （跳出后，latter 与尾节点距离为 cnt−1，即 latter 指向倒数第 cnt 个节点）。
     * 返回值： 返回 latter 即可。
     *
     * @param head
     * @param cnt
     * @return
     */
    @Test
    public ListNode trainingPlan(ListNode head, int cnt) {
        ListNode former = head;
        ListNode latter = head;
        for (int i = 0; i < cnt; i++) {
            former = former.next;
        }
        while (former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
}
