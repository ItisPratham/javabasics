package org.example.Exam_122_23su.ObjectsProgramming;

import java.util.ArrayList;
import java.util.List;

public class FastFoodRestaurant implements Restaurant{

    private String name;
    private String cuisine;
    private List<String> menu;

    public FastFoodRestaurant(String name){
        this.name = name;
        this.cuisine = "NA";
        this.menu = new ArrayList<>();
    }

    public FastFoodRestaurant(String name, String cuisine){
        this.name = name;
        this.cuisine = cuisine;
        this.menu = new ArrayList<>();
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
        return "No reservation needed";
    }

    @Override
    public boolean hasMoreOptions(Restaurant other) {
        if(menu.size() > other.getNumFoodItems()){
            return true;
        }
        return false;
    }
}
