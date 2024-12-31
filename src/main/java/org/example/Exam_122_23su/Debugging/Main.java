package org.example.Exam_122_23su.Debugging;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public List<Integer> rotateLeftAndNegateEvens(List<Integer> list, int steps){
        if(steps < 0 || list.isEmpty()){
            throw new IllegalArgumentException();
        }
        for(int i = 0; i < steps; i++){
            int valFirst = list.remove(0);
            if(valFirst % 2 == 0){
                list.add(valFirst * -1);
            }
            else{
                list.add(valFirst);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Main main = new Main();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        System.out.println(main.rotateLeftAndNegateEvens(list, 2));
    }
}
