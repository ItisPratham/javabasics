package org.example.Exam_122_23su.StacksQueuesProgramming;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    Main main = new Main();
    Stack<Integer> s = new Stack<>();
    s.push(13);
    s.push(5);
    s.push(12);
    main.mirrorSplit(s);
    }

    public static void mirrorSplit(Stack<Integer> s){
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s1 = new Stack<>();
        int size = s.size();
        for(int i = 0; i < size; i++){
            q.add(s.peek()/2);
            s1.push(s.peek()/2 + s.peek()%2);
            s.pop();
        }
        Queue<Integer> q1 = new LinkedList<>();
        for(int i = 0; i < size; i++){
            q1.add(s1.pop());
        }
        for(int i = 0; i < size; i++){
            q1.add(q.remove());
        }
        q2s(q1, s);
        System.out.println("THE STACK IS : " + s);

    }

    public static void s2q(Stack<Integer> s, Queue<Integer> q) {
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void q2s(Queue<Integer> q, Stack<Integer> s) {
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }
}
