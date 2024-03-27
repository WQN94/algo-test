package com.example.algotest;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ListNode {
    // 节点值
    int val;
    // 后继节点引用
    ListNode next;
    ListNode(int x) { val = x; }
}
