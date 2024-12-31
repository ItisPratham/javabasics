package org.example.Exam_122_23su.ObjectsProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DineInRestaurant implements Restaurant{

    private String name;
    private String cuisine;
    private List<String> menu;
    private int star;
    private int startTime;
    private int endTime;
    private int capacity;
    private Map<Integer, Integer> map;

    private void populateMap(int startTime, int endTime){
        for (int i = startTime; i < endTime; i += 100) {
            map.put(i, 0);
        }
    }

    public DineInRestaurant(String name){
        this.name = name;
        this.cuisine = "NA";
        this.menu = new ArrayList<>();
        this.star = 4;
        this.startTime = 1100;
        this.endTime = 2300;
        this.map = new HashMap<>();
        populateMap(startTime, endTime);
        this.capacity = 5;
    }

    public DineInRestaurant(String name, String cuisine, int star, int startTime, int endTime, int capacity){
        this.name = name;
        this.cuisine = cuisine;
        this.menu = new ArrayList<>();
        this.star = star;
        this.startTime = startTime;
        this.endTime = endTime;
        this.map = new HashMap<>();
        populateMap(startTime, endTime);
        this.capacity = capacity;

    }

    @Override
    public String getName() {
        return "Name is " + name;
    }

    @Override
    public String getCuisine() {
        return "Cuisine is " + cuisine;
    }

    @Override
    public List<String> getMenu() {
        return menu;
    }

    @Override
    public void addFoodItem(String foodName) {
        for(String list : menu){
            if(foodName.equals(list)){
                return;
            }
        }
        menu.add(foodName);
    }

    @Override
    public void removeFoodItem(String foodName) {
        for(String list : menu){
            if(foodName.equals(list)){
                menu.remove(foodName);
                return;
            }
        }
        throw new IllegalArgumentException("Item doesn't exist");
    }

    @Override
    public int getNumFoodItems() {
        return menu.size();
    }

    @Override
    public String makeReservation(String time) {
        int intTime = Integer.parseInt(time);

        if (intTime < startTime || intTime + 100 > endTime) {
            return "Sorry the restaurant is open between " + startTime + " to " + endTime;
        }
        for (int i = intTime; i < intTime + 100; i++) {
            if (map.getOrDefault(i, 0) >= capacity) {
                return "Sorry, we are at full capacity at " + time;
            }
        }
        for (int i = intTime; i < intTime + 100; i++) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return "Reservation Confirmed! for time " + time;
    }

    @Override
    public boolean hasMoreOptions(Restaurant other) {
        return menu.size() > other.getNumFoodItems();
    }
}
