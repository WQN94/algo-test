package com.example.test;

import com.example.algotest.AlgoTestApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.PriorityQueue;

/**
 * 堆排序测试
 */
@SpringBootTest(classes = AlgoTestApplication.class)
public class HeapTest {

    @Test
    public void test () {
        PriorityQueue<Object> heap = new PriorityQueue<>();

        heap.add(1);
        heap.add(4);
        heap.add(2);
        heap.add(6);
        heap.add(8);

        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
    }
}
