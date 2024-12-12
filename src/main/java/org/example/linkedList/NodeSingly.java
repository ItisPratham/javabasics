package org.example.linkedList;

public class NodeSingly {
    private int data;
    private NodeSingly next;

    public NodeSingly(int data){
        this.data = data;
        this.next = null;
    }
    public NodeSingly(int data, NodeSingly next){
        this.data = data;
        this.next = next;
    }
    public int getData(){
        return data;
    }
    public void setNext(NodeSingly next){
        this.next = next;
    }
    public NodeSingly getNext(){
        return next;
    }
}