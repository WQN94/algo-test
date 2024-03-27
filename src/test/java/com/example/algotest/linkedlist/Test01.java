package com.example.algotest.linkedlist;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 力扣：图解算法数据结构
 * 链表部分练习
 * 地址：https://leetcode.cn/leetbook/read/illustration-of-algorithm/7fpt1m/
 */

/**
 * 第一题
 *
 * 书店店员有一张链表形式的书单，每个节点代表一本书，节点中的值表示书的编号。
 *     为更方便整理书架，店员需要将书单倒过来排列，就可以从最后一本书开始整理，逐一将书放回到书架上。请倒序返回这个书单链表。
 *     示例 1：
 *     输入：head = [3,6,4,1]
 *     输出：[1,4,6,3]
 *     提示：
 *     0 <= 链表长度 <= 10000
 */
@SpringBootTest
public class Test01 {
    ArrayList<Integer> tmp = new ArrayList<>();

    public int[] reverseBookList(ListNode head) {
        // 递归实现
        /*recu(head);
        int[] res = new int[tmp.size()];
        for (int i = 0; i< res.length; i++) {
            res[i] = tmp.get(i);
        }*/

        // 先进后出，用栈实现
        LinkedList<Integer> tmp = new LinkedList<>();
        while (head != null) {
            tmp.addLast(head.val);
            head = head.next;
        }
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = tmp.removeLast();
        }

        return res;
    }

    public void recu(ListNode head) {
        if (head == null) {
            return;
        }
        recu(head.next);
        tmp.add(head.val);
    }
}
