package com.android.toma.breakfastgenerator.entity;

public class Drink extends Food{

//    public Drink(String title, int cookingTime, Ingredients ingredients, int foodImage) {
//        super(title, cookingTime, ingredients, foodImage);
//    }

    @Override
    public String toString() {
        return  '\n' + super.getTitle() +
                ", cooking time=" + super.getCookingTime() +
                " min, ingredients = " + super.getIngredients() + "id = " + super.getId();
    }
}
