package com.android.toma.breakfastgenerator.service;

import com.android.toma.breakfastgenerator.entity.Food;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FoodAdviserClient {
    @GET("/api/drink/")
    Call<ArrayList<Food>> getDrinks();
}
