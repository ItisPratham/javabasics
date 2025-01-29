package org.example.heap;

import java.util.ArrayList;

public class MyPriorityQueue implements MyQueue{
    private ArrayList<Integer> arr = new ArrayList<>();
    private int size = 0;

    private void offerHeapify(int index){
        while(index > 0){
            int parent = (index-1)/2;
            if(arr.get(index) <= arr.get(parent)){
                break;
            }
            int temp = arr.get(index);
            arr.set(index, arr.get(parent));
            arr.set(parent, temp);
            index = parent;
        }
    }

    private void pollHeapify(int index){
        int left = 2*index + 1;
        int right = 2*index + 2;
        int max = index;

        if(left < size && arr.get(left) > arr.get(max)){
            max = left;
        }
        if(right < size && arr.get(right) > arr.get(max)){
            max = right;
        }
        if(max != index){
            int temp = arr.get(index);
            arr.set(index, arr.get(max));
            arr.set(max, temp);
            pollHeapify(max);
        }
    }

    @Override
    public int poll() {
        if(this.size < 1){
            throw new RuntimeException("Empty Queue");
        }
        int root = arr.get(0);
        arr.set(0, arr.get(size - 1));
        size--;
        arr.remove(size);
        if(size>0){
            pollHeapify(0);
        }
        return root;
    }

    @Override
    public void offer(int element) {
        arr.add(element);
        size++;
        offerHeapify(size-1);
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
