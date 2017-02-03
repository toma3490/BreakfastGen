package com.android.toma.breakfastgenerator.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Food {

//    public static int nextId = 0;
    @SerializedName("name_en")
    @Expose
    private String title;
    @SerializedName("cooking_time")
    @Expose
    private int cookingTime;
    @SerializedName("ingredients_en")
    @Expose
    private Ingredients ingredients;
    private int foodImage;
    private int id;

//    public Food(String title, int cookingTime, Ingredients ingredients, int foodImage) {
//        this.title = title;
//        this.cookingTime = cookingTime;
//        this.ingredients = ingredients;
//        this.foodImage = foodImage;
//        this.id = ++nextId;
//    }

    public String getTitle() {
        return title;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public int getCookingTime() {
        return cookingTime;
    }

//    public void setCookingTime(int cookingTime) {
//        this.cookingTime = cookingTime;
//    }

    public Ingredients getIngredients() {
        return ingredients;
    }

//    public void setIngredients(Ingredients ingredients) {
//        this.ingredients = ingredients;
//    }

    public int getFoodImage() {
        return foodImage;
    }

//    public void setFoodImage(int foodImage) {
//        this.foodImage = foodImage;
//    }

    public int getId() {
        return id;
    }
}
