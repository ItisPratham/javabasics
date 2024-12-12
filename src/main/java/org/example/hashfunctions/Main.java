package org.example.hashfunctions;

public class Main {
    public static void main(String[] args) {
        IHashingMethods h1 = new Chaining(5);
        h1.insert(10);
        h1.insert(12);
        h1.insert(5);
        h1.insert(1);
        h1.display();

        IHashingMethods h2 = new DoubleHashing(10);
        h2.insert(1);
        h2.insert(7);
        h2.insert(11);
        h2.insert(8);
        h2.insert(2);
        h2.display();

        IHashingMethods h3 = new LinearProbing(5);
        h3.insert(5);
        h3.insert(9);
        h3.insert(14);
        h3.insert(2);
        h3.insert(7);
        h3.display();

        IHashingMethods h4 = new QuadraticProbing(10);
        h4.insert(1);
        h4.insert(8);
        h4.insert(13);
        h4.insert(5);
        h4.insert(11);
        h4.display();
    }
}
