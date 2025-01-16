package org.example.exam09_01_25;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueuesProgramming {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("august");
        q.add("cornelia street");
        q.add("bejeweled");
        q.add("cardigan");
        q.add("afterglow");
        System.out.println("Before : "+q);// given in question paper
        alphabetize(q);
        System.out.println("After : "+q);
    }
    public static void s2q(Stack<String> s, Queue<String> q) {// given
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void q2s(Queue<String> q, Stack<String> s) {// given
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }
    public static void alphabetize(Queue<String> q){ // created static method to avoid need to create an instance
        if(q.isEmpty()){
            return;
        }
        Stack<String> s = new Stack<>();
        while(!q.isEmpty()) {
            String temp = q.poll();
            while(!s.isEmpty() && temp.charAt(0) > s.peek().charAt(0)){
                q.offer(s.pop());//currently if the first letter is same, original sequence is not maintained. Need to solve it.
            }
            s.push(temp);
        }
        s2q(s, q);
    }
}
