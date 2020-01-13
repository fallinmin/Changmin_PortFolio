package com.example.dietmanager;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, splash_activity.class));

        ImageButton computeBtn = (ImageButton) findViewById(R.id.imageButton);
        computeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comintent1 = new Intent(MainActivity.this, compute.class);
                startActivity(comintent1);
            }
        });
        ImageButton calcBtn = (ImageButton) findViewById(R.id.imageButton4);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calcintent2 = new Intent(MainActivity.this, Calcc.class);
                startActivity(calcintent2);
            }
        });
        ImageButton notiBtn = (ImageButton) findViewById(R.id.imageButton3);
        notiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent notiintent3 = new Intent(MainActivity.this, notice.class);
                startActivity(notiintent3);
            }
        });
        ImageButton recBtn = (ImageButton) findViewById(R.id.imageButton2);
        recBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recintent = new Intent(MainActivity.this, record1.class);
                startActivity(recintent);
            }
        });
        ImageButton aboBtn = (ImageButton) findViewById(R.id.imageButton5);
        aboBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abointent = new Intent(MainActivity.this, about.class);
                startActivity(abointent);

            }
        });






    }
}
