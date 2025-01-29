package org.example.heap;

import java.util.ArrayList;

public class MyNormalQueue implements MyQueue{
    private ArrayList<Integer> arr = new ArrayList<>();
    private int size = 0;
    @Override
    public int poll() {
        if(this.size < 1){
            throw new RuntimeException("Empty Queue");
        }
        size--;
        return arr.remove(0);
    }

    @Override
    public void offer(int element) {
        arr.add(element);
        size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int peek() {
        if (size == 0) {
            throw new RuntimeException("Empty Queue");
        }
        return arr.get(0);
    }

    @Override
    public void print() {
        System.out.println(arr);
    }
}
