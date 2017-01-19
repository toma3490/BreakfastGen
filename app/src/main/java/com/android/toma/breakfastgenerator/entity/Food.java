package com.android.toma.breakfastgenerator.entity;

public class Food {
    public static int nextId = 0;
    private String title;
    private int cookingTime;
    private Ingredients ingredients;
    private int foodImage;
    private int id;

    public Food(String title, int cookingTime, Ingredients ingredients, int foodImage) {
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

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        if (cookingTime != food.cookingTime) return false;
        if (foodImage != food.foodImage) return false;
        if (id != food.id) return false;
        if (title != null ? !title.equals(food.title) : food.title != null) return false;
        return ingredients != null ? ingredients.equals(food.ingredients) : food.ingredients == null;

    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + cookingTime;
        result = 31 * result + (ingredients != null ? ingredients.hashCode() : 0);
        result = 31 * result + foodImage;
        result = 31 * result + id;
        return result;
    }
}
