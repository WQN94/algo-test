package com.example.algotest.linkedlist;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Node {
    int val;
    Node next, random;
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
