package org.example.genericLL;

public class Main {
    public static void main(String[] args) {
        LL<EngineeringManager> l1 = new LL<>();
        EngineeringManager m1 = new EngineeringManager("Pratham", 100000, "Software");
        EngineeringManager m2 = new EngineeringManager("Nidip", 120000, "AIML");
        EngineeringManager m3 = new EngineeringManager("Jaiveer", 80000, "HR");
        l1.insert(0, m1);
        l1.insert(1, m2);
        l1.insert(2, m3);

        System.out.println("Engineering Managers List:");
        l1.print();

        System.out.println("\nRemoving manager at index 1 (Bob):");
        l1.remove(1);
        l1.print();

        System.out.println("\nReversing the list:");
        l1.reverse();
        l1.print();

        System.out.println("\nRemoving Charlie (Manager with name 'Charlie'):");
        l1.remove(m1);
        l1.print();
    }
}
