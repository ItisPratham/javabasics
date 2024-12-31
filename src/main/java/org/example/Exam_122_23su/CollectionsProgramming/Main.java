package org.example.Exam_122_23su.CollectionsProgramming;

import java.util.*;

public class Main {
    public static Set<String> studentsTaught(Map<String, Map<Integer, String>> m, String Instructor){
        Set<String> ans = new TreeSet<>();
        for(String name : m.keySet()){
            for(Integer i : m.get(name).keySet()){
                if(m.get(name).get(i).equals(Instructor)){
                    ans.add(name);
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Map<String, Map<Integer, String>> m = new HashMap<>();
        Map<Integer, String> coltonMap = new HashMap<>();
        coltonMap.put(163, "Kevin");
        Map<Integer, String> darelMap = new HashMap<>();
        darelMap.put(416, "Hunter");
        darelMap.put(373, "Kevin");
        darelMap.put(143, "Kevin");
        Map<Integer, String> benMap = new HashMap<>();
        benMap.put(373, "Kevin");
        benMap.put(143, "Stuart");
        Map<Integer, String> atharvaMap = new HashMap<>();
        atharvaMap.put(121, "Miya");
        atharvaMap.put(122, "Hunter");
        atharvaMap.put(123, "Brett");
        m.put("Colton", coltonMap);
        m.put("Darel", darelMap);
        m.put("Ben", benMap);
        m.put("Atharva", atharvaMap);

        System.out.println(m);

        System.out.println(main.studentsTaught(m, "Kevin"));
    }
}
