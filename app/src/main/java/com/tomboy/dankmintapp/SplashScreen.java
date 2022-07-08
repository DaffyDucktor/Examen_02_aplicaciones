package com.tomboy.dankmintapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable(){
            @Override
                    public void run(){
                startActivity(new Intent(SplashScreen.this, LoginActivity.class));
            }

        }, 2000);
    }

}
