package com.android.toma.breakfastgenerator.entity;

import java.util.ArrayList;

public class JSONResponse {
    private ArrayList<Food> foodList = new ArrayList<>();
    public ArrayList<Food> getFoodList(){
        return foodList;
    }
}
