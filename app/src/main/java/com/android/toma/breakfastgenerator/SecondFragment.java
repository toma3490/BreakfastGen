package com.android.toma.breakfastgenerator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.android.toma.breakfastgenerator.controller.FoodController;
import com.android.toma.breakfastgenerator.entity.Food;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private RecyclerView recyclerView;
    private ListAdapter adapter;
    private FoodController controller;
    private LinearLayoutManager linearLayoutManager;
    private Button reGenerate;

    private int index;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        index = getArguments().getInt("index");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.second_fragment, container, false);

        linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        controller = new FoodController();
        setDataInAdapter();
        recyclerView.setLayoutManager(linearLayoutManager);

        reGenerate = (Button) view.findViewById(R.id.reGenerate);
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
