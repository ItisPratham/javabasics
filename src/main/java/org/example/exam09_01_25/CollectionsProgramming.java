package org.example.exam09_01_25;

import java.util.*;

public class CollectionsProgramming {
    private String mostPopularHobby(Map<String, TreeSet<String>> m){
        Map<String, Integer> ans = new HashMap<>();
        for(Set<String> h : m.values()){
            for(String a : h){
                ans.put(a, ans.getOrDefault(a, 0) + 1);
            }
        }
        int maxi = 0;
        String sol = "";
        for(String hobby : ans.keySet()){
            int count = ans.get(hobby);
            if(count > maxi){
                maxi = count;
                sol = hobby;
            }
            else if (count == maxi) {
                if(hobby.compareTo(sol) < 0){
                    sol = hobby;
                }
            }
        }
        return sol;
    }

    public static void main(String[] args) {

        Map<String, TreeSet<String>> hobbies = new HashMap<>();

        hobbies.put("Atharva", new TreeSet<>(Set.of("board games", "comedy shows", "hiking", "video gaming")));
        hobbies.put("Chaafen", new TreeSet<>(Set.of("Formula 1", "reading", "traveling", "video gaming")));
        hobbies.put("Jaylyn", new TreeSet<>(Set.of("hiking", "traveling", "video gaming")));
        hobbies.put("Shivani", new TreeSet<>(Set.of("cafes", "music shows")));

        CollectionsProgramming cp = new CollectionsProgramming();
        String mostPopular = cp.mostPopularHobby(hobbies);

        System.out.println("Most Popular Hobby: " + mostPopular);
    }
}
