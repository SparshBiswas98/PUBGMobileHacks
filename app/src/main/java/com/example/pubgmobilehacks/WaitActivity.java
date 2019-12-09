package com.example.pubgmobilehacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WaitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                nextacv();
                finish();
            }
        },5000);

    }
    public void nextacv(){
        Intent intent=new Intent(WaitActivity.this, bagsala.class);
        startActivity(intent);
    }
}
