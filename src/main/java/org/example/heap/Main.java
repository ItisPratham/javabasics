package org.example.heap;

public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyNormalQueue();
        MyQueue pq = new MyPriorityQueue();
        System.out.println("Size " + q.size());
        System.out.println("Is MyQueue Empty? : " + q.isEmpty());
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println("Peek " + q.peek());
        q.offer(10);
        q.offer(20);
        System.out.println("Size " + q.size());
        System.out.println("Is MyQueue Empty? : " + q.isEmpty());
        q.offer(13);
        q.offer(5);
        q.print();
        System.out.println(q.poll());
        System.out.println(q.poll());
        q.print();

        System.out.println("\n/////////////////////\n");

        System.out.println("Size " + pq.size());
        System.out.println("Is MyQueue Empty? : " + pq.isEmpty());
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);
        System.out.println("Peek " + pq.peek());
        pq.offer(10);
        System.out.println("Size " + pq.size());
        System.out.println("Is MyQueue Empty? : " + pq.isEmpty());
        pq.offer(20);
        pq.offer(13);
        pq.offer(5);
        pq.print();
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        pq.print();
    }
}
