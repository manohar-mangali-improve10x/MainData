package com.improve10x.maindata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        EditText editTxt = findViewById(R.id.edit_txt);
        EditText edit1Txt = findViewById(R.id.edit1_txt);
        Button buttonSum = findViewById(R.id.add_btn);
       buttonSum.setOnClickListener(v -> {
           String value1 = editTxt.getText().toString();
           String value2 = edit1Txt.getText().toString();
           int a=Integer.parseInt(value1);
           int b=Integer.parseInt(value2);
           int sum=a+b;
           Toast.makeText(this, "Sum  : " + sum, Toast.LENGTH_SHORT).show();
       });
       EditText editText = findViewById(R.id.edit_txt);
       EditText editText1 = findViewById(R.id.edit1_txt);
       Button addBtn = findViewById(R.id.add_btn);
       addBtn.setOnClickListener(v -> {
           String num1 = editText.getText().toString();
           String num2 = editText1.getText().toString();
           float a=Float.parseFloat(num1);
           float b=Float.parseFloat(num2);
           float sub = a-b ;
           Toast.makeText(this, "Subtraction  :" + sub ,Toast.LENGTH_SHORT).show();
       });
        EditText editText2 = findViewById(R.id.edit_txt);
        EditText editText3 = findViewById(R.id.edit1_txt);
        Button addBtn1 = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(v -> {
            String num1 = editText.getText().toString();
            String num2 = editText1.getText().toString();
            int a=Integer.parseInt(num1);
            int b=Integer.parseInt(num2);
            int mult= a*b ;
            Toast.makeText(this, "Multiplication  :" +mult,Toast.LENGTH_SHORT).show();
        });
        }
}