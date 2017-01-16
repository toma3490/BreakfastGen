package com.android.toma.breakfastgenerator.entity;

public class Dish extends Food{

    private String title;
    private int cookingTime;
    private Ingredients ingredients;
    private FoodImage foodImage;
    private int id;

    public Dish(String title, int cookingTime, Ingredients ingredients, FoodImage foodImage) {
        this.title = title;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
        this.foodImage = foodImage;
        this.id = ++nextId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public FoodImage getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(FoodImage foodImage) {
        this.foodImage = foodImage;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dish dish = (Dish) o;

        if (cookingTime != dish.cookingTime) return false;
        if (title != null ? !title.equals(dish.title) : dish.title != null) return false;
        if (ingredients != null ? !ingredients.equals(dish.ingredients) : dish.ingredients != null) return false;
        return foodImage != null ? foodImage.equals(dish.foodImage) : dish.foodImage == null;

    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + cookingTime;
        result = 31 * result + (ingredients != null ? ingredients.hashCode() : 0);
        result = 31 * result + (foodImage != null ? foodImage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return  "title='" + title + '\'' +
                ", cookingTime=" + cookingTime +
                ", ingredients=" + ingredients +
                ", foodImage=" + foodImage;
    }
}
