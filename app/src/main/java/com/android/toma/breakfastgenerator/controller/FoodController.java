package com.android.toma.breakfastgenerator.controller;

import com.android.toma.breakfastgenerator.entity.Food;

import java.util.ArrayList;

public class FoodController extends ControllerImpl<Food> {

    PrimitiveDB primitiveDB = new PrimitiveDB();

    @Override
    public int indexGenerator(ArrayList<Food> list) {
        return super.indexGenerator(list);
    }

    @Override
    public Food getByIndex(ArrayList<Food> list, int index) {
        return super.getByIndex(list, index);
    }

    public ArrayList<Food> generateBreakfast(int i){
        ArrayList<Food> breakfast = new ArrayList<>();
        switch (i){
            case 0:
                ArrayList<Food> firstCategoryDishes = primitiveDB.getFirstCategoryDishes();
                int foodIndex = indexGenerator(firstCategoryDishes);
                breakfast.add(getByIndex(firstCategoryDishes, foodIndex));
                ArrayList<Food> drinks = primitiveDB.getDrinks();
                int drinkIndex = indexGenerator(drinks);
                breakfast.add(getByIndex(drinks, drinkIndex));
                return breakfast;
            case 1:
                ArrayList<Food> secondCategoryDishesFirstDish = primitiveDB.getSecondCategoryDishesFirstDish();
                int foodIndex1 = indexGenerator(secondCategoryDishesFirstDish);
                breakfast.add(getByIndex(secondCategoryDishesFirstDish, foodIndex1));
                ArrayList<Food> secondCategoryDishesSecondDish = primitiveDB.getSecondCategoryDishesSecondDish();
                int foodIndex2 = indexGenerator(secondCategoryDishesSecondDish);
                breakfast.add(getByIndex(secondCategoryDishesSecondDish, foodIndex2));
                ArrayList<Food> drinks1 = primitiveDB.getDrinks();
                int drinkIndex1 = indexGenerator(drinks1);
                breakfast.add(getByIndex(drinks1, drinkIndex1));
                return breakfast;
            case 2:
                return generateBreakfast(randomGenerator(2));
        }
        return breakfast;
    }
}
