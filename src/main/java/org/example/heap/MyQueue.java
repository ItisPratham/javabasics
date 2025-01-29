package org.example.heap;

public interface MyQueue {
    int poll();
    void offer(int element);
    int size();
    boolean isEmpty();
    int peek();
    void print();
}
