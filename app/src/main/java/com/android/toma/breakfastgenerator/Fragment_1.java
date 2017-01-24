package com.android.toma.breakfastgenerator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Fragment_1 extends Fragment{

    public FragmentTransaction mFragmentTransaction;
    public Fragment_2 mFragment_2;
    private RadioGroup mRadioGroup;
//    TODO public int mCheckedPoint;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        mFragment_2 = new Fragment_2();
        mRadioGroup = (RadioGroup) view.findViewById(R.id.radioGroup);
        RadioButton firstVar = (RadioButton) view.findViewById(R.id._1_var);
        RadioButton secondVar = (RadioButton) view.findViewById(R.id._2_var);
        RadioButton thirdVar = (RadioButton) view.findViewById(R.id._3_var);
        Button generateBtn = (Button) view.findViewById(R.id.generateBtn);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int buttonIndex = getIndexById(getCheckedPoint());
                OnSelectedItemListener listener = (OnSelectedItemListener) getActivity();
                listener.onItemSelected(buttonIndex);
//                Toast.makeText(getActivity(), String.valueOf(buttonIndex), Toast.LENGTH_SHORT).show();
                mFragmentTransaction = getFragmentManager().beginTransaction();
                mFragmentTransaction.replace(R.id.main, mFragment_2);
                mFragmentTransaction.addToBackStack(null);
                mFragmentTransaction.commit();
            }
        });

        return view;
    }

    public int getIndexById (int id){
        int index = -1;
        switch (id) {
            case R.id._1_var:
                index = 0;
                break;
            case R.id._2_var:
                index = 1;
                break;
            case R.id._3_var:
                index = 2;
                break;
        }
        return index;
    }

    public int getCheckedPoint(){
        return mRadioGroup.getCheckedRadioButtonId();
    }

    public interface OnSelectedItemListener{
        void onItemSelected(int index);
    }
}
