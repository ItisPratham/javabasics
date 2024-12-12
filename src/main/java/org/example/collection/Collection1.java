package org.example.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {
        // take a list of list with n list where each list would contain first 10 numbers
        // from all those list now retrieve numbers which has 7 or multiple of 7
        //[7], [14,17], [21,27,28]..
        //total number of elements in the above result
        //odd are linked list
        //evens are array list

        List<List<Integer>> ListList = new LinkedList<>();
        int n = 10;
        int i = 1;

        for(int j = 0; j < n; j++){
            if(j%2 == 0){
                ArrayList<Integer> Array = new ArrayList<>();
                for(int k = 0; k < 10; k++){
                    Array.add(i);
                    i++;
                }
                ListList.add(Array);
            }
            else{
                LinkedList<Integer> LL = new LinkedList<>();
                for(int k = 0; k < 10; k++){
                    LL.add(i);
                    i++;
                }
                ListList.add(LL);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> list: ListList){
            List<Integer> array = new ArrayList<>();
            for(Integer num: list){
                if(num%7 == 0 || (num%10)%7 == 0){
                    array.add(num);
                }
            }
            result.add(array);
        }

        System.out.println("Required result is :");
        System.out.println(result);
        int total =  0;
        for(List<Integer> sub : result){
            total += sub.size();
        }
        System.out.println("Total number of elements are : "+ total);
    }
}
