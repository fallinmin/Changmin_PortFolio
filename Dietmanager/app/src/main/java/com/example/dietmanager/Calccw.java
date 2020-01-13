package com.example.dietmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calccw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calccw);
        Button calcwBtn = (Button) findViewById(R.id.button3);
        calcwBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text11 = (EditText) findViewById(R.id.editText6);
                EditText text12= (EditText) findViewById(R.id.editText7);
                EditText text13 = (EditText) findViewById(R.id.editText8);
                TextView test3 = (TextView) findViewById(R.id.textView19);

                double che = Integer.parseInt(text11.getText().toString());
                double ki = Integer.parseInt(text12.getText().toString());
                double age = Integer.parseInt(text13.getText().toString());

                double kicho = 655.1+(9.56*che)+(1.85*ki) - (4.68 *age);
                String num2 = String.format("%.1f", kicho);
                test3.setText("기초 대사량" + num2+"kcal입니다");
            }
        });

    }
}
