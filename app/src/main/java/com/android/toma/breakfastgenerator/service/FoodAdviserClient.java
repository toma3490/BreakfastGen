package com.android.toma.breakfastgenerator.service;

import com.android.toma.breakfastgenerator.entity.Food;
import com.android.toma.breakfastgenerator.entity.JSONResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FoodAdviserClient {
    @GET("api/drink/")
    Call<JSONResponse> getDrinks();
    @GET("api/dish/main/")
    Call<ArrayList<Food>> getFirstCategoryDishes();
}
