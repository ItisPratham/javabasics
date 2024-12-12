package org.example.dynamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray arr1 = new DynamicArray();
        DynamicArray arr2 = new DynamicArray(2);

        arr1.size();//default size
        for(int i = 0; i < 5; i++){
            arr1.add(i);
        }
        arr1.size();
        for(int i = 5; i < 10; i++){
            arr1.add(i);
        }
        arr1.size();
        arr1.add(10);
        arr1.size();
        arr1.display();

        System.out.println("//");

        arr2.size();//size 2 as specified
        for(int j = 0; j < 2; j++){
            arr2.add(j);
        }
        arr2.size();
        for(int j = 2; j < 4; j++){
            arr2.add(j);
        }
        arr2.size();
        arr2.add(5);
        arr2.size();
        arr2.display();
    }
}
