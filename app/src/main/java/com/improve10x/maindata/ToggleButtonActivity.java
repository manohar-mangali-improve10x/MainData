package com.improve10x.maindata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        displayToggleButtons();
    }

    private void displayToggleButtons() {
        ToggleButton toggleButtonBtn = findViewById(R.id.toggle_btn);
        ToggleButton toggleButton1Btn = findViewById(R.id.toggle1_btn);
        Button submitBtn = findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(v -> {
        String toggleButton1 =toggleButtonBtn.getText().toString();
        String toggleButton2 =toggleButton1Btn.getText().toString();
        String result =getStatus(toggleButton1,toggleButton2);
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        });
    }

    private String getStatus(String toggleButton1, String toggleButton2) {
        StringBuilder result = new StringBuilder();
        result.append("ToggleButton").append(toggleButton1);
        result.append("\nToggleButton1").append(toggleButton2);
        return String.valueOf(result);
    }
}