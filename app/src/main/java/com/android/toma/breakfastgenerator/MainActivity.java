package com.android.toma.breakfastgenerator;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Fragment_1.OnSelectedItemListener {

    private FragmentManager mManager;
    private FragmentTransaction mTransaction;

    @Override
    public void onItemSelected(int index) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment_2 fragment2 = (Fragment_2) fragmentManager.findFragmentById(R.id.fragment_2);
        if (fragment2 != null){
            fragment2.getIndex(index);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


    }


}
