package com.android.toma.breakfastgenerator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.toma.breakfastgenerator.controller.FoodController;
import com.android.toma.breakfastgenerator.entity.Food;

import java.util.ArrayList;

public class Fragment_2 extends Fragment {

    private RecyclerView mRecyclerView;
    private MyAdapter mAdapter;
    private static FoodController mController;
    private ArrayList<Food> mList;
    private LinearLayoutManager mLinearLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment2, container, false);

        mLinearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mController = new FoodController();
        mList = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            mList.add("item = " + i);
//        }
        mAdapter = new MyAdapter(getContext(), mList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        return view;
    }

    public ArrayList<Food> getIndex(int i){
        mList = mController.generateBreakfast(i);
        return mList;
    }
}
