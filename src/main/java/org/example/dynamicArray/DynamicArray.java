package org.example.dynamicArray;

public class DynamicArray {
    private int arraySize = 5;
    private int currentSize = 0;
    private int[] arr;

    public DynamicArray(){
        arr = new int[arraySize];
    }
    public DynamicArray(int size){
        if(size > 0){
            arr = new int[size];
            arraySize = size;
        }
        else{
            throw new IllegalArgumentException("Size of Array must be a greater than zero");
        }
    }

    private void resize(){
        arraySize *= 2;
        int[] newArr = new int[arraySize];

        for(int i = 0; i < currentSize; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void add(int element){
        if(currentSize < arraySize){
            arr[currentSize] = element;
            currentSize++;
        }
        else{
            resize();
            arr[currentSize] = element;
            currentSize++;
        }
    }

    public void display(){
        for(int i = 0; i < currentSize; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void size(){
        System.out.println("Size of array is " + arr.length);
    }
}
