package org.example.linkedList;

public class Main {
    public static void main(String[] args) {
        SingleLL linkedList = new SingleLL();

        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(20);
        linkedList.insertAtBeginning(30);
        System.out.println("List after inserting at the beginning:");
        linkedList.display();

        linkedList.insertAtEnd(40);
        linkedList.insertAtEnd(50);
        System.out.println("List after inserting at the end:");
        linkedList.display();

        linkedList.insertAtMiddle(25, 2);
        System.out.println("List after inserting 25 at index 2:");
        linkedList.display();

        try {
            linkedList.deleteFromBeginning();
            System.out.println("List after deleting from the beginning:");
            linkedList.display();
        }
        catch(IllegalAccessException e){
            System.out.println(e.getMessage());
        }

        try {
            linkedList.deleteFromEnd();
            System.out.println("List after deleting from the end:");
            linkedList.display();
        }
        catch(IllegalAccessException e){
            System.out.println(e.getMessage());
        }
    }
}
