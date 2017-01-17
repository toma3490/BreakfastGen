package com.android.toma.breakfastgenerator.controller;

import com.android.toma.breakfastgenerator.entity.Dish;
import com.android.toma.breakfastgenerator.entity.Drink;
import com.android.toma.breakfastgenerator.entity.Ingredients;

import java.util.ArrayList;

public class PrimitiveDB {

    private static ArrayList<Dish> first_category_dishes = new ArrayList<>();
    private static ArrayList<ArrayList<Dish>> second_category_dishes = new ArrayList<>();
    private static ArrayList<Drink> drinks = new ArrayList<>();

    static {
        // Ingredients
        Ingredients ingr_dish_0 = new Ingredients();
        ingr_dish_0.addIngr("Pancakes");
        ingr_dish_0.addIngr("Jam");
        Ingredients ingr_dish_1 = new Ingredients();
        ingr_dish_1.addIngr("Pancakes");
        ingr_dish_1.addIngr("Banana");
        ingr_dish_1.addIngr("Nutella");
        Ingredients ingr_dish_2 = new Ingredients();
        ingr_dish_2.addIngr("Muesli");
        ingr_dish_2.addIngr("Nuts");
        Ingredients ingr_dish_3 = new Ingredients();
        ingr_dish_3.addIngr("Eggs");
        ingr_dish_3.addIngr("Vegetables");
        Ingredients ingr_dish_4 = new Ingredients();
        ingr_dish_4.addIngr("Bread");
        ingr_dish_4.addIngr("Egg");
        ingr_dish_4.addIngr("Tomato");
        ingr_dish_4.addIngr("Cheese");
        Ingredients ingr_dish_5 = new Ingredients();
        ingr_dish_5.addIngr("Cottage cheese");
        ingr_dish_5.addIngr("Jam");
        Ingredients ingr_dish_6 = new Ingredients();
        ingr_dish_6.addIngr("Yogurt");
        ingr_dish_6.addIngr("Jam");

        // Dishes
        Dish dish_0 = new Dish("Pancakes with jam", 30, ingr_dish_0, 1);
        Dish dish_1 = new Dish("Pancakes with banana and nutella", 30, ingr_dish_1, 1);
        Dish dish_2 = new Dish("Muesli with nuts", 15, ingr_dish_2, 1);
        Dish dish_3 = new Dish("Omelet with vegetables", 25, ingr_dish_3, 1);
        Dish dish_4 = new Dish("Egg-bread with tomato and cheese", 20, ingr_dish_4, 1);
        Dish dish_5 = new Dish("Cottage cheese with jam", 5, ingr_dish_5, 1);
        Dish dish_6 = new Dish("Yogurt with jam", 5, ingr_dish_6, 1);

        // Add dishes to list
        first_category_dishes.add(dish_0);
        first_category_dishes.add(dish_1);
        first_category_dishes.add(dish_2);
        first_category_dishes.add(dish_3);
        first_category_dishes.add(dish_4);
        first_category_dishes.add(dish_5);
        first_category_dishes.add(dish_6);
    }

    static {
        // Ingredients
        Ingredients ingr_dish_0 = new Ingredients();
        ingr_dish_0.addIngr("Egg");
        Ingredients ingr_dish_1 = new Ingredients();
        ingr_dish_1.addIngr("Bread");
        ingr_dish_1.addIngr("Butter");
        Ingredients ingr_dish_2 = new Ingredients();
        ingr_dish_2.addIngr("Bread");
        ingr_dish_2.addIngr("Processed cheese");
        ingr_dish_2.addIngr("Tomato");
        Ingredients ingr_dish_3 = new Ingredients();
        ingr_dish_3.addIngr("Bread");
        ingr_dish_3.addIngr("Tuna");
        Ingredients ingr_dish_4 = new Ingredients();
        ingr_dish_4.addIngr("Bread");
        ingr_dish_4.addIngr("Egg");
        ingr_dish_4.addIngr("Cheese");
        Ingredients ingr_dish_5 = new Ingredients();
        ingr_dish_5.addIngr("Bread");
        ingr_dish_5.addIngr("Butter");
        ingr_dish_5.addIngr("Processed cheese");
        Ingredients ingr_dish_6 = new Ingredients();
        ingr_dish_6.addIngr("Bread");
        ingr_dish_6.addIngr("Peanut butter");

        // Dishes
        Dish dish_0 = new Dish("Boiled egg", 10, ingr_dish_0, 1);
        Dish dish_1 = new Dish("Fried egg", 10, ingr_dish_0, 1);
        Dish dish_2 = new Dish("Sandwich with butter", 5, ingr_dish_1, 1);
        Dish dish_3 = new Dish("Sandwich with processed cheese and tomato", 5, ingr_dish_2, 1);
        Dish dish_4 = new Dish("Sandwich with tuna", 5, ingr_dish_3, 1);
        Dish dish_5 = new Dish("Egg toast with cheese", 10, ingr_dish_4, 1);
        Dish dish_6 = new Dish("Toast with processed cheese", 10, ingr_dish_5, 1);
        Dish dish_7 = new Dish("Sandwich with peanut butter", 5, ingr_dish_6, 1);

        ArrayList<Dish> first_dish = new ArrayList<>();
        first_dish.add(dish_0);
        first_dish.add(dish_1);
        ArrayList<Dish> second_dish = new ArrayList<>();
        second_dish.add(dish_2);
        second_dish.add(dish_3);
        second_dish.add(dish_4);
        second_dish.add(dish_5);
        second_dish.add(dish_6);
        second_dish.add(dish_7);

        // Add dishes to list
        second_category_dishes.add(first_dish);
        second_category_dishes.add(second_dish);
    }

    public PrimitiveDB() {

    }

    public ArrayList<Dish> getFirst_category_dishes(){
        return first_category_dishes;
    }

    public ArrayList<ArrayList<Dish>> getSecond_category_dishes(){
        return second_category_dishes;
    }

    public ArrayList<Drink> getDrinks(){
        return drinks;
    }
}
