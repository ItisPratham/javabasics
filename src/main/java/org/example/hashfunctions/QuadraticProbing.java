package org.example.hashfunctions;

public class QuadraticProbing implements IHashingMethods{
    private Integer[] hashTable;
    private int tableSize;

    public QuadraticProbing(int size){
        this.tableSize = size;
        hashTable = new Integer[tableSize];
        for (int i = 0; i < tableSize; i++) {
            hashTable[i] = null;
        }
    }

    @Override
    public void insert(int key) {
        int hash = key % tableSize;
        for(int i = 0; i < tableSize; i++){
            if(hashTable[hash] == null){
                hashTable[hash] = key;
                return;
            }
            hash = (hash+(i+1)^2)%tableSize;
        }
        throw new ArrayStoreException("Storage Full");
    }

    @Override
    public void display() {
        System.out.println("Quadratic Display");
        for(int i = 0; i < tableSize; i++){
            System.out.println(i + ":" + hashTable[i]);
        }
        System.out.println("////");
    }
}
