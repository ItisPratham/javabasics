package org.example.linkedList;

import org.example.singleton.Singleton;

public class SingleLL {
    private NodeSingly head;

    private boolean isEmpty() {
        return head == null;
    }

    public SingleLL(){
        head = null;
    }

    public void insertAtBeginning(int data){
        NodeSingly newNode = new NodeSingly(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void insertAtMiddle(int data, int index){
        if(index<0){
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }
        NodeSingly newNode = new NodeSingly(data);
        if(index == 0){
            insertAtBeginning(data);
            return;
        }
        NodeSingly current = head;
        for(int i = 0; i <index-1; i++){
            if(current == null){
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            current = current.getNext();
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    public void insertAtEnd(int data){
        if(isEmpty()){
            insertAtBeginning(data);
            return;
        }
        NodeSingly newNode = new NodeSingly(data);
        NodeSingly current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    public void display() {
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        NodeSingly current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    public void deleteFromBeginning() throws IllegalAccessException {
        if(isEmpty()){
            throw new IllegalAccessException("Cannot delete from empty list");
        }
        head = head.getNext();
        System.out.println("Element deleted");
    }

    public void deleteFromEnd() throws IllegalAccessException {
        if(isEmpty()){
            throw new IllegalAccessException("Cannot delete from empty list");
        }
        if (head.getNext() == null) {
            head = null;
            System.out.println("Element deleted");
            return;
        }

        NodeSingly current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        System.out.println("Element deleted");
    }
}
