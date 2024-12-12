package org.example.hashfunctions;

public class DoubleHashing implements IHashingMethods{
    private Integer[] hashTable;
    private int tableSize;

    public DoubleHashing(int size){
        this.tableSize = size;
        hashTable = new Integer[tableSize];
        for (int i = 0; i < tableSize; i++) {
            hashTable[i] = null;
        }
    }
    @Override
    public void insert(int key) {
        int hash1 = key % tableSize;
        int hash2 = (hash1%6 + key) % tableSize;
        for(int i = 0; i < tableSize; i++){
            if (hashTable[hash2] == null){
                hashTable[hash2] = key;
                return;
            }
            hash2 = (hash2+1)%tableSize;
        }
        throw new ArrayStoreException("Storage Full");
    }

    @Override
    public void display() {
        System.out.println("Double Hashing Display");
        for(int i = 0; i < tableSize; i++){
            System.out.println(i + ":" + hashTable[i]);
        }
        System.out.println("////");
    }
}
