package com.example.dietmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class compute extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compute);

        Button buttoncom = (Button) findViewById(R.id.button);
        buttoncom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text1 = (EditText) findViewById(R.id.editText);
                EditText text2 = (EditText) findViewById(R.id.bmiedit);
                TextView BMIText = (TextView) findViewById(R.id.textView7);
                TextView resultText = (TextView) findViewById(R.id.textView8);


                float input1 = Integer.parseInt(text1.getText().toString());
                float input2 = Integer.parseInt(text2.getText().toString());
                float ki = input2 / 100;
                float result = input1 / (ki * ki);
                String num = String.format("%.1f", result);
                if (result < 18.5){
                    BMIText.setText("BMI 수치는" + num);
                    resultText.setText("저체중입니다");}
                else if (result >= 18.5 && result < 23){
                    BMIText.setText("BMI 수치는" + num);
                resultText.setText("표준체중입니다");}
                else if (result >= 23 && result < 25){
                    BMIText.setText("BMI 수치는" + num);
                    resultText.setText("과체중입니다");}
                else if (result >= 25 && result <= 30){
                    BMIText.setText("BMI 수치는" + num);
                resultText.setText("비만체중입니다");}
                else if (result > 30) {
                        BMIText.setText("BMI 수치는" + num);
                        resultText.setText("고도비만입니다");
                    }



            }
            });
        }
    }


