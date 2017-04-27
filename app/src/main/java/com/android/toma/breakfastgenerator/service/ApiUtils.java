package com.android.toma.breakfastgenerator.service;

public class ApiUtils {
    private ApiUtils(){}
    public static final String BASE_URL = "http://52.26.27.71:8080/";
    public static FoodAdviserClient getFoodAdviserClient(){
        return RetrofitClient.getClient(BASE_URL).create(FoodAdviserClient.class);
    }
}
