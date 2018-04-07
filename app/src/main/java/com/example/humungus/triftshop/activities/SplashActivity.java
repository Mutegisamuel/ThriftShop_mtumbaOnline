package com.example.humungus.triftshop.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;
import com.example.humungus.triftshop.R;

public class SplashActivity extends AppCompatActivity {

//    splashscreen timer
    private  static int SPLASH_TIME_OUT = 2000;

    private LottieAnimationView animationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        splashscreen code
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainintent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mainintent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
