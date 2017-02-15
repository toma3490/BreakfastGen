package com.android.toma.breakfastgenerator.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.android.toma.breakfastgenerator.R;
import com.android.toma.breakfastgenerator.adapter.ListAdapter;
import com.android.toma.breakfastgenerator.controller.FoodController;
import com.android.toma.breakfastgenerator.entity.Food;

import java.util.ArrayList;

public class ResultScreen extends Fragment {

    public static final String BASE_URL = "http://52.26.27.71:8080";

    private RecyclerView recyclerView;
    private FoodController controller;
    private ListAdapter adapter;
    private LinearLayoutManager linearLayoutManager;
    private ArrayList<Food> foodList;

    private int index;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        index = getArguments().getInt("index");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_result, container, false);
        linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

//        Retrofit.Builder builder = new Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create());
//        Retrofit retrofit = builder.build();
//        FoodAdviserClient client = retrofit.create(FoodAdviserClient.class);
//        Call<JSONResponse> call = client.getDrinks();
////        Call<ArrayList<Food>> call = client.getFirstCategoryDishes();
//        call.enqueue(new Callback<JSONResponse>() {
//            @Override
//            public void onResponse(Call<JSONResponse> call, Response<JSONResponse> response) {
//                JSONResponse jsonResponse = response.body();
//                foodList = new ArrayList<>(jsonResponse.getFoodList());
//                adapter = new ListAdapter(getContext(), foodList);
//                recyclerView.setLayoutManager(linearLayoutManager);
//                recyclerView.setAdapter(adapter);
//            }
//            @Override
//            public void onFailure(Call<JSONResponse> call, Throwable t) {
//                Toast.makeText(getContext(), "Error", Toast.LENGTH_SHORT).show();
//            }
//        });

        controller = new FoodController();
        setDataInAdapter();
        recyclerView.setLayoutManager(linearLayoutManager);

        ImageButton reGenerate = (ImageButton) view.findViewById(R.id.reGenerate);
        reGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDataInAdapter();
            }
        });

        return view;
    }

    private void setDataInAdapter() {
        adapter = new ListAdapter(getContext(), getIndex(index));
        recyclerView.setAdapter(adapter);
    }

    public ArrayList<Food> getIndex(int i){
        return controller.generateBreakfast(i);
    }
}
