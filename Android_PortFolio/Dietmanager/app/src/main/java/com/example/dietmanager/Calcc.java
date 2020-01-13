package com.example.dietmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calcc extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcc);
        Button calccBtn = (Button)findViewById(R.id.button2);
        calccBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText text3 = (EditText) findViewById(R.id.dateedit);
                EditText text4 = (EditText) findViewById(R.id.editText4);
                EditText text5 = (EditText) findViewById(R.id.editText5);
                TextView test3 = (TextView) findViewById(R.id.textView16);

                double che = Integer.parseInt(text3.getText().toString());
                double ki = Integer.parseInt(text4.getText().toString());
                double age = Integer.parseInt(text5.getText().toString());

                double kicho = 66.47+(13.75*che)+(5*ki)-(6.76*age);
                String num2 = String.format("%.1f", kicho);
                test3.setText("기초 대사량" + num2+"kcal입니다");
            }
        });
        Button calcwBtn = (Button) findViewById(R.id.calcw);
        calcwBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comintent3 = new Intent(Calcc.this, Calccw.class);
                startActivity(comintent3);
            }
        });


    }
}