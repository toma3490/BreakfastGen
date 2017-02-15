package com.android.toma.breakfastgenerator.activities;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.android.toma.breakfastgenerator.R;

public class SplashScreenActivity extends AppCompatActivity {

    private int SPLASH_TIME = 2000;
    public boolean isOnline(){
        ConnectivityManager manager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (isOnline()){
                    Toast.makeText(SplashScreenActivity.this, "Internet connected", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(SplashScreenActivity.this, "Internet not connected", Toast.LENGTH_SHORT).show();
                }

                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME);
    }
}
