package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView num1;
    TextView num2;
    EditText firNum;
    EditText secNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Identify activity 2 -> Not Important....!!!!!!!!!!!
        setTitle("My Application");

        //Use get Intent because we have to get values in first activity through second activity
        Intent bSend = getIntent();
        //received activity stored in following variables
        //Use to getIntExtra store integer values
        final int Num1 = bSend.getIntExtra("FirstNum",0);
        final int Num2 = bSend.getIntExtra("SecNum",0);

        num1 = findViewById(R.id.textView5);
        num1.setText("Select your Operation");

        //Get values in first activity in text boxes and store values following variables
        firNum = findViewById(R.id.editTextNumber3);
        //Caught values and display values
        firNum.setText(""+Num1);

        secNum = findViewById(R.id.editTextNumber4);
        secNum.setText(""+Num2);

        //Button Variables Initialize
        Button add = findViewById(R.id.button2);
        Button sub = findViewById(R.id.button4);
        Button multiply = findViewById(R.id.button3);
        Button divide = findViewById(R.id.button5);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resNew =  Num1+ Num2;

                num2 = findViewById(R.id.textView5);
                //concat NUmber in same text view and second step
                num2.setText(Num1+"+"+Num2+"="+resNew);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resNew =  Num1-Num2;

                num2 = findViewById(R.id.textView5);
                //concat NUmber in same text view and second step
                num2.setText(Num1+"-"+Num2+"="+resNew);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resNew =  Num1*Num2;

                num2 = findViewById(R.id.textView5);
                //concat NUmber in same text view and second step
                num2.setText(Num1+"*"+Num2+"="+resNew);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resNew =  Num1/Num2;

                num2 = findViewById(R.id.textView5);
                //concat NUmber in same text view and second step
                num2.setText(Num1+"/"+Num2+"="+resNew);
            }
        });


    }
}