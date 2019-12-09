package com.example.pubgmobilehacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                nextacv();
                finish();
            }
        },3000);
    }

    public void nextacv(){
        Intent intent=new Intent(LogActivity.this, ListActivity.class);
        startActivity(intent);
    }
}
