package com.android.toma.breakfastgenerator.controller;

import com.android.toma.breakfastgenerator.R;
import com.android.toma.breakfastgenerator.entity.Dish;
import com.android.toma.breakfastgenerator.entity.Drink;
import com.android.toma.breakfastgenerator.entity.Food;
import com.android.toma.breakfastgenerator.entity.Ingredients;

import java.util.ArrayList;

import static android.R.attr.category;

public class PrimitiveDB {

    private static ArrayList<Food> firstCategoryDishes = new ArrayList<>();
    private static ArrayList<ArrayList<Food>> secondCategoryDishes = new ArrayList<>();
    private static ArrayList<Food> drinks = new ArrayList<>();

    static {
//         Ingredients food 1 category
        Ingredients ingrDish0 = new Ingredients();
        ingrDish0.addIngr("Pancakes");
        ingrDish0.addIngr("Jam");
        Ingredients ingrDish1 = new Ingredients();
        ingrDish1.addIngr("Pancakes");
        ingrDish1.addIngr("Banana");
        ingrDish1.addIngr("Nutella");
        Ingredients ingrDish2 = new Ingredients();
        ingrDish2.addIngr("Muesli");
        ingrDish2.addIngr("Nuts");
        Ingredients ingrDish3 = new Ingredients();
        ingrDish3.addIngr("Eggs");
        ingrDish3.addIngr("Vegetables");
        Ingredients ingrDish4 = new Ingredients();
        ingrDish4.addIngr("Bread");
        ingrDish4.addIngr("Egg");
        ingrDish4.addIngr("Tomato");
        ingrDish4.addIngr("Cheese");
        Ingredients ingrDish5 = new Ingredients();
        ingrDish5.addIngr("Cottage cheese");
        ingrDish5.addIngr("Jam");
        Ingredients ingrDish6 = new Ingredients();
        ingrDish6.addIngr("Yogurt");
        ingrDish6.addIngr("Jam");

        // Dishes
        Dish dish0 = new Dish("Pancakes with jam", 30, ingrDish0, R.drawable.cat1d0);
        Dish dish1 = new Dish("Pancakes with banana and nutella", 30, ingrDish1, R.drawable.cat1d1);
        Dish dish2 = new Dish("Muesli with nuts", 15, ingrDish2, R.drawable.cat1d2);
        Dish dish3 = new Dish("Omelet with vegetables", 25, ingrDish3, R.drawable.cat1d3);
        Dish dish4 = new Dish("Egg-bread with tomato and cheese", 20, ingrDish4, R.drawable.cat1d4);
        Dish dish5 = new Dish("Cottage cheese with jam", 5, ingrDish5, R.drawable.cat1d5);
        Dish dish6 = new Dish("Yogurt with jam", 5, ingrDish6, R.drawable.cat1d6);

        // Add dishes to list
        firstCategoryDishes.add(dish0);
        firstCategoryDishes.add(dish1);
        firstCategoryDishes.add(dish2);
        firstCategoryDishes.add(dish3);
        firstCategoryDishes.add(dish4);
        firstCategoryDishes.add(dish5);
        firstCategoryDishes.add(dish6);
    }

    static {
        // Ingredients food 2 category
        Ingredients ingrDish0 = new Ingredients();
        ingrDish0.addIngr("Egg");
        Ingredients ingrDish1 = new Ingredients();
        ingrDish1.addIngr("Bread");
        ingrDish1.addIngr("Butter");
        Ingredients ingrDish2 = new Ingredients();
        ingrDish2.addIngr("Bread");
        ingrDish2.addIngr("Processed cheese");
        ingrDish2.addIngr("Tomato");
        Ingredients ingrDish3 = new Ingredients();
        ingrDish3.addIngr("Bread");
        ingrDish3.addIngr("Tuna");
        Ingredients ingrDish4 = new Ingredients();
        ingrDish4.addIngr("Bread");
        ingrDish4.addIngr("Egg");
        ingrDish4.addIngr("Cheese");
        Ingredients ingrDish5 = new Ingredients();
        ingrDish5.addIngr("Bread");
        ingrDish5.addIngr("Butter");
        ingrDish5.addIngr("Processed cheese");
        Ingredients ingrDish6 = new Ingredients();
        ingrDish6.addIngr("Bread");
        ingrDish6.addIngr("Peanut butter");

        // Dishes
        Dish dish0 = new Dish("Boiled egg", 10, ingrDish0, R.drawable.cat2d0);
        Dish dish1 = new Dish("Fried egg", 10, ingrDish0, R.drawable.cat2d1);
        Dish dish2 = new Dish("Sandwich with butter", 5, ingrDish1, R.drawable.cat2d2);
        Dish dish3 = new Dish("Sandwich with processed cheese and tomato", 5, ingrDish2, R.drawable.cat2d3);
        Dish dish4 = new Dish("Sandwich with tuna", 5, ingrDish3, R.drawable.cat2d4);
        Dish dish5 = new Dish("Egg toast with cheese", 10, ingrDish4, R.drawable.cat2d5);
        Dish dish6 = new Dish("Toast with processed cheese", 10, ingrDish5, R.drawable.cat2d6);
        Dish dish7 = new Dish("Sandwich with peanut butter", 5, ingrDish6, R.drawable.cat2d7);

        ArrayList<Food> firstDish = new ArrayList<>();
        firstDish.add(dish0);
        firstDish.add(dish1);
        ArrayList<Food> secondDish = new ArrayList<>();
        secondDish.add(dish2);
        secondDish.add(dish3);
        secondDish.add(dish4);
        secondDish.add(dish5);
        secondDish.add(dish6);
        secondDish.add(dish7);

        // Add dishes to list
        secondCategoryDishes.add(firstDish);
        secondCategoryDishes.add(secondDish);
    }

    static {
        // Ingredients drinks
        Ingredients ingrDrink0 = new Ingredients();
        ingrDrink0.addIngr("Black Tea");
        ingrDrink0.addIngr("Lemon");
        ingrDrink0.addIngr("Sugar");
        Ingredients ingrDrink1 = new Ingredients();
        ingrDrink1.addIngr("Green Tea");
        ingrDrink1.addIngr("Lemon");
        ingrDrink1.addIngr("Sugar");
        Ingredients ingrDrink2 = new Ingredients();
        ingrDrink2.addIngr("Coffee");
        ingrDrink2.addIngr("Milk");
        ingrDrink2.addIngr("Sugar");
        Ingredients ingrDrink3 = new Ingredients();
        ingrDrink3.addIngr("Cocoa");
        ingrDrink3.addIngr("Milk");
        ingrDrink3.addIngr("Sugar");
        Ingredients ingrDrink4 = new Ingredients();
        ingrDrink4.addIngr("Fruit juice");
        Ingredients ingrDrink5 = new Ingredients();
        ingrDrink5.addIngr("Milk");

        // Drinks
        Drink drink0 = new Drink("Black tea with lemon", 10, ingrDrink0, R.drawable.drink0);
        Drink drink1 = new Drink("Green tea with lemon", 10, ingrDrink1, R.drawable.drink1);
        Drink drink2 = new Drink("Coffee with milk", 10, ingrDrink2, R.drawable.drink2);
        Drink drink3 = new Drink("Cocoa with milk", 10, ingrDrink3, R.drawable.drink3);
        Drink drink4 = new Drink("Fruit juice", 2, ingrDrink4, R.drawable.drink4);
        Drink drink5 = new Drink("Hot or cold milk", 2, ingrDrink5, R.drawable.drink5);

        // Add dishes to list
        drinks.add(drink0);
        drinks.add(drink1);
        drinks.add(drink2);
        drinks.add(drink3);
        drinks.add(drink4);
        drinks.add(drink5);
    }

    public PrimitiveDB() {
    }

    public ArrayList<Food> getFirstCategoryDishes(){
        return firstCategoryDishes;
    }

    public ArrayList<Food> getSecondCategoryDishesFirstDish(){
        return secondCategoryDishes.get(0);
    }

    public ArrayList<Food> getSecondCategoryDishesSecondDish(){
        return secondCategoryDishes.get(1);
    }

    public ArrayList<Food> getDrinks(){
        return drinks;
    }
}
