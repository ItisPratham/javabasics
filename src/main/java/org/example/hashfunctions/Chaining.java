package org.example.hashfunctions;

import java.util.LinkedList;
import java.util.List;

public class Chaining implements IHashingMethods{
    private LinkedList<Integer>[] hashTable;
    private int tableSize;

    public Chaining(int size){
        this.tableSize  = size;
        hashTable = new LinkedList[tableSize];
        for (int i = 0; i < tableSize; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    @Override
    public void insert(int key) {
        int hash = key%tableSize;
        hashTable[hash].add(key);
    }

    @Override
    public void display() {
        System.out.println("Chaining Display");
        for(int i = 0; i < tableSize; i++){
            System.out.print(i + ": ");
            for(int j : hashTable[i]){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("////");
    }
}
