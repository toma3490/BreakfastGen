package com.android.toma.breakfastgenerator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

public class Fragment_1 extends Fragment{

    public FragmentTransaction mFragmentTransaction;
    public Fragment_2 mFragment_2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        mFragment_2 = new Fragment_2();
        RadioButton firstVar = (RadioButton) view.findViewById(R.id._1_var);
        RadioButton secondVar = (RadioButton) view.findViewById(R.id._2_var);
        RadioButton thirdVar = (RadioButton) view.findViewById(R.id._3_var);
        Button generateBtn = (Button) view.findViewById(R.id.generateBtn);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFragmentTransaction = getFragmentManager().beginTransaction();
                mFragmentTransaction.replace(R.id.main, mFragment_2);
                mFragmentTransaction.addToBackStack(null);
                mFragmentTransaction.commit();
            }
        });

        return view;
    }

}
