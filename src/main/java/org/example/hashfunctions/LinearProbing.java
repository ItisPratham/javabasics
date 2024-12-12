package org.example.hashfunctions;

public class LinearProbing implements IHashingMethods{
    private Integer[] hashTable;
    private int tableSize;

    public LinearProbing(int size){
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
            hash = (hash+1)%tableSize;
        }
        throw new ArrayStoreException("Storage Full");
    }

    @Override
    public void display(){
        System.out.println("Linear Display");
        for(int i = 0; i < tableSize; i++){
            System.out.println(i + ":" + hashTable[i]);
        }
        System.out.println("////");
    }


//    @Override
//    public boolean search(int key) {
//        int hash = key % tableSize;
//        for(int i = 0; i < tableSize; i++){
//            if(hashTable[hash] == key){
//                return true;
//            }
//            hash = (hash+1)%tableSize;
//        }
//        return false;
//    }

//    @Override
//    public void delete(int key){
//        int hash = key % tableSize;
//        for(int i = 0; i < tableSize; i++){
//            if(hashTable[hash] == key){
//                hashTable[hash] = null;
//                System.out.println(key + " Deleted");
//                return;
//            }
//            hash = (hash+1)%tableSize;
//        }
//        System.out.println(key + "Not found");
//    }
}
