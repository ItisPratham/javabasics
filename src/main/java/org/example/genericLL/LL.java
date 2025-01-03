package org.example.genericLL;

public class LL<T> {
    private class Node {
        Node next;
        T data;

        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public LL(){
        head = null;
    }
    public LL(T data){
        head = new Node(data);
    }
    public void insert(int index, T data){
        if(index < 0){
            throw new IllegalArgumentException("Enter whole number as index only");
        }
        Node newNode = new Node(data);
        if(index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for(int i = 0; i < index-1; i++){
            if(current == null || current.next == null){
                throw new IndexOutOfBoundsException("Index out of bound");
            }
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void remove(int index){
        if(index < 0){
            throw new IllegalArgumentException("Enter whole number as index only");
        }
        if(index == 0){
            head = head.next;
            return;
        }
        Node current = head;
        for(int i = 0; i < index-1; i++){
            if(current == null || current.next == null){
                throw new IndexOutOfBoundsException("Index out of bound");
            }
            current = current.next;
        }
        if(current.next != null) {
            current.next = current.next.next;
        }
    }
    public void remove(T data){
        Node current = head;
        if(current.data.equals(data)){
            current = current.next;
            return;
        }
        while(current.next != null && !current.next.data.equals(data)){
            current = current.next;
        }
        if(current.next == null){
            throw new IllegalArgumentException("Data not found");
        }
        current.next = current.next.next;
    }
    public void reverse(){
        if(head == null){
            return;
        }
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        System.out.println("Reversal done");
    }
    public void print(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

}
