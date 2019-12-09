package com.example.pubgmobilehacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageButton inf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.LoginButton); //command to refer to the button we want to work with
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActicity();
            }
        });
        inf=(ImageButton) findViewById(R.id.InfoBtn);
        inf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinfo();
            }
        });
    }

    public void openActicity(){
        Intent intent = new Intent(this, LogActivity.class);
        startActivity(intent);
    }

    public void openinfo(){
        Intent intent= new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
}
