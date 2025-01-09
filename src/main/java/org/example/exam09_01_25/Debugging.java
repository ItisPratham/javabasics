package org.example.exam09_01_25;

import java.util.*;

public class Debugging {
    public static int removeEvensInRange(List<Integer> list, int start, int end) {
        int count = 0;
        for (int i = start + 1; i < end; i++) {
            int num = list.get(i);
            if (num % 2 == 0) {
                count++;
                list.remove(i);
                i--;//changed this from i++ for part A
                end--;
            }
        }
        return count;
    }
    public static int removeEvensInRangeB(List<Integer> list, int start, int end) {
        int count = 0;
        int i = start + 1;
        while(i<end) {
            int num = list.get(i);
            if (num % 2 == 0) {
                count++;
                list.remove(i);
                end--;
            }
            else{
                i++;// as we only have to increment it if we dont remove the element
            }
        }
        return count;
    }

}
