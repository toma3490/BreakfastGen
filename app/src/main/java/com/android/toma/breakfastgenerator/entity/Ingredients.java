package com.android.toma.breakfastgenerator.entity;

import java.util.ArrayList;

public class Ingredients {

    public ArrayList<String> ingredients = new ArrayList<>();

    public void addIngr(String ingredient){
        ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        return " " +
                ingredients;
    }
}
