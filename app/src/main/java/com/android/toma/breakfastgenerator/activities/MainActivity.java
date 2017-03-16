package com.android.toma.breakfastgenerator.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.toma.breakfastgenerator.R;
import com.android.toma.breakfastgenerator.fragments.MainScreenFragment;

public class MainActivity extends AppCompatActivity {

    private static final int NOTIFY_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new MainScreenFragment(), MainScreenFragment.class.getSimpleName())
                .commit();


    }


}
