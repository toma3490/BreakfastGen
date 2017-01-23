package com.android.toma.breakfastgenerator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.toma.breakfastgenerator.controller.FoodController;

import java.util.ArrayList;

public class Fragment_2 extends Fragment {

    private RecyclerView mRecyclerView;
    private MyAdapter mAdapter;
    private FoodController mController;
    private ArrayList<String> mList;
    private LinearLayoutManager mLinearLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment2, container, false);

        mLinearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mController = new FoodController();
//        TODO mController.generateBreakfast()
        mList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mList.add("item = " + i);
        }
        mAdapter = new MyAdapter(getContext(), mList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        return view;
    }
}
