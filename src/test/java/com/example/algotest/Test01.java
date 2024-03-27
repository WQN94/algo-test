package com.example.algotest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.LinkedList;

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

    @Test
    public ListNode deleteNode(ListNode head, int val) {
        return null;
    }
}
