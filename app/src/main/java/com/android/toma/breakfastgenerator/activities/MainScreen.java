package com.android.toma.breakfastgenerator.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;

import com.android.toma.breakfastgenerator.R;

public class MainScreen extends Fragment{

    public FragmentTransaction fragmentTransaction;
    public ResultScreen resultScreen;
    private RadioGroup radioGroup;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_choose, container, false);
        resultScreen = new ResultScreen();
        radioGroup = (RadioGroup) view.findViewById(R.id.radioGroup);
        Button generateBtn = (Button) view.findViewById(R.id.generateBtn);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle args = new Bundle();
                args.putInt("index", getIndexById(getCheckedPoint()));
                resultScreen.setArguments(args);
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main, resultScreen);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;
    }

    public int getIndexById (int id){
        int index = -1;
        switch (id) {
            case R.id.firstVar:
                index = 0;
                break;
            case R.id.secondVar:
                index = 1;
                break;
            case R.id.thirdVar:
                index = 2;
                break;
        }
        return index;
    }

    public int getCheckedPoint(){
        return radioGroup.getCheckedRadioButtonId();
    }
}
