package org.example.collection;

import java.util.*;

public class Collection2SetMap {
    public static void main(String[] args) {
        // for 2, 5, 1, 6, 3
        Set<Integer> set1 = new HashSet<>(); // insertion order is not guaranteed
        // based upon hash function //
        Set<Integer> set2 = new TreeSet<>(); // order of tokens would be maintained aka sorted
        // 1, 2, 3, 5, 6 // o(logn)
        Set<Integer> set3 = new LinkedHashSet<>(); //insertion order preserved
        // 2, 5, 1, 6, 3 // o(1) but insertion can be bad

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new TreeMap<>();
        Map<Integer, Integer> map3 = new LinkedHashMap<>();
        //same as set, here key matters not values
        map1.put(1, 2);
    }
}
